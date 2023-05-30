
public class ComboFacade {
    private Lanche lanche;
    private Acompanhamentos acompanhamentos;
    private Sobremesa sobremesa;

    public ComboFacade(){
        this.lanche = new Lanche();
        this.acompanhamentos = new Acompanhamentos();
        this.sobremesa = new Sobremesa();
    }

    public void montarCombo(){
        System.out.println("Montando seu combo:");

        lanche.adicionLanche();
        acompanhamentos.adicionaFritas();
        acompanhamentos.adicionaRefri();
        sobremesa.adicionaSobremesa();

        System.out.println("Combo montado!");
    }

}