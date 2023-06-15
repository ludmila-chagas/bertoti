package view;
import model.SistemaDeCadastro;

import java.util.Scanner;

import model.Aluno;

public class PromptDeCadastro {
    private SistemaDeCadastro sistemaDeCadastro;
    private Scanner scanner;

    public PromptDeCadastro(SistemaDeCadastro sistemaDeCadastro) {
        this.sistemaDeCadastro = sistemaDeCadastro;
        this.scanner = new Scanner(System.in);
    }

    public void iniciarPrompt() {
        System.out.println("Bem-vindo ao sistema de cadastro de alunos!");

        int comando;
        do {
            exibirOpcoes();
            comando = lerComando();

            if (comando == 1) {
                cadastrarAluno();
            }

        } while (comando != 2);

        if (sistemaDeCadastro.existeAlunoCadastrado()) {
            sistemaDeCadastro.emitirAvisoInicioDeMatricula();
            sistemaDeCadastro.zerarAvisos();
        } else {
            System.out.println("Nenhum aluno cadastrado. Não é possível emitir avisos.");
        }
    }

    private void exibirOpcoes() {
        System.out.println("\nOpções:");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Exit");
    }

    private int lerComando() {
        System.out.print("Digite o número da opção desejada: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Entrada inválida. Digite o número da opção desejada: ");
        }
        return scanner.nextInt();
    }

    private void cadastrarAluno() {
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine().trim();

        Aluno aluno = new Aluno(nome);
        sistemaDeCadastro.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso: " + aluno.getNome());
    }
}

