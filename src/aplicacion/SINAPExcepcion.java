package aplicacion;

/**
 * Clase que contendrá todos los mensajes de excepción del proyecto
 *
 * @author Juan David Murillo - Carlos Orduz
 * @version 1.0
 */
public class SINAPExcepcion extends Exception{
    public static final String INTERNATIONAL_NAME_REQUIRED = "No se puede crear un área sin un nombre internacional";

    public static final String NAME_TAKEN = "Ya existe un área con este nombre";
    public static final String NAME_REQUIRED = "No se puede crear un área sin un nombre en español";
    public static final String LOCATION_REQUIRED = "No se puede crear un área sin una ubicación";
    public static final String AREA_REQUIRED = "No se puede crear un área sin una extensión geográfica";
    public static final String DESCRIPTION_REQUIRED = "No se puede crear un área sin una descripción";
    public static final String NAME_LENGTH_EXCEEDED = "La longitud máxima de los nombres es de 150 caracteres";
    public static final String DESCRIPTION_LENGTH_EXCEEDED = "La longitud máxima de la descripción es de 1.000 caracteres";
    public static final String LOCATION_LENGTH_EXCEEDED = "La longitud máxima de la ubicación es de 250 caracteres";
    public static final String AREA_LENGTH_EXCEEDED = "La longitud máxima del área es de 15 caracteres";

    /**
     * Constructor de la clase
     */
    public SINAPExcepcion(String msg){
        super(msg);
    }
}
