package br.com.gilmagno.slcchallenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gilmagno.slcchallenge.entities.SlcEntity;
import br.com.gilmagno.slcchallenge.exceptions.SlcServiceException;
import br.com.gilmagno.slcchallenge.services.SlcService;

@RestController
@RequestMapping("api/slc")
public class SlcController {

	@Autowired
	private SlcService slcService;
	
	@GetMapping
	public ResponseEntity<SlcEntity> getSlcService() {
		
		try {
			
			SlcEntity slc = slcService.getSlcData();
			
			return ResponseEntity.ok().body(slc);
			
		} catch (SlcServiceException e) {
			return ResponseEntity.notFound().build();
		}
		
	}
}
