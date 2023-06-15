public class App {
    public static void main(String[] args) {
        Funcionario funcionarioJunior = new Funcionario("João", "123", new FuncionarioJunior(),
                new FuncionarioJunior());
        Funcionario funcionarioSenior = new Funcionario("Maria", "456", new FuncionarioSenior(),
                new FuncionarioSenior());

        System.out.println("Conheça nosso quadro de funcionários\n");

        System.out.println("Funcionário: " + funcionarioJunior.getNome());
        funcionarioJunior.receberSalario();
        funcionarioJunior.trabalhar();
        funcionarioJunior.atuarEmCargo();
        System.out.println();

        System.out.println("Funcionário: " + funcionarioSenior.getNome());
        funcionarioSenior.receberSalario();
        funcionarioSenior.trabalhar();
        funcionarioSenior.atuarEmCargo();

    }
}
