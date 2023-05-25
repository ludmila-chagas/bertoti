package entities;
import java.util.ArrayList;

public class Database {
    private static Database instance;
    private ArrayList<String> nomes;

    private Database(){
        this.nomes = new ArrayList<String>();
    }

    public static Database getInstance(){
        if(instance == null){

           instance = new Database();
        }

        return instance;
    }

    public ArrayList<String> getNomes(){
        return this.nomes;
    }

    public void setNomes(ArrayList<String> nomes){
        this.nomes = nomes;
    }
}
