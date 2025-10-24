package MODEL;
import javax.swing.JOptionPane;

import EXCEPTIONS.InvalidProductDataException;
import EXCEPTIONS.InvalidSizeException;
/**Subclase de la clase Product que representa a todos los productos de ropa
 * 
 * @author Felipe Becerra
 * @since 24/10/2025
 * @version v1.0
*/
public class ClothingProduct extends Product{
    private String size;

    public ClothingProduct(String name, double price, int quantity, String size) throws InvalidProductDataException {
        super(name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    /**Método heredado de la clase Producto que cálcula el precio total según la fecha de vencimiento */
    @Override
    public double calculateTotalPrice()throws InvalidSizeException{
        double FinalPrice=0;
        if(!size.equals("S")){
            if(!size.equals("M")){
                if(!size.equals("L")){
                    if(!size.equals("XL")){
                        throw new InvalidSizeException("la prenda ingresada tiene talla inválida.");
                    }
                }
            }
        }
        FinalPrice=price*quantity;
        
        return FinalPrice;
    }
    /**Métdodo heredado de la clase Product que muestra la información del prodcuto */
    @Override
    public void ShowInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: "+name+"\n Precio Base"+price+"\n Cantidad"+ quantity+"\n meses de garantía"+ size);
    }
}

