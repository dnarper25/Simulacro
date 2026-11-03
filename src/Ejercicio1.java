public class Ejercicio1 {
    public static void main(String[] args) {
        double largo1 = 5.0;
        double ancho1 = 4.0;
        double superficie1 = largo1 * ancho1;
        double litro1 = getLitro(superficie1);
        double precio1 = getPrecio(litro1);
        System.out.println("Habitacion 1: " + litro1 + " litros, " + precio1 + " euros");
        double largo2 = 6.0;
        double ancho2 = 2.5;
        double superficie2 = largo2 * ancho2;
        double x2 = getLitro(superficie2);
        double precio2 = getPrecio(x2);
        System.out.println("Habitacion 2: " + x2 + " litros, " + precio2 + " euros");
        double tl = litro1 + x2;
        System.out.println("Total de litros: " + tl);
        double te = precio1 + precio2;
        System.out.println("Total de euros: " + te);
    }

    private static double getPrecio(double litro1) {
        return litro1 * 4;
    }

    private static double getLitro(double superficie1) {
        return superficie1 / 10;
    }
}
