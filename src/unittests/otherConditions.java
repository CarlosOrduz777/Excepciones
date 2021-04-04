package unittests;

import aplicacion.SINAPExcepcion;
import aplicacion.Sinap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class otherConditions {

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
     * Prueba para verificar que cada área tenga un nombre
     * @result Todas las áreas tendrán un nombre en español
     */
    @Test
    public void shouldNotBeNamelessAreas(){
        // Tratamos de agregar un área sin nombre en español
        try {
            this.sinap.adicione("", "test", "test",
                    "test", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.NAME_REQUIRED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que cada área tenga una ubicación
     * @result Todas las áreas tendrán una ubicación
     */
    @Test
    public void shouldNotBeAreasWithoutLocation(){
        // Tratamos de agregar un área sin ubicación
        try {
            this.sinap.adicione("test", "test", "",
                    "test", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.LOCATION_REQUIRED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que cada área tenga un área
     * @result Todas las áreas tendrán un área
     */
    @Test
    public void shouldNotBeAreasWithoutArea(){
        // Tratamos de agregar un área sin área
        try {
            this.sinap.adicione("test", "test", "test",
                    "", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.AREA_REQUIRED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que cada área tenga una descripción
     * @result Todas las áreas tendrán una descripción
     */
    @Test
    public void shouldNotBeAreasWithoutDescription(){
        // Tratamos de agregar un área sin description
        try {
            this.sinap.adicione("test", "test", "test",
                    "test", "");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.DESCRIPTION_REQUIRED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que la longitud de 'nombre' es
     * válida
     * @result Todas las áreas tendrán un 'nombre' válido
     */
    @Test
    public void shouldNombreLengthBeValid(){
        // Verificamos la longitud de nombre
        try {
            this.sinap.adicione("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis pa", "test", "test",
                    "test", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.NAME_LENGTH_EXCEEDED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que la longitud de 'descripcion' es
     * válida
     * @result Todas las áreas tendrán una 'descripcion' válida
     */
    @Test
    public void shouldDescriptionLengthBeValid(){
        // Verificamos la longitud de descripcion
        try {
            this.sinap.adicione("test","test", "test",
                    "test", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. N");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.DESCRIPTION_LENGTH_EXCEEDED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que la longitud de 'ubicacion' es
     * válida
     * @result Todas las áreas tendrán un 'ubicacion' válido
     */
    @Test
    public void shouldUbicacionLengthBeValid(){
        // Verificamos la longitud de ubicacion
        try {
            this.sinap.adicione("test", "test", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium.",
                    "test", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.LOCATION_LENGTH_EXCEEDED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que la longitud de 'name' es
     * válida
     * @result Todas las áreas tendrán un 'name' válido
     */
    @Test
    public void shouldNameLengthBeValid(){
        // Verificamos la longitud de name
        try {
            this.sinap.adicione("test","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis pa", "test",
                    "test", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.NAME_LENGTH_EXCEEDED, e.getMessage());
        }
    }

    /**
     * Prueba para verificar que la longitud de 'area' es
     * válida
     * @result Todas las áreas tendrán un 'area' válido
     */
    @Test
    public void shouldAreaLengthBeValid(){
        // Verificamos la longitud de area
        try {
            this.sinap.adicione("test","test", "test",
                    "1234567896325874", "test");
        } catch (SINAPExcepcion e) {
            assertEquals(SINAPExcepcion.AREA_LENGTH_EXCEEDED, e.getMessage());
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
