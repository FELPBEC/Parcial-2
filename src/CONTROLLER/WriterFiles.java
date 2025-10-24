package CONTROLLER;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class WriterFiles {
    public static void guardarRetiros(String pathFile, String InformaciónRetiro){
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(pathFile,true))) {
                bufferedWriter.write(InformaciónRetiro);
                bufferedWriter.newLine();
        }catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(null,"Archivo no encontrado \n verifique la ruta" + pathFile);  
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al encontrar el archivo");  
            }finally{
                System.out.println("Cierra del programa");
            }

    }
}
