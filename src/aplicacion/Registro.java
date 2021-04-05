package aplicacion;  

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

/**
 * Clase encargada de llevar un registro con los logs del sistema
 */
public class Registro{
    public static String nombre="SINAP";

    /**
     * Método encargado de registrar las excepciones en el archivo de logs configurado
     * @param e Excepción arrojada por el sistema
     */
    public static void registre(Exception e){
        try{
            Logger logger=Logger.getLogger(nombre);
            logger.setUseParentHandlers(false);
            FileHandler file=new FileHandler(nombre+".log",true);
            file.setFormatter(new SimpleFormatter());
            logger.addHandler(file);
            logger.log(Level.SEVERE,e.toString(),e);
            file.close();

            // Terminamos la ejecución del programa
            System.exit(0);
        }catch (Exception oe){
            oe.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * Método encargado de registrar las excepciones en el archivo de logs configurado
     * @param e Excepción arrojada por el sistema
     */
    public static void registreNoExit(Exception e){
        try{
            Logger logger=Logger.getLogger(nombre);
            logger.setUseParentHandlers(false);
            FileHandler file=new FileHandler(nombre+".log",true);
            file.setFormatter(new SimpleFormatter());
            logger.addHandler(file);
            logger.log(Level.SEVERE,e.toString(),e);
            file.close();
        }catch (Exception oe){
            oe.printStackTrace();
            System.exit(0);
        }
    }
}
    
