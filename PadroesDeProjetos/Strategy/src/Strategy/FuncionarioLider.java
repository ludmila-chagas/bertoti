package Strategy;

public class FuncionarioLider implements Hierarquia, PisoSalarial {

	@Override
	public void nivelHierarquico() {
		System.out.println("Lidera equipes.");
	}

	@Override
	public void imprimirPisoSalarial() {
		System.out.println("Piso Salarial: R$80/hora");	
		
	}

	@Override
	public void imprimirCargaHoraria() {
		System.out.println("Carga horária: 40h semanais");
		
	}

}

