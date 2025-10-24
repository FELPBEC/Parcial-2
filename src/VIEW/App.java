package VIEW;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import CONTROLLER.Order;
import MODEL.ClothingProduct;
import MODEL.FoodProduct;
import MODEL.TechProdcut;

public class App {
    public static void main(String[] args) throws Exception {
        byte Opcion=0;
        double finalPrice=0;
        Order order=new Order();
       
                do {
                    Opcion=Byte.parseByte(JOptionPane.showInputDialog("""
                Ingrese un número según su acción
                1) Agregar producto alimenticio
                2) Agegar producto tecnologico
                3) Agregar prenda ropa
                4) Mostrar pedido
                5) Calcular total
                6) Salir
                """)); 
                switch (Opcion) {
            case 1:
                String name=JOptionPane.showInputDialog("Ingrese el nombre del producto");
                Double price=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                int quantity=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quiere"));
                JOptionPane.showMessageDialog(null, "A continuación se le pediran los datos de la fecha de expiración");
                int year=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de expiración"));
                int mounth=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de expiración"));
                int dayOfMounth=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
                LocalDate expirationDate=LocalDate.of(year, mounth, dayOfMounth);
                FoodProduct FoodProduct=new FoodProduct(name, price, quantity, expirationDate);
                finalPrice+=FoodProduct.calculateTotalPrice();
                order.addProduct(FoodProduct);

                break;
            case 2:
                
                 name=JOptionPane.showInputDialog("Ingrese el nombre del producto");
                 price=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                 quantity=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quiere"));
                 int warrantyMonths=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los meses de garantía del producto"));
                TechProdcut techProduct=new TechProdcut(name,price, quantity, warrantyMonths);
                finalPrice+=techProduct.calculateTotalPrice();
                 order.addProduct(techProduct);
            break;
            case 3:
                name=JOptionPane.showInputDialog("Ingrese el nombre del producto");
                 price=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                 quantity=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quiere"));
                 String size= JOptionPane.showInputDialog("Ingrese la talla del producto");
                 ClothingProduct clothingProduct=new ClothingProduct(name, price, quantity, size);
                 finalPrice+=clothingProduct.calculateTotalPrice();
                 order.addProduct(clothingProduct);
            break;
            case 4:
            order.showOrderDetails();
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "El precio de su orden es: "+finalPrice);
            break;
            case 6:
            JOptionPane.showMessageDialog(null, "saliendo exitosamente");
            break;
            default:
                break;
            }
                } while (Opcion!=6);
        order.showOrderDetails();
        JOptionPane.showMessageDialog(null, "El precio de su orden es: "+finalPrice);

    }
}
