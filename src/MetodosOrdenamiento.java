import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: El método retorna un arreglo vacío: "new int[] {}".
    // Corrección: Cambiar el return, añadiendo "arreglo", para que de este modo quede un arreglo ordenado.
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: La condición del if estaba errónea
    // Solución: Cambiar de "<" a ">"

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: La condición de ambos for, if y el intercambio de elementos son erróneos
    // Solución: Cambiar "i<n-1" a "i<n", luego en el segundo for "j=0" a "j=i+1".
    // En el if cambiar "arreglo[j]" a "arreglo[i]"
    // En el intercambio de elementos; cambiar el valor de int temp a "arreglo[i]" y viceversa.

    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: El primer for está fuera de rango, hace falta el return
    // Solución: Eliminar el "-1" al "i < arreglo.length - 1" y añadir un "return arreglo;"
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: En el segundo for, la condición es errónea
    // Solución: Cambiar el "j--" a "j++"
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: En el intercambio de variable.
    // Solución: Intercambiar i con el indice mínimo, de tal forma que smallerNumber adquiera el valor correcto.
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Las variables "i" y "j" estaban intercambiadas,
    // la condición del while estaba errónea
    // Solución: Intercambiar todas las variables "i" por "j" y viceversa, 
    // En el while, cambiar de "<" a ">" para ordenar de menor a mayor
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Variables "i" y "j" mal ordenadas, falta condicion "while"
    // ";" innecesario y "j--" faltante después de la condición.
    // Solución: Intercambiar "i con j" y viceversa, cambiar el segundo "for" por "while"
    // eliminar la última condición del while "j--" y agregarla al final de esta.
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];

            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Variables "i" y "j" mal ordenadas, falta resta para int j, añadir el igual que, 
    // intercambio de menor que a mayor que en "while", cambio a negativo en "j++",
    // return erróneo  
    // Solución: Intercambiar "i con j", añadir la resta en "int j = i", en el while, añadir el igual que
    // y cambiar de "<" a ">" 
    // Cambiar el return, añadiendo "arreglo", para que de este modo quede un arreglo ordenado.
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 1; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
        return arreglo;
    }

}
