public class FuncionarioSenior implements PisoSalarial, Hierarquia {
	@Override
	public void recebeSalario() {
		System.out.println("Piso Salarial: R$55/hora");
	}

	@Override
	public void trabalha() {
		System.out.println("Carga horária: 44h semanais");
	}

	@Override
	public void atuaEmCargo() {
		System.out.println("É minimamente liderado.");
	}
}
