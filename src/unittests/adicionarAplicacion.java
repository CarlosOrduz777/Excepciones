package unittests;

import static org.junit.Assert.*;

import aplicacion.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class adicionarAplicacion {
    // Variables del documento
    private Sinap sinap;
    private Area testArea;

    /**
     * Hace un setup del entorno antes de cada test.
     */
    @Before
    public void setUp(){
        // Creamos la instancia de la clase
        this.sinap = new Sinap();

        // Creamos el área de prueba
        this.testArea = new Area("test nombre", "test name", "test ubicacion",
                "test area", "test description");
    }

    /**
     * Prueba para adicionar un nuevo elemento
     */
    @Test
    public void shouldAddElement(){
        // Longitud inicial
        int prevLength = this.sinap.numeroAreas();

        // Sinap inicia sin áreas
        assertEquals(prevLength, 0);



        // Agregamos el área de prueba
        this.sinap.adicioneDetalles(this.testArea);

        // Verificamos que la longitud del arreglo de áreas haya aumentado en 1
        assertEquals(++prevLength, this.sinap.numeroAreas());

    }

    /**
     * Prueba para verificar la correcta inserción de un elemento
     */
    @Test
    public void shouldVerifyElement(){
        // Agregamos el área de prueba
        this.sinap.adicioneDetalles(testArea);

        // Traemos el área de prueba
        Area sinapArea = this.sinap.getDetalles(this.testArea.getNombre(), this.testArea.getName());

        // Verificamos nombre
        assertEquals(sinapArea.getNombre(), this.testArea.getNombre());

        // Verificamos name
        assertEquals(sinapArea.getName(), this.testArea.getName());

        // Verificamos ubicacion
        assertEquals(sinapArea.getUbicacion(), this.testArea.getUbicacion());

        // Verificamos area
        assertEquals(sinapArea.getArea(), this.testArea.getArea());

        // Verificamos descripcion
        assertEquals(sinapArea.getDescripcion(), this.testArea.getDescripcion());
    }

    /**
     * Prueba para adicionar un cinco nuevos elementos
     */
    @Test
    public void shouldAddFiveElements(){
        // Longitud inicial
        int prevLength = this.sinap.numeroAreas();

        // Sinap inicia sin áreas
        assertEquals(prevLength, 0);

        // Agregamos cinco elementos
        Area ejemplos[] = {
                new Area("Ciénaga Grande de Santa Marta","Large Marsh of Saint Martha", "Madalena","4280" ,
                        "Santuario de flora y fauna."+
                                " Propender por la recuperación del modelo hidráulico del complejo lagunar CGSM en el área del Santuario,"+
                                " con el fin de garantizar el estado de conservación de la biodiversidad de flora y fauna y la productividad pesquera,"+
                                " para mantener los flujos de nutrientes y cumplir con los protocolos internacionales de Reserva de Biosfera y "+
                                " humedal Ramsar."),
                new Area( "Nevado del Huila","Nevado del Huila", " Huila, Tolima, Cauca","1.580 km²",
                        "Parque natural"+
                                " Es considerada estratégica ya que abastece las dos cuencas mas importantes del país "+
                                "(Cuenca alta del Río Magdalena y Cuenca alta del Río Cauca) catalogándola como una estrella hídrica "+
                                "del macizo colombiano, que aporta bienes y servicios ambientales representados en ecosistemas de Páramo,"+
                                "subparamo, bosque Andino y altoandino, favoreciendo asi la viabilidad de especies de flora y fauna."),
                new Area("Laguna de Sonso", "Laguna de Sonso",  "Valle del Cauca", " 14,1 km²",
                        "Reserva natural,"+
                                "Aves migratorias que durante el invierno viajan desde Norteamérica en busca de buen clima "+
                                "y turistas de todo el mundo encuentran en la Reserva Natural Laguna de Sonso, 10 km al suroccidente de Buga, "+
                                "un sitio apacible moldeado por el río Cauca que cuenta con una torre de observación de 10 m de altura."),
                new Area("Morichales de Paz de Ariporo","Morichales de Paz de Ariporo", "Casanare", "",
                        "Propuesta de parque natural"+
                                " El ecosistema lo integra un humedal de 25 mil hectáreas donde impera la variedad de palma de moriche "+
                                "que sirve de refugio a buena parte de la fauna llanera y donde igualmente residen unas 200 familias que por décadas "+
                                "han habitado este paradisíaco lugar."),
                new Area("Parque Isla de Salamanca","Salamanca Island Road Park","Magalena", " 	562 km²",
                        "Vía parque'."+
                                "Posee 98 especies de invertebrados, 9 especies de anfibios, 35 especies de reptiles, más de 140 especies de peces, "+
                                "199 de aves, muchas de ellas migratorias, endémicas y residentes. La existencia de 33 especies de mamíferos indica "+
                                "que la diversidad que sostiene el área es elevada, a pesar de la problemática ambiental que afectó el ecosistema. "+
                                "El Vía Parque Isla de Salamanca cuenta con hábitats o refugios en donde se pueden observar especies declaradas en "+
                                "peligro de extinción por presión del hombre, destrucción y fragmentación de hábitats y disminución de la oferta "+
                                "alimentaria, entre otros factores.")
        };
        for(Area detalles : ejemplos) {
            this.sinap.adicioneDetalles(detalles);
        }

        // Verificamos que la longitud del arreglo de áreas haya aumentado en 5
        assertEquals(5, this.sinap.numeroAreas());

    }

    /**
     * Después de cada prueba termina la ejecución
     */
    @After
    public void tearDown()
    {

    }

}
