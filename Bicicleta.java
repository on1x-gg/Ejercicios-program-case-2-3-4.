package clasesherencia;

public class Bicicleta extends Vehiculo{
	 private String tipoFreno;

	    public Bicicleta(String marca, String modelo, double precioPorHora, String tipoFreno) {
	        super(marca, modelo, precioPorHora);
	        this.tipoFreno = tipoFreno;
	    }

	    @Override
	    public String descripcion() {
	        return super.descripcion() + " | Tipo de freno: " + tipoFreno;
	    }
}
