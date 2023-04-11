package ejercicio10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFinal {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\FINAL.txt"));
            String Linea = "";
            System.out.println("Contenido de Fichero Final");
            System.out.println("");
            while ((Linea = br.readLine()) != null) {
                System.out.println(Linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}