package entities;

import java.util.ArrayList;

public class Cidade implements Territorio{

    private int populacaoDaCidade;
    private ArrayList<Territorio> bairros;

    public Cidade(){
        this.populacaoDaCidade = 0;
        this.bairros = new ArrayList<Territorio>();
    }

    @Override
    public int getPopulacaoTotal(){
        for (Territorio territorio : bairros) {
            populacaoDaCidade += territorio.getPopulacaoTotal();
        }
        
        return this.populacaoDaCidade;
    }

    @Override
    public void adicionar(Territorio bairro){
        this.bairros.add(bairro);
    }

    @Override
    public void remover(Territorio bairroRemovido){
        for (Territorio territorio : bairros) {
            if(bairroRemovido == territorio){
                bairros.remove(territorio);
                this.populacaoDaCidade -= territorio.getPopulacaoTotal();
            }
        }
    }
}
