package sopra.monRdv.monrdv;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.monrdv.model.Rdv;
import sopra.monRdv.monrdv.repository.RdvRepository;

@SpringBootTest
class MonRdvApplicationTests {
	
	@Autowired
	private RdvRepository rdvRepo;

	@Test
	void contextLoads() {
		Rdv rdvGyneco = new Rdv();
		rdvGyneco.setDtRdv(new Date());
		rdvGyneco.setTarif(45);
		
		rdvRepo.save(rdvGyneco);
	}

}
