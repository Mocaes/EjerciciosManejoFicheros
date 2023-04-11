package ejercicio4;

import java.io.*;

public class LeerArchivoAsignatura {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("Asignatura.txt"));
            String linea = "";
            while (linea !=null) {
                linea = br.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se a podido encontrar");
        } catch (IOException e) {
            System.out.println("Ha habido un problema al leer el archivo");
        }
    }
}
