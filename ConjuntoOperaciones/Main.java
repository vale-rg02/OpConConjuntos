import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Object> setUnion(Set<Object> a, Set<Object> b) {
        Set<Object> producto = new HashSet<>(a);
        producto.addAll(b);
        return producto;
    }

    public static Set<Object> interseccion(Set<Object> a, Set<Object> b) {
        Set<Object> producto = new HashSet<>(a);
        producto.retainAll(b);
        return producto;
    }

    public static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> producto = new HashSet<>(a);
        producto.removeAll(b);
        return producto;
    }

    public static boolean isSubset(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }

    public static Set<String> cartesiano(Set<Object> a, Set<Object> b) {
        Set<String> producto = new HashSet<>();
        for (Object elementoA : a) {
            for (Object elementoB : b) {
                producto.add("(" + elementoA + ", " + elementoB + ")");
            }
        }
        return producto;
    }

    public static void main(String[] args) {
        Set<Object> conjuntoA = new HashSet<>();
        conjuntoA.add("a");
        conjuntoA.add("b");
        conjuntoA.add("c");

        Set<Object> conjuntoB = new HashSet<>();
        conjuntoB.add("b");
        conjuntoB.add("c");
        conjuntoB.add("d");

        System.out.println("Union: " + setUnion(conjuntoA, conjuntoB));
        System.out.println("Interseccion: " + interseccion(conjuntoA, conjuntoB));
        System.out.println("Diferencia A - B: " + diff(conjuntoA, conjuntoB));
        System.out.println("B es subconjunto de A: " + isSubset(conjuntoA, conjuntoB));
        System.out.println("Producto cartesiano: " + cartesiano(conjuntoA, conjuntoB));
    }
}