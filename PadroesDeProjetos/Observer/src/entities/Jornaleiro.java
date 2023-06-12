package entities;

import java.util.ArrayList;

public class Jornaleiro implements Editora {

    String conteudoDoJornal;
    ArrayList<Assinante> assinantes;

    public Jornaleiro() {
        this.conteudoDoJornal = "Só um jornal comum";
        this.assinantes = new ArrayList<Assinante>();
    }

    @Override
    public void update(String conteudo) {
        for (Assinante assinante : assinantes) {
            System.out.println("Sr: " + assinante.getNome() + "! Novo jornal lançado: " + conteudo);
        }
    }

    public void unsubscribe(Assinante desinscrito) {
        assinantes.remove(desinscrito);
    }

    public void subscribe(Assinante inscrito) {
        this.assinantes.add(inscrito);
    }
}
