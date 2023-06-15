package controller;

import model.Observador;
import model.SistemaDeCadastro;

public class Gerenciador implements Observador {
    private SistemaDeCadastro sistemaDeCadastro;

    public Gerenciador() {
        sistemaDeCadastro = new SistemaDeCadastro();
    }

    @Override
    public void receberNotificacao(String aviso) {
        if (aviso.equals("inicio_matricula")) {
            sistemaDeCadastro.rematricularAlunos();
        }
    }
}