public static void main(String[] args) {
        int[] datos = {905, 210, 550, 102, 443};

        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        // Algoritmo de Ordenamiento por Inserción
        for (int i = 1; i < datos.length; i++) {
            int actual = datos[i]; // Elemento actual a procesar
            int j = i - 1;

            // Recorremos hacia atrás desplazando los elementos mayores a la derecha
            while (j >= 0 && datos[j] > actual) {
                datos[j + 1] = datos[j];
                j--;
            }

            // Insertamos el valor en el lugar correcto
            datos[j + 1] = actual;
        }

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(datos);
    }

    private static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
