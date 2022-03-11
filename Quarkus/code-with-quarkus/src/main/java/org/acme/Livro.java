package org.acme;

public class Livro {

	private String codigo;
	private Especificacao espc;
	
	
	public Livro(String codigo, Especificacao espc){
		this.codigo = codigo;
		this.espc = espc;
		
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	
}
