package org.acme;

public class Especificacao {

	
	private String obra;
	private String editora;
	private String autor;
	
	
	public Especificacao(String obra, String editora, String autor){
		this.obra = obra;
		this.editora = editora;
		this.autor = autor;
	}
	
	public String getObra(){
		return obra;
	}
	
	public String getEditora(){
		return editora;
	}
	
	public String getAutor(){
		return autor;
	}
	
	//delegacao da comparacao de editora, obra e autor do livro para a classe Especificacao, pois ela eh a dona dos atributos
	public boolean comparar(Especificacao esp){
		if(editora.equals(esp.editora) && obra.equals(esp.obra) && autor.equals(esp.autor)){
			return true;
		} else {
			return false;
		}
	}
	
}
