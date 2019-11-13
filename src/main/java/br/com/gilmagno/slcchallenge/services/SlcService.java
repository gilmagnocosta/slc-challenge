package br.com.gilmagno.slcchallenge.services;

import br.com.gilmagno.slcchallenge.entities.SlcEntity;
import br.com.gilmagno.slcchallenge.exceptions.SlcServiceException;

public interface SlcService {
	SlcEntity getSlcData() throws SlcServiceException;
}
