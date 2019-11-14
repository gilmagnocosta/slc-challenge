package br.com.gilmagno.slcchallenge.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.gilmagno.slcchallenge.entities.SlcEntity;
import br.com.gilmagno.slcchallenge.exceptions.SlcServiceException;
import br.com.gilmagno.slcchallenge.helpers.XmlHelper;
import br.com.gilmagno.slcchallenge.repositories.SlcRepository;

@Service
public class SlcServiceImpl implements SlcService {
	
	private static final String XML_FILE = "files/SLC0001-modelo.xml";
	
	@Autowired
	private SlcRepository slcRepository;
	
	/**
	 * Faz a carga do arquivo XML
	 */
	@Override
	public SlcEntity getSlcData() throws SlcServiceException {
		return loadXmlFile();
	}
	
	/**
	 * Le arquivo XML e grava no banco de dados
	 * @return
	 * @throws SlcServiceException
	 */
	private SlcEntity loadXmlFile() throws SlcServiceException {
		
		List<SlcEntity> slcEntity = slcRepository.findAll();
		
		if (slcEntity != null && !slcEntity.isEmpty()) {
			slcRepository.deleteAll();
		}
		
		InputStream inputStream = this.getClass().getResourceAsStream(XML_FILE);

		String xml;
		
		try {
			xml = XmlHelper.inputStreamToString(inputStream);
			
			XStream xstream = getXStreamObject();
			
			SlcEntity value = (SlcEntity) xstream.fromXML(xml);
			
			return slcRepository.save(value);
			
		} catch (FileNotFoundException e) {
			throw new SlcServiceException("Arquivo XML não encontrado.");
		} catch (JsonProcessingException e) {
			throw new SlcServiceException("Erro de leitura do arquivo XML. Certifique-se de que o arquivo esteja com o conteudo no formato correto.");
		} catch (IOException e) {
			throw new SlcServiceException("Erro na leitura do arquivo XML.");
		}
	}

	/**
	 * Obtem objeto XStream para tratamento de XML
	 * @return
	 */
	private XStream getXStreamObject() {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.processAnnotations(SlcEntity.class);
		
		xstream.registerConverter(new com.thoughtworks.xstream.converters.basic.DateConverter("yyyy-MM-dd", getDateFormats()));
		
		xstream.ignoreUnknownElements();
		
		return xstream;
	}
	
	/**
	 * Obtem formatação de datas do XML
	 * @return Array com formatos de datas
	 */
	private String[] getDateFormats() {
		String[] dateFormats = {"dd/MM/yyyy HH:mm:ss", "dd/MM/yyyy"};
		
		return dateFormats;
	}
}
