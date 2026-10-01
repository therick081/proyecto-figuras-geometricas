/** SRP: esta clase solo sabe representar un triangulo y calcular su area. */
public class TrianguloFigura implements Figura {
    private final double base;
    private final double altura;

    public TrianguloFigura(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base y altura deben ser mayores que cero");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public String obtenerNombre() {
        return "triangulo";
    }
}
