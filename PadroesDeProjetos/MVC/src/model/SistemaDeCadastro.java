package model;

import java.util.List;
import java.util.ArrayList;

public class SistemaDeCadastro {
    private List<Aluno> alunos;

    public SistemaDeCadastro() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public boolean existeAlunoCadastrado() {
        return !alunos.isEmpty();
    }

    public void emitirAvisoInicioDeMatricula() {
        for (Aluno aluno : alunos) {
            System.out.println("Aviso para o aluno " + aluno.getNome() + ": Chegou a hora de fazer a rematrícula!");
        }
    }

    public void rematricularAlunos() {
        for (Aluno aluno : alunos) {
            aluno.receberAvisoRematricula();
        }
    }

    public void zerarAvisos() {
        for (Aluno aluno : alunos) {
            aluno.zerarAvisoRematricula();
        }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
