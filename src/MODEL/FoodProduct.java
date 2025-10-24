package MODEL;
import java.time.LocalDate;
import javax.swing.JOptionPane;

import EXCEPTIONS.ExpiredProductException;
import EXCEPTIONS.InvalidProductDataException;
/**Subclase de la clase Product con métodos y atributos heredados que representa los productos alimenticios
 * 
 */
public class FoodProduct extends Product{
    private LocalDate expiratiDate;
    /**Método constructor de la subclase FoodProduct que tiene por atributos:
     * 
     * @param name  el nombre del producto
     * @param price el precio del producto
     * @param quantity  la cantidad del producto
     * @param expiratiDate  la fecha de expiración
     */
    public FoodProduct(String name, double price, int quantity, LocalDate expiratiDate)throws InvalidProductDataException {
        super(name, price, quantity);
        this.expiratiDate = expiratiDate;
    }
    /**Método que envía la fecha de expiración
     * 
     * @return la fecha de expiración
     */
    public LocalDate getExpiratiDate() {
        return expiratiDate;
    }
    /**Método que modicia la fecha de expiración
     * 
     * @param expiratiDate la nueva fecha de expiración
     */
    public void setExpiratiDate(LocalDate expiratiDate) {
        this.expiratiDate = expiratiDate;
    }
    /**Método heredado de la clase Producto que cálcula el precio total según la fecha de vencimiento */
    @Override
    public double calculateTotalPrice()throws ExpiredProductException{
        double FinalPrice=0;
        if(expiratiDate.isAfter(LocalDate.now()))throw new ExpiredProductException("La fecha de expiración es mayor a la actual");
        return FinalPrice;
    }
    @Override
    public void ShowInfo(){
           JOptionPane.showMessageDialog(null, "Nombre: "+name+"\n Precio Base"+price+"\n Cantidad"+ quantity+"\n fecha de expiración"+expiratiDate);
    }
    }

