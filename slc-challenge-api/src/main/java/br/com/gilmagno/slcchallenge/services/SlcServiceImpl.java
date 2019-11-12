package br.com.gilmagno.slcchallenge.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.gilmagno.slcchallenge.entities.SlcEntity;
import br.com.gilmagno.slcchallenge.exceptions.SlcServiceException;
import br.com.gilmagno.slcchallenge.helpers.XmlHelper;
import br.com.gilmagno.slcchallenge.repositories.SlcRepository;

@Service
public class SlcServiceImpl implements SlcService {
	
	@Autowired
	private SlcRepository slcRepository;
	
	@Override
	public SlcEntity getSlcData() throws SlcServiceException {
		return loadXmlFile();
	}
	
	private SlcEntity loadXmlFile() throws SlcServiceException {
		
		List<SlcEntity> slcEntity = slcRepository.findAll();
		
		if (slcEntity == null || slcEntity.isEmpty()) {
			File file = new File(getClass().getClassLoader().getResource("files/SLC0001-modelo.xml").getFile());
			XmlMapper xmlMapper = new XmlMapper();
			
			String xml;
			try {
				xml = XmlHelper.inputStreamToString(new FileInputStream(file));
				SlcEntity value = xmlMapper.readValue(xml, SlcEntity.class);
				
				return slcRepository.save(value);
				
			} catch (FileNotFoundException e) {
				throw new SlcServiceException("Arquivo XML não encontrado.");
			} catch (JsonProcessingException e) {
				throw new SlcServiceException("Erro de leitura do arquivo XML. Certifique-se de que o arquivo esteja com o conteudo no formato correto.");
			} catch (IOException e) {
				throw new SlcServiceException("Erro na leitura do arquivo XML.");
			}
		}else {
			return slcEntity.get(0);
		}
	}
}
