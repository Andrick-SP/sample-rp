import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ArInt{
    ArInt(){
        aleatorio = new Random();
        n = 0;
    }

    public void generar(){
        try {
            FileWriter escritor = new FileWriter("archivo.txt");
            for(int i = 0; i<n ; i++) escritor.write(aleatorio.nextInt(lim) + ",");
            System.out.println("Archivo reemplazado por " + n + " enteros aleatorios.");
            escritor.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void setN (int n){
        this.n = n;
    }

    public void setLim(int lim){
        this.lim = lim;
    }

    public int getN(){
        return n;
    }

    private Random aleatorio;
    private int n;
    private int lim;
}
