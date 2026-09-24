public class Loja {
    private Smartphone smartphone;
    private Notebook notebook;

    public Loja(FabricaAbstrata fabrica) {
        this.smartphone = fabrica.createSmartphone();
        this.notebook = fabrica.createNotebook();
    }

    public String venderSmartphone() {
        return this.smartphone.criar();
    }

    public String venderNotebook() {
        return this.notebook.criar();
    }
}
