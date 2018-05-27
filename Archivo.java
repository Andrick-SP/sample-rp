import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    public static int[] leer(int tam){
        try {
            int datos[] = new int[tam];
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader buff = new BufferedReader(fr);
            String temp[] = null;
            String linea;
            while ((linea = buff.readLine()) != null) temp = linea.split(",");
            fr.close();
            buff.close();
            for (int i = -1, t = datos.length; ++i < t; ) datos[i] = Integer.parseInt(temp[i]);
            return datos;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
