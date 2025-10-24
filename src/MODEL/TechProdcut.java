package MODEL;

import javax.swing.JOptionPane;
import EXCEPTIONS.InvalidProductDataException;
import EXCEPTIONS.InvalidWarrantyException;
/**Subclase hija de la clase Product que representa a los producto tecnologicos
 * 
 * @author Felipe Becerra
 * @since 24/10/2025
 * @version v1.0
 * 
 */
public class TechProdcut extends Product{
    private int warrantyMonths;

    /** Método constructor de la subclase que tiene por atributos:
     * 
     * @param name  nombre del producto
     * @param price  precio del producto
     * @param quantity  cantidad del producto
     * @param warrantyMonths    meses de garantía
     */
    public TechProdcut(String name, double price, int quantity, int warrantyMonths) throws InvalidProductDataException{
        super(name, price, quantity);
        if(warrantyMonths<0)throw new InvalidProductDataException("La cantidad de meses no puede ser negativa");
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }
    /**Método heredado de la clase Producto que cálcula el precio total según la fecha de vencimiento */
    @Override
    public double calculateTotalPrice()throws InvalidWarrantyException{
        double FinalPrice=0;
        if(warrantyMonths<0){
            throw new InvalidWarrantyException("Los meses de garantía no pueden ser menores a 0");
        }else{
            FinalPrice=price*quantity+(price*0.05*warrantyMonths);
        }
        return FinalPrice;
    }
    /**Métdodo heredado de la clase Product que muestra la información del prodcuto */
    @Override
    public void ShowInfo(){
          JOptionPane.showMessageDialog(null, "Nombre: "+name+"\n Precio Base"+price+"\n Cantidad"+ quantity+"\n meses de garantía"+warrantyMonths);
    }
}
