/**
 * Abstraccion comun para cualquier figura geometrica.
 * Principio abierto/cerrado (OCP): nuevas figuras se agregan creando una
 * clase que implemente esta interfaz, sin tocar el codigo ya existente.
 */
public interface Figura {
    double calcularArea();
    String obtenerNombre();
}
