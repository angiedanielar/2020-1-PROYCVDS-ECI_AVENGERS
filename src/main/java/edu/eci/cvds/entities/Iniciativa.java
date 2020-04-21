package edu.eci.cvds.entities;

import java.util.*;
import java.lang.String;

public class Iniciativa{
	private String nombrePropuesta;
	private String descripcion;
	private Date fechaInicio;
	private List<PalabraClave> palabrasClaves;
	private String area;
	private String usuario;
	private String estado_Propuesta;
	private String nombreProponente;

	public Iniciativa() {}
	
	public Iniciativa(String nombrePropuesta, String descripcion, Date fechaInicio, String area, String usuario, String estado_Propuesta, String nombreProponente){
		this.nombrePropuesta = nombrePropuesta;
		this.descripcion= descripcion;
		this.fechaInicio = fechaInicio;
		this.area= area;
		this.usuario = usuario;
		this.estado_Propuesta = estado_Propuesta;
		this.nombreProponente = nombreProponente;	
	}
	
	public String getNombrePropuesta() {
		return nombrePropuesta;
	}

	public void setNombrePropuesta(String nombrePropuesta) {
		this.nombrePropuesta = nombrePropuesta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public List<PalabraClave> getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(List<PalabraClave> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEstado_Propuesta() {
		return estado_Propuesta;
	}

	public void setEstado_Propuesta(String estado_Propuesta) {
		this.estado_Propuesta = estado_Propuesta;
	}

	public String getNombreProponente() {
		return nombreProponente;
	}

	public void setNombreProponente(String nombreProponente) {
		this.nombreProponente = nombreProponente;
	}

	public String toString() {
		return "Iniciativa {nombre: " + nombrePropuesta + ", descripcion: " + descripcion + ", fechaInicio: " + fechaInicio + ", palabrasClaves: " + palabrasClaves + ", area: " + area + ", usuario: " + usuario + ", estado: " + estado_Propuesta + "}";
	}
	
}
