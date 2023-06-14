public class Funcionario {
    private String nome;
    private String id;
    private PisoSalarial pisoSalarial;
    private Hierarquia hierarquia;

    public Funcionario(String nome, String id, PisoSalarial pisoSalarial, Hierarquia hierarquia) {
        this.nome = nome;
        this.id = id;
        this.pisoSalarial = pisoSalarial;
        this.hierarquia = hierarquia;
    }

    public void receberSalario() {
        pisoSalarial.recebeSalario();
    }

    public void trabalhar() {
        pisoSalarial.trabalha();
    }

    public void atuarEmCargo() {
        hierarquia.atuaEmCargo();
    }

    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo id
    public String getId() {
        return id;
    }

    // Setter para o atributo id
    public void setId(String id) {
        this.id = id;
    }

}
