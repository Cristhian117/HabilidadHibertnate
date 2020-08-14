/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entidad;



import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author joeli
 */


@Entity
public class Habilidad {

	@Id
	@GeneratedValue
	private int id;
	private String nombre;	

	@OneToMany(mappedBy = "habilidad ")
	private List<Raking> raking = new ArrayList<Raking>();
	
	public Habilidad() {
		super();
	}
	public Habilidad(String nombre) {
		super();
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public List<Raking> getRaking() {
		return raking;
	}
	public void setRaking(List<Raking> raking) {
		this.raking = raking;
	}
	@Override
	public String toString() {
		return "Hablilidad [id=" + id + ", nombre=" + nombre + "]";
	}	
}
