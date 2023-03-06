package Strategy;

public class FuncionarioSenior implements PisoSalarial, Hierarquia {

	@Override
	public void imprimirCargaHoraria() {
		System.out.println("Carga horária: 44h semanais");
	}

	@Override
	public void nivelHierarquico() {
		System.out.println("É minimamente liderado.");
		
	}

	@Override
	public void imprimirPisoSalarial() {
		System.out.println("Piso Salarial: R$55/hora");
		
	}	
}