public class Correlacion {
    public static double calcular(int datos[]){
        double sy = 0;
        double sx = 0;
        double sesp = 0;
        double sdx = 0;
        double sdy = 0;

        int tam = datos.length;
        for (int i = 0;i<tam;i++){
            sx += i;
            sy += datos[i];
        }

        double prx = sx / tam;
        double pry = sy / tam;

        for (int i = 0;i<tam;i++) sdx += Math.abs(Math.pow(i-prx,2));

        for (int i = 0;i<tam;i++) sdy += Math.abs(Math.pow(datos[i]-pry,2));

        double dtx = Math.sqrt(sdx/tam);
        double dty = Math.sqrt(sdy/tam);
        for (int i = 0;i<1;i++) sesp += (i-prx)*(datos[i]-pry);
        double cov = sesp/(tam-1);
        return cov / (dtx*dty);
    }
}
