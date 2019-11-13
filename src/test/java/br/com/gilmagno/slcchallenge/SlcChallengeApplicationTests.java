package br.com.gilmagno.slcchallenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.gilmagno.slcchallenge.entities.BcMsgEntity;
import br.com.gilmagno.slcchallenge.entities.SisMsgEntity;
import br.com.gilmagno.slcchallenge.entities.SlcEntity;
import br.com.gilmagno.slcchallenge.exceptions.SlcServiceException;
import br.com.gilmagno.slcchallenge.repositories.SlcRepository;
import br.com.gilmagno.slcchallenge.services.SlcServiceImpl;

/**
 * Testes unitarios da classe SlcService
 * utilizando JUnit e Mockito
 * @author Gilmagno Costa
 *
 */
@SpringBootTest
class SlcChallengeApplicationTests {

	@Mock
	private SlcRepository slcRepositoryMock;
	
	@InjectMocks
	private SlcServiceImpl slcService;
		
	@Test
	void shouldGetSlcData() throws SlcServiceException {
		
		SlcEntity slcEntityExpected = new SlcEntity();
		slcEntityExpected.setBcMsg(new BcMsgEntity());
		slcEntityExpected.setSisMsg(new SisMsgEntity());
		
		Mockito.when(slcRepositoryMock.save(Mockito.any())).thenReturn(slcEntityExpected);
		SlcEntity slc = slcService.getSlcData();
		
		assertTrue(slc != null);
	}

}
