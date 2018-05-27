
//Los caracteres del alfabeto ASCII van del 97-122
//Los caracteres de los números ASCII van del 48-57
public class Pruebas {
    public static void main(String weas[]){
       double sy = 0;
       double sx = 0;
       double sesp = 0;
       double sdx = 0;
       double sdy = 0;
       int n [] = new int[100];
        for(int x = 0;x<100;x++){
            int y = 3*x + 2;
            n[x] = y;
            sx += x;
            sy += y;
        }
        double prx = sx / 100;
        double pry = sy / 100;
        for (int i = 0;i<100;i++) sdx += Math.abs(Math.pow(i-prx,2));
        for (int i = 0;i<100;i++) sdy += Math.abs(Math.pow(n[i]-pry,2));
        double dtx = Math.sqrt(sdx/100);
        double dty = Math.sqrt(sdy/100);
        for (int i = 0;i<100;i++) sesp += (i-prx)*(n[i]-pry);
        double cov = sesp/99;
        double ccr = cov / (dtx*dty);
        System.out.println("El coeficiente de correlación lineal es: " + ccr);
    }
}