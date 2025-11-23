package clasesherencia;

public class Patinete extends Vehiculo{

	private int autonomiaBateria;

    public Patinete(String marca, String modelo, double precioPorHora, int autonomiaBateria) {
        super(marca, modelo, precioPorHora);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | Autonomía: " + autonomiaBateria + " km";
    }
}
