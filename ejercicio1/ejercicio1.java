package ejercicio1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ejercicio1 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Malaga.txt"));
        String linea="";
        while(linea!=null){
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();
        }catch (FileNotFoundException fnfe){
            //Si no encuentra el fichero
            System.out.println("No se encuentra el fichero Malaga.txt");
        }catch (IOException ioe){
            //error en la lectura de el archivo
            System.out.println("Hay un error al leer el fichero Malaga.txt");
        }
    }

}
