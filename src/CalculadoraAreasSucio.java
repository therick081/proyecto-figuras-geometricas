public class CalculadoraAreasSucio {
    // version inicial (borrador): nombres poco claros, codigo repetido,
    // numeros magicos y todo mezclado dentro de un unico metodo main.
    public static void main(String[] args) {
        String t = "circulo";
        double a = 5;
        double b = 0;
        if (t.equals("circulo")) {
            double r = a;
            double ar = 3.14 * r * r;
            System.out.println("El area es: " + ar);
        }

        t = "rectangulo";
        a = 4;
        b = 6;
        if (t.equals("rectangulo")) {
            double ar = a * b;
            System.out.println("El area es: " + ar);
        }

        t = "triangulo";
        a = 3;
        b = 7;
        if (t.equals("triangulo")) {
            double ar = (a * b) / 2;
            System.out.println("El area es: " + ar);
        }

        // otro circulo: bloque casi identico al primero, copiado y pegado
        t = "circulo";
        a = 10;
        b = 0;
        if (t.equals("circulo")) {
            double r = a;
            double ar = 3.14 * r * r;
            System.out.println("El area es: " + ar);
        }
    }
}
