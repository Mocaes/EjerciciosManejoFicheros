package ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pares {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Pares.txt"));
            int cuenta = 0;
            for (int i =2; i<=100;i+=2){
                bw.write(Integer.toString(i)+ "\n");
                cuenta++;
            }
            System.out.println("Se ha creado el fichero 'Pares'");
            System.out.println("Se han guardado " +cuenta + " numeros pares");
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }
}
