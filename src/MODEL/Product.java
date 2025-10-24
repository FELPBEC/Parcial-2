package MODEL;
import EXCEPTIONS.*;

/**Clase padre Producto que posee las caracteristicas básicas de todos los productos
 * 
 * @author Felipe Becerra
 * @version v1.0
 * @since 24/10/2025
 * 
 */
public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;
    /**Método constructor de la clase padre con los siguientes atributos:
     * 
     * @param name  Nombre del producto
     * @param price Precio del producto
     * @param quantity  Cantidad de producto
     */
    public Product(String name, double price, int quantity) throws InvalidProductDataException{
        if(price<0)throw new InvalidProductDataException("El precio del producto no puede ser negativo ");
        if(quantity<0)throw new InvalidProductDataException("La cantidad de productos no puede ser negativa");
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    /**Método que envía el nombre del producto
     * 
     * @return  el nombre del producto
     */
    public String getName() {
        return name;
    }
    /**Método para modificat el nombre del producto
     * 
     * @param name  nombre del producto
     */
    public void setName(String name) {
        this.name = name;
    }
    /**Método que envía el precio del producto
     * 
     * @return  el precio del producto
     */
    public double getPrice() {
        return price;
    }
    /**Método que modifica el precio del producto
     * 
     * @param price el nuevo precio del producto
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**Método que obtiene la cantidad de stock del producto
     * 
     * @return la cantidad de unidades del producto
     */
    public int getQuantity() {
        return quantity;
    }
    /**Método para modificar la cantidad de unidades de un producto
     * 
     * @param quantity la nueva cantidad del producto
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**Método abstracto que calcula el precio total
     * 
     * @return
     */
    public abstract double calculateTotalPrice()throws ExpiredProductException,InvalidSizeException,InvalidWarrantyException;
    /**Método que muestra en pantalla la información del producto
     * 
     */
    public abstract void ShowInfo();
        
}
