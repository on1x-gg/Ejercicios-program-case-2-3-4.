package ejemploarraylist;
import java.util.ArrayList;
public class Ejemplosarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear ArrayList
        ArrayList<String> lista = new ArrayList<>();

        // add(): añadir elementos
        lista.add("A");
        lista.add("B");
        lista.add("C");

        // get(): obtener elemento por índice
        String elemento = lista.get(1); // "B"

        // set(): modificar un elemento
        lista.set(0, "AA"); // cambia A → AA

        // remove(): eliminar por índice
        lista.remove(2); // elimina "C"

        // contains(): comprobar si existe un elemento
        boolean existe = lista.contains("B");

        // size(): tamaño actual
        int tam = lista.size();

        // clear(): vaciar la lista
        lista.clear();

        // isEmpty(): comprobar si está vacía
        boolean vacia = lista.isEmpty();

        // Si no quieres mostrar nada, puedes borrar o comentar los println
        System.out.println("Elemento obtenido: " + elemento);
        System.out.println("¿Existe B?: " + existe);
        System.out.println("Tamaño después de modificaciones: " + tam);
        System.out.println("¿Está vacía?: " + vacia);
	}

}
