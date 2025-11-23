package clasesherencia;

public class Vehiculo {
	private static int contadorID = 1;

    protected int idVehiculo;
    protected String marca;
    protected String modelo;
    protected double precioPorHora;

    public Vehiculo(String marca, String modelo, double precioPorHora) {
        this.idVehiculo = contadorID++;
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorHora = precioPorHora;
    }

    public double calcularPrecioAlquiler(int horas) {
        return precioPorHora * horas;
    }

    public String descripcion() {
        return "ID: " + idVehiculo +
                " | Marca: " + marca +
                " | Modelo: " + modelo +
                " | Precio/hora: " + precioPorHora + "€";
    }
}
