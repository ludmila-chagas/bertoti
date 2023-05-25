import entities.Bairro;
import entities.Cidade;
import entities.Estado;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numeroDeHabitantesItamaraty = 2;
        Estado saoPaulo = new Estado();
        Cidade jacarei = new Cidade();
        Bairro itamaraty = new Bairro();
        itamaraty.setNumeroDeHabitantes(numeroDeHabitantesItamaraty);

        jacarei.adicionar(itamaraty);
        saoPaulo.adicionar(jacarei);

        System.out.println("Numero de habitantes do Estado: " + saoPaulo.getPopulacaoTotal());
    }
}
