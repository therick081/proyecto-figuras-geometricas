import java.util.List;

/**
 * SRP: esta clase solo sabe presentar los resultados; no sabe calcular
 * areas ni conoce los detalles de cada figura concreta (depende de la
 * abstraccion Figura, no de sus implementaciones: principio de
 * inversion de dependencias).
 */
public class InformeAreas {
    public static void mostrarAreas(List<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.printf("El area del %s es %.2f%n",
                    figura.obtenerNombre(), figura.calcularArea());
        }
    }
}
