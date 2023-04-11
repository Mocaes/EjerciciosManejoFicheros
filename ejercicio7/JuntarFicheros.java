package ejercicio7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class JuntarFicheros {
    public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Pares.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el fichero pares.txt");
            }
        }

}

