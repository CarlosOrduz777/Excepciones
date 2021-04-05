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

    /**
     * Constructor de la clase
     */
    public SINAPExcepcion(String msg){
        super(msg);
    }
}
