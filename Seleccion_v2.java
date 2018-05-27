public class Seleccion_v2 {
    public static int[] sort(int arr[]){

        int  temp,limit = arr.length-1;

        for (int k = 0; k<limit ; k++){
            //System.out.println("k = " + (k+1));
            //System.out.println("Pivote reseteado");
            for (int p = k + 1; p<=limit; p++){
                if (arr[p]<arr[k]){
                    //System.out.println("Pivote cambiado a " + (p+1));
                    temp = arr[p];
                    arr[p] = arr[k];
                    arr[k] = temp;
                    //System.out.println("Se intercambió " + arr[p] + " en la posición " + (k+1) + " por " + arr[k] + " en la posición " + (p+1) );
                }
                /*if(p != k){
                    //p = i;
                    System.out.println("Pivote = " + (p+1));
                    arr[p] = arr[k];
                    arr[k] = temp;
                    System.out.println("Se intercambió " + arr[p] + " en la posición " + (k+1) + " por " + arr[k] + " en la posición " + (p+1) );
                    p=k;
                }*/
            }
            /*for (int e: arr)
                System.out.print(e + ",");
            System.out.println();
            System.out.println("El bucle se ejecutó " + cont + " veces.");
            cont = 0;*/
        }

        return arr;
        /*System.out.println("Final");
        for (int e: arr)
            System.out.print(e + ",");

        int total = 0;

        for (int i = 119;i>0;i--) {
            total += i;
        }
        System.out.println();
        System.out.print(total + "");*/
    }
}
