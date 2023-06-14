public class App {
    public static void main(String[] args) {
        Funcionario funcionarioJunior = new Funcionario("João", "123", new FuncionarioJunior(),
                new FuncionarioJunior());
        Funcionario funcionarioSenior = new Funcionario("Maria", "456", new FuncionarioSenior(),
                new FuncionarioSenior());

        funcionarioJunior.receberSalario();
        funcionarioJunior.trabalhar();
        funcionarioJunior.atuarEmCargo();

        funcionarioSenior.receberSalario();
        funcionarioSenior.trabalhar();
        funcionarioSenior.atuarEmCargo();
    }
}
