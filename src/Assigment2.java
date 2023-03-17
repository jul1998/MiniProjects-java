import java.util.HashMap;
import java.util.Map;


public class Assigment2 {
    public static void main(String[] args) {
        // Definir un mapa para almacenar la población de las ciudades
        Map<String, Integer> poblacionCiudades = new HashMap<>();

        // Agregar las poblaciones de las ciudades
        poblacionCiudades.put("Sevilla", 703206);
        poblacionCiudades.put("Málaga", 571026);
        poblacionCiudades.put("Córdoba", 330039);
        poblacionCiudades.put("Granada", 233764);
        poblacionCiudades.put("Jerez de la Frontera", 212876);
        poblacionCiudades.put("Almería", 198533);
        poblacionCiudades.put("Huelva", 143627);
        poblacionCiudades.put("Cádiz", 118919);
        poblacionCiudades.put("Dos Hermanas", 131317);
        poblacionCiudades.put("Mairena del Aljarafe", 47906);
        poblacionCiudades.put("Torremolinos", 68511);
        poblacionCiudades.put("Fuengirola", 74140);
        poblacionCiudades.put("Algeciras", 120780);
        poblacionCiudades.put("El Puerto de Santa María", 88556);
        poblacionCiudades.put("Roquetas de Mar", 95243);
        poblacionCiudades.put("Estepona", 68080);
        poblacionCiudades.put("Antequera", 41627);
        poblacionCiudades.put("Utrera", 52314);
        poblacionCiudades.put("Ronda", 35857);
        poblacionCiudades.put("Lepe", 27990);
        poblacionCiudades.put("Adra", 24475);
        poblacionCiudades.put("La Línea de la Concepción", 63738);
        poblacionCiudades.put("Loja", 21904);
        poblacionCiudades.put("Punta Umbría", 15698);
        poblacionCiudades.put("Villamartín", 12668);

        // Definir un mapa para almacenar la población de la ciudad más grande de cada provincia
        Map<String, Integer> poblacionMayorProvincia = new HashMap<>();

        // Recorrer el mapa poblacionCiudades y encontrar la ciudad más grande de cada provincia
        for (String ciudad : poblacionCiudades.keySet()) {
            String provincia = obtenerProvincia(ciudad);
            int poblacionActual = poblacionCiudades.get(ciudad);
            int poblacionMayor = poblacionMayorProvincia.getOrDefault(provincia, 0);

            if (poblacionActual > poblacionMayor) {
                poblacionMayorProvincia.put(provincia, poblacionActual);
            }
        }

        // Imprimir la población de la ciudad más grande de cada provincia
        System.out.println("Población de la ciudad más grande de cada provincia:");
        for (String provincia : poblacionMayorProvincia.keySet()) {
            int poblacionMayor = poblacionMayorProvincia.get(provincia);
            System.out.println(provincia + ": " + poblacionMayor);
        }
    }

    public static String obtenerProvincia(String ciudad) {
        return switch (ciudad) {
            case "Sevilla", "Dos Hermanas", "Mairena del Aljarafe" -> "Sevilla";
            case "Málaga", "Torremolinos", "Fuengirola" -> "Málaga";
            case "Córdoba", "Puente Genil", "Lucena" -> "Córdoba";
            case "Granada", "Almuñécar", "Baza" -> "Granada";
            case "Jerez de la Frontera", "Algeciras", "El Puerto de Santa María" -> "Cádiz";
            case "Almería", "Roquetas de Mar" -> "Almería";
            case "Huelva", "Lepe", "Punta Umbría" -> "Huelva";
            case "Adra", "La Línea de la Concepción" -> "Cádiz";
            case "Ronda", "Villamartín" -> "Málaga";
            case "Loja", "Antequera", "Utrera" -> "Sevilla";
            default -> "";
        };
    }
}


