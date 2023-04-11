package ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio2 {
    public static void main(String []args){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Nombres.txt"));
            bw.write("Alberto\n");
            bw.write("Eva\n");
            bw.write("Laura\n");
            bw.write("Antonio\n");
            System.out.println("Fichero creado");
            bw.close();
        }catch (IOException ioe){
            System.out.println("No se a podido escribir en el fichero");
        }
    }
}
