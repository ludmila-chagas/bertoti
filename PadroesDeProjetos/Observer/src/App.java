import entities.Assinante;
import entities.Jornaleiro;

public class App {
    public static void main(String[] args) throws Exception {
        
        Jornaleiro JornaleiroComum = new Jornaleiro();    
        
        Assinante João = new Assinante("João");
        Assinante Maria = new Assinante("Maria");
        
        JornaleiroComum.subscribe(Maria);
        JornaleiroComum.subscribe(João);

        JornaleiroComum.update();

        System.out.println("Maria não assina mais");
        JornaleiroComum.unsubscribe(Maria);

        JornaleiroComum.update();

    }
}
