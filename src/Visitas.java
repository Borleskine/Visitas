public class Visitas {
    public static void main(String[] args) {
        // Verificar si se proporcionaron argumentos en la línea de comandos
        if (args.length == 0) {
            System.out.println("Por favor proporciona al menos un número de visitas diarias.");
            return;
        }

        // Convertir los argumentos de la línea de comandos a enteros
        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Por favor asegúrate de que todos los argumentos sean números enteros.");
                return;
            }
        }

        // Calcular el promedio de visitas diarias
        double promedioVisitas = promedio(visitasDiarias);
        System.out.println("El promedio de visitas diarias es: " + promedioVisitas);
    }

    public static double promedio(int[] visitasDiarias) {
        // Calcular la suma de todas las visitas diarias
        int suma = 0;
        for (int visita : visitasDiarias) {
            suma += visita;
        }
        // Calcular el promedio
        return (double) suma / visitasDiarias.length;
    }
}
