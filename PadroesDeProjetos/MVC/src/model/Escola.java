package model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private static Escola instance;
    private List<Aluno> alunos;
    private List<Observador> observadores;

    private Escola() {
        alunos = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public static Escola getInstance() {
        if (instance == null) {
            instance = new Escola();
        }
        return instance;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void emitirAvisoInicioMatricula() {
        notificarObservadores("inicio_matricula");
    }

    private void notificarObservadores(String aviso) {
        for (Observador observador : observadores) {
            observador.receberNotificacao(aviso);
        }
    }
}