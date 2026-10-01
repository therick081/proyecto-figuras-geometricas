/**
 * Responsabilidad unica (SRP): esta clase solo sabe representar un
 * circulo y calcular su propia area.
 */
public class CirculoFigura implements Figura {
    private final double radio;

    public CirculoFigura(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero");
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String obtenerNombre() {
        return "circulo";
    }
}
