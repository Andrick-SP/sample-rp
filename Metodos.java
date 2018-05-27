public class Metodos {
    public static void buscar(int datos[], int valor){
        int pos;
        long inicio;
        long fin;
        double tiempo;

        //----------------------------Evaluación del tiempo de la búsqueda binaria--------------------------
        inicio = System.nanoTime();
        pos = BusquedaBinaria.posVal(datos, valor);
        fin = System.nanoTime();
        tiempo = (fin - inicio) * (Math.pow(10, -6));
        System.out.println("Búsqueda Binaria:");
        System.out.println("Tiempo para encontrar " + valor + " en la posición " + pos + " = " + tiempo + "ms");
        //------------------Evaluación del tiempo de la búsqueda por interpolación (original)-----------------

        inicio = System.nanoTime();
        pos = BusquedaInterpolacion.posVal(datos, valor);
        fin = System.nanoTime();
        tiempo = (fin - inicio) * (Math.pow(10, -6));
        System.out.println("Búsqueda Interpolación:");
        System.out.println("Tiempo para encontrar " + valor + " en la posición " + pos + " = " + tiempo + "ms");

        //------------------Evaluación del tiempo de la búsqueda por interpolación (mejorada)-------------------

        inicio = System.nanoTime();
        pos = BusquedaInterpolacionv2.posVal(datos, valor);
        fin = System.nanoTime();
        tiempo = (fin - inicio) * (Math.pow(10, -6));
        System.out.println("Búsqueda Interpolación v2:");
        System.out.println("Tiempo para encontrar " + valor + " en la posición " + pos + " = " + tiempo + "ms");
    }
}
