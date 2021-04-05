package unittests;

import aplicacion.Area;
import aplicacion.SINAPExcepcion;
import aplicacion.Sinap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class buscarAplicacion {
    // Variables del documento
    private Sinap sinap;
    private Area testArea;
    private Area testArea2;

    /**
     * Hace un setup del entorno antes de cada test.
     */
    @Before
    public void setUp() {
        // Creamos la instancia de la clase
        this.sinap = new Sinap();

        // Creamos el área de prueba 1
        this.testArea = new Area("test nombre", "test name", "test ubicacion",
                "test area", "test description");

        // Creamos el área de prueba 2
        this.testArea2 = new Area("test", "test", "test",
                "test", "test");

        // Agregamos las áreas de prueba a SINAP
        try {
            this.sinap.adicioneDetalles(this.testArea);
            this.sinap.adicioneDetalles(this.testArea2);
        } catch(SINAPExcepcion e) {}
    }

    /**
     * Prueba para buscar un elemento
     *
     * @result Una lista con los elementos cuyo nombre coincide
     * con el criterio de búsqueda
     */
    @Test
    public void shouldFindElements() {
        // Buscamos elementos que inicien por 'T'
        ArrayList<Area> results = this.sinap.busque("T");

        // Deben haber dos registros que inicien con ese nombre
        assertEquals(2, results.size());
    }

    /**
     * Prueba para buscar un elemento no existente
     *
     * @result Una lista vacía
     */
    @Test
    public void shouldNotFindElements() {
        // Buscamos elementos que inicien por 'XYZ'
        ArrayList<Area> results = this.sinap.busque("XYZ");

        // No hay registros con ese nombre
        assertEquals(0, results.size());
    }


    /**
     * Después de cada prueba termina la ejecución
     */
    @After
    public void tearDown() {

    }
}