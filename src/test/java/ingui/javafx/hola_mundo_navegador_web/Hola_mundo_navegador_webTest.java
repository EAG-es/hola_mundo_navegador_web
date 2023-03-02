package ingui.javafx.hola_mundo_navegador_web;

import innui.modelos.errores.oks;
import java.util.List;
import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author emilio
 */
public class Hola_mundo_navegador_webTest {
    
    public Hola_mundo_navegador_webTest() {
    }

    /**
     * Test of main method, of class Hola_mundo_navegador_web.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Hola_mundo_navegador_web.main(args);
    }

    /**
     * Test of navegar method, of class Hola_mundo_navegador_web.
     */
    @Ignore
    public void testNavegar() throws Exception {
        System.out.println("navegar");
        List<String> parametros_lista = null;
        oks ok = null;
        Object[] extra_array = null;
        Hola_mundo_navegador_web instance = new Hola_mundo_navegador_web();
        boolean expResult = false;
        boolean result = instance.navegar(parametros_lista, ok, extra_array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poner_icono method, of class Hola_mundo_navegador_web.
     */
    @Ignore
    public void testPoner_icono() throws Exception {
        System.out.println("poner_icono");
        Stage stage = null;
        oks ok = null;
        Object[] extra_array = null;
        Hola_mundo_navegador_web instance = new Hola_mundo_navegador_web();
        boolean expResult = false;
        boolean result = instance.poner_icono(stage, ok, extra_array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
