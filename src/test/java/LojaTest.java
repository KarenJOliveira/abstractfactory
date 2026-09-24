import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {
    @Test
    void deveVenderSmartphoneApple() {
        FabricaAbstrata fabrica = new FabricaApple();
        Loja loja = new Loja(fabrica);
        assertEquals("Smartphone Apple criado: iPhone 18 Pro.", loja.venderSmartphone());
    }

    @Test
    void deveVenderSmartphoneSamsung() {
        FabricaAbstrata fabrica = new FabricaSamsung();
        Loja loja = new Loja(fabrica);
        assertEquals("Smartphone Samsung criado: Galaxy S26 Ultra.", loja.venderSmartphone());
    }

    @Test
    void deveVenderNotebookApple() {
        FabricaAbstrata fabrica = new FabricaApple();
        Loja loja = new Loja(fabrica);
        assertEquals("Notebook Apple criado: MacBook Air M5.", loja.venderNotebook());
    }

    @Test
    void deveVenderNotebookSamsung() {
        FabricaAbstrata fabrica = new FabricaSamsung();
        Loja loja = new Loja(fabrica);
        assertEquals("Notebook Samsung criado: Galaxy Book6 Pro.", loja.venderNotebook());
    }
}
