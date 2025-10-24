package CONTROLLER;
import MODEL.*;
import java.util.ArrayList;
/**Clase que representa las ordenes
 * @author Felipe Becerra
 * @version v1.0
 * @since 24/10/2025
 */
public class Order {
    ArrayList<Product> Orden=new ArrayList<>();
    /**Método para agregar prodcutos a la orden
     * 
     * @param nuevoProducto el nuevo producto
     */
    public void addProduct(Product nuevoProducto){
        Orden.add(nuevoProducto);
    }
    
    /**Método que muestra todos los datos de la orden */
    public void showOrderDetails(){
        for (int i = 0; i < Orden.size(); i++) {
        Orden.get(i).ShowInfo();
        }
    }
}
