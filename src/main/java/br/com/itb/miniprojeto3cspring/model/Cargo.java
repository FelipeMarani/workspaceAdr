package br.com.itb.miniprojeto3cspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cargo")
public class Cargo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	private String nomeCargo;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeCargo() {
		return nomeCargo;
	}


	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}


	/*@Override
	public String toString() {
		return "Cargo [nomeCargo=" + nomeCargo + "]";
	}*/
	
	
	
	
}
