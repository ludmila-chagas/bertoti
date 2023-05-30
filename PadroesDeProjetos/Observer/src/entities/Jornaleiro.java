package entities;

import java.util.ArrayList;

public class Jornaleiro implements Editora{
    
    String conteudoDoJornal;
    ArrayList<Assinante> assinantes;

    public Jornaleiro() {
        this.conteudoDoJornal = "Só um jornal comum";
        this.assinantes = new ArrayList<Assinante>();
    }

    @Override
    public void update(){
        for (Assinante assinante : assinantes) {
            System.out.println("Sr: " + assinante.getNome() +"! Novo jornal lançado!");
        }
    }

    public void unsubscribe(Assinante desinscrito){
        for (Assinante assinante : assinantes) {
            if(assinante.getNome() == desinscrito.getNome())
                assinantes.remove(desinscrito);
        }
    }

    public void subscribe(Assinante inscrito){
        this.assinantes.add(inscrito);
    }

}
