package org.springframework.samples.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Ken Krebs
 */
@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity {

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

}
