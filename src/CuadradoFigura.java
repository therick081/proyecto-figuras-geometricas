/**
 * Extension (OCP): figura nueva que se agrega sin modificar Figura.java
 * ni las clases CirculoFigura, RectanguloFigura, TrianguloFigura o
 * InformeAreas.java, que permanecen cerradas a modificacion.
 */
public class CuadradoFigura implements Figura {
    private final double lado;

    public CuadradoFigura(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String obtenerNombre() {
        return "cuadrado";
    }
}
