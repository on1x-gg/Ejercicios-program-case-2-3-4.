package clasesherencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehiculo bici = new Bicicleta("Orbea", "MX50", 3.5, "Disco");
        Vehiculo coche = new Coche("Tesla", "Model 3", 15.0, 4, true);
        Vehiculo patinete = new Patinete("Xiaomi", "Pro 2", 2.0, 45);

        int horas = 3;

        System.out.println("=== INFORMACIÓN DE LOS VEHÍCULOS ===");
        System.out.println(bici.descripcion());
        System.out.println("Precio por " + horas + " horas: " + bici.calcularPrecioAlquiler(horas) + "€\n");

        System.out.println(coche.descripcion());
        System.out.println("Precio por " + horas + " horas: " + coche.calcularPrecioAlquiler(horas) + "€\n");

        System.out.println(patinete.descripcion());
        System.out.println("Precio por " + horas + " horas: " + patinete.calcularPrecioAlquiler(horas) + "€");
    }
	}


