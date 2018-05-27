public class BusquedaInterpolacion{
    public static int posVal(int n[], int objetivo){
        int alto = n.length-1;
        int bajo = 0;
        while (bajo <= alto){
            int est = (int)(bajo + (double)(objetivo-n[bajo])/(double)(n[alto]-n[bajo]) * (alto-bajo+1));

            if(est==alto+1) return alto;
            else if (est == 0) return bajo;

            if (n[est] > objetivo) alto = est - 1;
            else if (n[est] < objetivo) bajo = est + 1;
            else return est;
        }
        return -1;
    }
}
