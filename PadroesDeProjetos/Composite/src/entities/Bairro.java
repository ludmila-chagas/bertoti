package entities;

import java.util.ArrayList;

public class Bairro implements Territorio{
    private int numeroDeMoradores;
    private ArrayList<Territorio> casas;

    public Bairro(){
        this.numeroDeMoradores = 0;
        this.casas = new ArrayList<Territorio>();
    }

    public int getPopulacaoTotal(){
        for (Territorio territorio : casas) {
            numeroDeMoradores += territorio.getPopulacaoTotal();
        }
        
        return this.numeroDeMoradores;
    }
    
    @Override
    public void adicionar(Territorio casa){
        this.casas.add(casa);
    }

    @Override
    public void remover(Territorio casas){
        this.numeroDeMoradores -= casas.getPopulacaoTotal();
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes){
        this.numeroDeMoradores = numeroDeHabitantes;
    }
}
