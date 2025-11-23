package iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Iteratorejer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> nombres = new ArrayList<>();

	        nombres.add("Ana");
	        nombres.add("Pedro");
	        nombres.add("Maria");
	        nombres.add("Luis");
	        nombres.add("Pablo");
	        nombres.add("Sol");

	        /* ======================================
	         * PARTE 1: Iterator
	         * ====================================== */

	        System.out.println("== Parte 1: Iterator ==");

	        // 1. Crear Iterator
	        Iterator<String> it = nombres.iterator();

	        // 2. Imprimir todos los nombres
	        System.out.println("Nombres originales:");
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // REINICIAR Iterator para poder usarlo otra vez
	        it = nombres.iterator();

	        // 3. Eliminar nombres con menos de 4 letras
	        while (it.hasNext()) {
	            String nombre = it.next();
	            if (nombre.length() < 4) {
	                it.remove();
	            }
	        }

	        // 4. Imprimir lista después de eliminar
	        System.out.println("\nDespués de eliminar los de < 4 letras:");
	        System.out.println(nombres);


	        /* ======================================
	         * PARTE 2: ListIterator
	         * ====================================== */

	        System.out.println("\n== Parte 2: ListIterator ==");

	        ListIterator<String> lit = nombres.listIterator();

	        // 1. Recorrer hacia delante con modificaciones
	        while (lit.hasNext()) {
	            String nombre = lit.next();

	            // a. Si empieza con P → mayúsculas
	            if (nombre.startsWith("P")) {
	                lit.set(nombre.toUpperCase());
	            }

	            // b. Si empieza con M → añadir "Marcos"
	            if (nombre.startsWith("M")) {
	                lit.add("Marcos");
	            }
	        }

	        // 3. Imprimir la lista después de modificar
	        System.out.println("Lista modificada:");
	        System.out.println(nombres);

	        // 4. Recorrer hacia atrás e imprimir nombres
	        System.out.println("\nRecorrido hacia atrás:");
	        while (lit.hasPrevious()) {
	            System.out.println(lit.previous());
	        }


	        /* ======================================
	         * PARTE 3: Información adicional
	         * ====================================== */

	        System.out.println("\n== Parte 3: Índices con ListIterator ==");

	        // Reiniciar ListIterator al inicio
	        lit = nombres.listIterator();

	        System.out.println("Recorrido hacia delante con nextIndex():");
	        while (lit.hasNext()) {
	            System.out.println("Índice: " + lit.nextIndex() + " → " + lit.next());
	        }

	        System.out.println("\nRecorrido hacia atrás con previousIndex():");
	        while (lit.hasPrevious()) {
	            System.out.println("Índice: " + lit.previousIndex() + " → " + lit.previous());
	        }
	}

}
