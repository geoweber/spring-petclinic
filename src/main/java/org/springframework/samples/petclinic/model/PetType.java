package org.springframework.samples.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.samples.petclinic.model.NamedEntity;

/**
 * @author Juergen Hoeller Can be Cat, Dog, Hamster...
 */
@Entity
public class PetType extends NamedEntity {

}
