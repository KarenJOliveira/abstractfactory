public class FabricaApple implements FabricaAbstrata{
    @Override
    public Smartphone createSmartphone() {
        return new SmartphoneApple();
    }

    @Override
    public Notebook createNotebook() {
        return new NotebookApple();
    }
}
