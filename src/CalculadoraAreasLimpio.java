public class CalculadoraAreasLimpio {
    public static void main(String[] args) {
        mostrarResultado("circulo", calcularAreaCirculo(5));
        mostrarResultado("rectangulo", calcularAreaRectangulo(4, 6));
        mostrarResultado("triangulo", calcularAreaTriangulo(3, 7));
        mostrarResultado("circulo", calcularAreaCirculo(10));
    }

    /** Area de un circulo a partir de su radio. */
    static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /** Area de un rectangulo a partir de su base y altura. */
    static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    /** Area de un triangulo a partir de su base y altura. */
    static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    /** Imprime el resultado con un formato unico y consistente. */
    static void mostrarResultado(String nombreFigura, double area) {
        System.out.printf("El area del %s es %.2f%n", nombreFigura, area);
    }
}
