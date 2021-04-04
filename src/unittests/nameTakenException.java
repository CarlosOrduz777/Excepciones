package unittests;

import aplicacion.SINAPExcepcion;
import aplicacion.Sinap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class nameTakenException {

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
     * Prueba para verificar que un área insertada no exista en
     * la 'base de datos'.
     * @result No se insertarán elementos duplicados
     */
    @Test
    public void shouldNotAcceptDuplicatedAreas(){
        // Tratamos de agregar un área sin nombre internacional
        try {
            // Esta inserción funcionará
            this.sinap.adicione("test", "test", "test",
                    "test", "test");

            // Esta lanzará una excepción
            this.sinap.adicione("test", "test", "test",
                    "test", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.NAME_TAKEN, e.getMessage());
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
