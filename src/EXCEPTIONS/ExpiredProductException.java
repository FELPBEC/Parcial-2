package EXCEPTIONS;
/** Clase creada en caso de algun tipo de incidencia en cuanto a la expiración de un producto de comida
 * 
 * @author Felipe Becerra
 * @since 24/10/2025
 * @version v1.0
 */
public class ExpiredProductException extends Exception{
/**Método que envía un mensaje en caso de encontrarse una incidencia
 * 
 * @param message
 */
    public ExpiredProductException(String message){
        super(message);
    }
}
