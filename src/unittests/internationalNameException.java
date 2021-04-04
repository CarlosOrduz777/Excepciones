package unittests;

import aplicacion.Area;
import aplicacion.SINAPExcepcion;
import aplicacion.Sinap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class internationalNameException {

    // Variables del documento
    private Sinap sinap;

    /**
     * Hace un setup del entorno antes de cada test.
     */
    @Before
    public void setUp(){
        // Creamos la instancia de la clase
        this.sinap = new Sinap();
    }

    /**
     * Prueba para listar un nuevo elemento
     */
    @Test
    public void shouldThrowExceptionIfNoInternationalNameIsGiven(){
        // Tratamos de agregar un área sin nombre internacional
        try {
            this.sinap.adicione("test nombre", "", "test ubicacion",
                    "test area", "test description");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.INTERNATIONAL_NAME_REQUIRED, e.getMessage());
        }

    }


    /**
     * Después de cada prueba termina la ejecución
     */
    @After
    public void tearDown()
    {

    }

}
