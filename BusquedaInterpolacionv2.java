public class BusquedaInterpolacionv2 {
    public static int posVal(int n[], int objetivo) {
        int alto = n.length - 1;
        int bajo = 0;
        main: while (bajo + 1 < alto) {
            int md = (alto - bajo) / 2;
            int psd = bajo + md;
            int est = (int) (bajo + (double) (objetivo - n[bajo]) / (double) (n[psd] - n[bajo]) * (md + 1));

            while (est > alto){
                bajo += md;
                md = (alto - bajo) / 2;
                psd = bajo + md;
                est = (int) (bajo + (double) (objetivo - n[bajo]) / (double) (n[psd] - n[bajo]) * (md + 1));

                if (md==0) break main;
            }
            if (est == 0) return bajo;

            if (n[est] < objetivo) {
                bajo = est + 1;
                if(est < psd) alto = psd;
            }

            else if (n[est] > objetivo){
                alto = est - 1;
                if(est > psd) bajo = psd;
            }
            else return est;

        }
        if (n[bajo]==objetivo) return bajo;
        else if (n[alto]==objetivo) return alto;
        return -1;
    }
}
