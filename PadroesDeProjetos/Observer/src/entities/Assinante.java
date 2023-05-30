package entities;

public class Assinante {
    String nomeDoAssinante;

    public Assinante(String nomeDoAssinante){
        this.nomeDoAssinante = nomeDoAssinante;
    }

    public String getNome(){
        return nomeDoAssinante;
    }
}
