import java.util.ArrayList;
import java.util.List;

/** Punto de composicion: arma la lista de figuras y pide el informe. */
public class DemoSolid {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new CirculoFigura(5));
        figuras.add(new RectanguloFigura(4, 6));
        figuras.add(new TrianguloFigura(3, 7));
        figuras.add(new CuadradoFigura(4));

        InformeAreas.mostrarAreas(figuras);
    }
}
