import java.util.Arrays;
import java.util.Random;

public class Controlador {
    public static void main(String weas[]){
        while (true) {
            //------------------Generar archivo de números aleatorios--------------------------x
            ArInt archivo = new ArInt();
            archivo.setN(10000000);
            int tam = archivo.getN();

            archivo.setLim(tam);
            archivo.generar();

            int datos[] = Archivo.leer(tam);

            Arrays.sort(datos);

            Random random = new Random();

            int valor = datos[random.nextInt(tam)];

            Metodos.buscar(datos, valor);
        }
    }
}
