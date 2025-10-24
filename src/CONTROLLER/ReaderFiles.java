package CONTROLLER;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ReaderFiles {
    public static ArrayList<Producto> CargarProductos(String pathFile){
            ArrayList<Producto> ListaProductos=new ArrayList<>();

            try(BufferedReader buffer_reader=new BufferedReader(new FileReader(pathFile))){
                String line;
                while ((line=buffer_reader.readLine())!=null){

                    String[]values=line.split(",");

                    int id=Integer.parseInt(values[0]);
                    String nombre=values[1];
                    double costo=Double.parseDouble(values[2]);
                    ListaProductos.add(new Producto(id, nombre, costo));
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
        
                JOptionPane.showMessageDialog(null,"Error leyendo el archivo "+ e.getMessage());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Algun elemento de la lista es incorrecto"+e.getMessage());
            }
            return ListaProductos;
    }
}
