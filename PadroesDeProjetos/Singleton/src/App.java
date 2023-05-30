import java.util.ArrayList;
import java.util.Arrays;

import entities.Database;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Lud", "Milud", "Parish"));
        Database baseDeNomes = Database.getInstance();

        baseDeNomes.setNomes(nomes);

        for (String nome : baseDeNomes.getNomes()) {
            System.out.println("Nome: " + nome);
        }

    }
}
