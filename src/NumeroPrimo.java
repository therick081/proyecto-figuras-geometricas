public class NumeroPrimo {
    /**
     * Indica si un numero es primo.
     * Refactor (fase Refactor del ciclo TDD): se descartan pronto los pares
     * y solo se revisan divisores impares hasta la raiz cuadrada de numero,
     * manteniendo el mismo resultado que la version anterior (tests en verde).
     */
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int divisor = 3; divisor * divisor <= numero; divisor += 2) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
