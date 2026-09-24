public class FabricaSamsung implements FabricaAbstrata {
    @Override
    public Smartphone createSmartphone() {
        return new SmartphoneSamsung();
    }

    @Override
    public Notebook createNotebook() {
        return new NotebookSamsung();
    }
}
