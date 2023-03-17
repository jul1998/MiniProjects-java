import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the area of the forest in hectares: ");
        double forestArea = scanner.nextDouble() * 10000; // convertir de hectáreas a m²
        scanner.close();

        double pino, oyamel, cedro;
        if (forestArea > 1000000.0) {
            pino = 0.7;
            oyamel = 0.2;
            cedro = 0.1;
        } else {
            pino = 0.5;
            oyamel = 0.3;
            cedro = 0.2;
        }

        double areaPerPino = pino * forestArea;
        double areaPerOyamel = oyamel * forestArea;
        double areaPerCedro = cedro * forestArea;

        int numPinos = (int) Math.round(areaPerPino / 10.0 * 8);
        int numOyameles = (int) Math.round(areaPerOyamel / 15.0 * 15);
        int numCedros = (int) Math.round(areaPerCedro / 18.0 * 10);

        System.out.println("The forest will be planted with:");
        System.out.printf("%d pinos%n", numPinos);
        System.out.printf("%d oyameles%n", numOyameles);
        System.out.printf("%d cedros%n", numCedros);




    }
}
