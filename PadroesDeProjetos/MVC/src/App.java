import model.SistemaDeCadastro;
import view.PromptDeCadastro;

public class App{
    public static void main(String[] args) {
        SistemaDeCadastro sistemaDeCadastro = new SistemaDeCadastro();
        PromptDeCadastro promptDeCadastro = new PromptDeCadastro(sistemaDeCadastro);
        promptDeCadastro.iniciarPrompt();
    }
}
