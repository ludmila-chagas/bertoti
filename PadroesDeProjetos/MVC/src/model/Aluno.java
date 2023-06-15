package model;

public class Aluno implements Observador {
    private String nome;
    private boolean recebeuAvisoRematricula;

    public Aluno(String nome) {
        this.nome = nome;
        Escola.getInstance().addAluno(this);
    }

    public String getNome() {
        return nome;
    }

    public void receberAvisoRematricula() {
        System.out.println("Aviso de rematrícula recebido para o aluno " + nome);
    }

    public void zerarAvisoRematricula() {
        this.recebeuAvisoRematricula = false;
    }

    @Override
    public void receberNotificacao(String aviso) {
        if (aviso.equals("inicio_rematricula")) {
            System.out.println("Aviso de rematrícula recebido para o aluno " + nome);
        }
    }
}