package clasesherencia;

public class Coche extends Vehiculo {
	 private int numPuertas;
	    private boolean esElectrico;

	    public Coche(String marca, String modelo, double precioPorHora, int numPuertas, boolean esElectrico) {
	        super(marca, modelo, precioPorHora);
	        this.numPuertas = numPuertas;
	        this.esElectrico = esElectrico;
	    }

	    @Override
	    public double calcularPrecioAlquiler(int horas) {
	        double precio = super.calcularPrecioAlquiler(horas);
	        if (esElectrico) {
	            precio *= 0.9; // 10% de descuento
	        }
	        return precio;
	    }

	    @Override
	    public String descripcion() {
	        return super.descripcion() +
	                " | Puertas: " + numPuertas +
	                " | Eléctrico: " + (esElectrico ? "Sí" : "No");
	    }
}
