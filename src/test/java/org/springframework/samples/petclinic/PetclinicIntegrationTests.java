package org.springframework.samples.petclinic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.samples.petclinic.repository.VetRepository;

@SpringBootTest
class PetclinicIntegrationTests {

	@Autowired
	private VetRepository vets;

	@Disabled
	void testFindAll() throws Exception {
		vets.findAll();
		vets.findAll(); // served from cache
	}

}
