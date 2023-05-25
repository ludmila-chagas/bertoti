package entities;

import java.util.ArrayList;

public class Estado implements Territorio {
    
    private int populacaoTotal;
    private ArrayList<Territorio> cidades;

    public Estado(){
        this.populacaoTotal = 0;
        this.cidades = new ArrayList<Territorio>(); 
    }

    @Override
    public int getPopulacaoTotal(){
        for (Territorio territorio : cidades) {
            populacaoTotal += territorio.getPopulacaoTotal();
        }

        return this.populacaoTotal;
    }

    @Override
    public void adicionar(Territorio cidade){
        this.cidades.add(cidade);
    }

    @Override
    public void remover(Territorio cidadeRemovida){
        for (Territorio territorio : cidades) {
            if(cidadeRemovida == territorio){
                cidades.remove(territorio);
                this.populacaoTotal -= territorio.getPopulacaoTotal();
            }
        }
    }
}
