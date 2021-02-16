package org.springframework.samples.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Simple JavaBean domain object adds a name property to <code>BaseEntity</code>. Used as
 * a base class for objects needing these properties.
 *
 */
@MappedSuperclass
@Getter
@Setter
public class NamedEntity extends BaseEntity {

	private String name;

	@Override
	public String toString() {
		return this.getName();
	}

}
