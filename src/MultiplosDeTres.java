public class MultiplosDeTres {
    public static void main(String[] args) {
        // Verificar si se proporcionaron argumentos en la línea de comandos
        if (args.length == 0) {
            System.out.println("Por favor proporciona al menos un número.");
            return;
        }

        // Convertir los argumentos de la línea de comandos a enteros
        int[] valores = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                valores[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Por favor asegúrate de que todos los argumentos sean números enteros.");
                return;
            }
        }

        // Calcular la suma de los múltiplos de tres
        int sumaMultiplosTres = sumaMultiplosTres(valores);
        System.out.println("La suma de los múltiplos de tres es: " + sumaMultiplosTres);

        // Calcular el promedio de los múltiplos de tres
        double promedioMultiplosTres = promedio(valores);
        System.out.println("El promedio de los múltiplos de tres es: " + promedioMultiplosTres);
    }

    public static int sumaMultiplosTres(int[] valores) {
        int suma = 0;
        for (int valor : valores) {
            if (valor % 3 == 0) {
                suma += valor;
            }
        }
        return suma;
    }

    public static double promedio(int[] valores) {
        // Calcular la suma de los múltiplos de tres
        int suma = 0;
        int cantidad = 0;
        for (int valor : valores) {
            if (valor % 3 == 0) {
                suma += valor;
                cantidad++;
            }
        }
        // Calcular el promedio
        return cantidad > 0 ? (double) suma / cantidad : 0;
    }
}

