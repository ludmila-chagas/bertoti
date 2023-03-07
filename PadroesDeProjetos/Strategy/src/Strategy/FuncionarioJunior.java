package Strategy;

public class FuncionarioJunior implements PisoSalarial, Hierarquia {
	
	@Override
	public void imprimirPisoSalarial() {
		System.out.println("Piso Salarial: R$20/hora");
	}

	@Override
	public void imprimirCargaHoraria() {
		System.out.println("Carga horária: 44h semanais");	
	}

	@Override
	public void nivelHierarquico() {
		System.out.println("É liderado constantemente.");
		
	}
	
}