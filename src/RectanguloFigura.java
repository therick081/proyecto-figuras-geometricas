/** SRP: esta clase solo sabe representar un rectangulo y calcular su area. */
public class RectanguloFigura implements Figura {
    private final double base;
    private final double altura;

    public RectanguloFigura(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base y altura deben ser mayores que cero");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String obtenerNombre() {
        return "rectangulo";
    }
}
