package ejercicio9;

import java.io.*;

public class FicheroNuevo {
    public static void main(String[] args) {
        try {
            //Creo los 2 ficheros para mas tarde juntarlos
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Asignaturas 1.txt"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Profesores 2.txt"));
            //Lectura de los dos ficheros que necesito para juntar
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Asignaturas 1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\Profesores 2.txt"));
            //Nuevo archivo que voy ha mezclar entre los 2
            BufferedWriter brF = new BufferedWriter(new FileWriter("C:\\Users\\Mopa\\Desktop\\LECTURA JAVA\\FINAL.txt"));

            //Dos archivos con profesores y programas
            bw1.write("Programación\n");
            bw2.write("Alberto\n");
            bw1.write("Bases de datos\n");
            bw2.write("Angel\n");
            bw1.write("Entornos de desarrollo\n");
            bw2.write("Alberto\n");
            bw1.write("Lenguajes de marcas\n");
            bw2.write("Alberto\n");
            bw1.write("Sistemas informáticos\n");
            bw2.write("Bernardo\n");
            //Cierro los dos escritores de archivos
            bw1.close();
            bw2.close();

            //Creo los dos atributos para las lineas se vayan leyendo
            String linea1 = "";
            String linea2 = "";
            //Leo las lineas y las escribo en el nuevo documento
            while ((linea1!=null)||(linea2!=null)){
                linea1= br1.readLine();
                linea2=br2.readLine();
                if(linea1!=null){
                    brF.write(linea1 + " ");
                }
                if (linea2 != null){
                    brF.write(linea2 + "\n");
                }
            }
            brF.close();
            System.out.println("Archivo Final realizado con exito");
        } catch (FileNotFoundException e) {
            System.out.println("Los archivos Asignaturas y profesores no se han encontrado");
        } catch (IOException e) {
            System.out.println("Los archivos han tenido un error de lectura");
        }
    }
}
