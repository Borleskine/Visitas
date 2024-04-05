public class SmartWatch {
    public static void main(String[] args) {
        // Verificar si se proporcionaron argumentos en la línea de comandos
        if (args.length == 0) {
            System.out.println("Por favor proporciona al menos un número de pasos diarios.");
            return;
        }

        // Convertir los argumentos de la línea de comandos a enteros y filtrar
        int[] pasosDiarios = clearSteps(args);

        // Calcular el promedio de pasos diarios
        double promedioPasos = promedio(pasosDiarios);
        System.out.println("El promedio de pasos diarios es: " + promedioPasos);
    }

    public static int[] clearSteps(String[] args) {
        // Filtrar los valores fuera del rango especificado
        int[] pasosFiltrados = new int[args.length];
        int index = 0;
        for (String arg : args) {
            try {
                int paso = Integer.parseInt(arg);
                if (paso >= 200 && paso <= 100000) {
                    pasosFiltrados[index++] = paso;
                }
            } catch (NumberFormatException e) {
                // Ignorar argumentos que no sean números enteros
            }
        }

        // Redimensionar el arreglo para eliminar valores nulos
        int[] resultado = new int[index];
        System.arraycopy(pasosFiltrados, 0, resultado, 0, index);
        return resultado;
    }

    public static double promedio(int[] pasosDiarios) {
        // Calcular la suma de todos los pasos diarios
        int suma = 0;
        for (int paso : pasosDiarios) {
            suma += paso;
        }
        // Calcular el promedio
        return (double) suma / pasosDiarios.length;
    }
}
