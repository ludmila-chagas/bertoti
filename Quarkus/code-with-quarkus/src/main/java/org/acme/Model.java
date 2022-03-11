package org.acme;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Livro> livros = new LinkedList<Livro>();
	
public Model(){
	
	addLivro(new Livro("1234", new Especificacao("Dracula", "Intrinseca", "Bram Stoker")));
	addLivro(new Livro("5678", new Especificacao("O Corvo", "Aleph", "Edgar Allan Poe")));
}
	
	public void addLivro(Livro livro){
		livros.add(livro);
	}
	
	public Livro buscarCodigo(String codigo){
		for(Livro livro:livros){
			if(livro.getCodigo().equals(codigo)) return livro;
		}
		
		return null;
	}
	
	
	public List<Livro> buscarEspecificacao(Especificacao esp){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		
		for(Livro livro:livros){
			 if(esp.comparar(livro.getEspc())) livrosEncontrados.add(livro);
		}
		
		return livrosEncontrados;
		
	}
	
	
	public List<Livro> buscarObra(String obra){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros) {
			if(livro.getEspc().getObra().equals(obra)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}

}
