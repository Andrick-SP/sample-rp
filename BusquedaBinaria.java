public class BusquedaBinaria{
    public static int posVal(int n[], int objetivo){
        int al = n.length-1;
        int ba = 0;
        while (ba <= al){
            int mid = ba + ((al-ba)/2);
            if(objetivo < n[mid]) al = mid-1;
            else if(objetivo > n[mid]) ba = mid+1;
            else return mid;
        }

        return -1;
    }
}
