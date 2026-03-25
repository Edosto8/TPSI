package Parcheggio;

public enum VehicleType {
    AUTO(1),
    MOTO(1),
    CAMION(2),
    AUTOBUS(3);
    private final int postiOccupati;
    VehicleType(int postioccupati) {
    this.postiOccupati=postioccupati;

    }
    public int getPostiOccupati() {
        return postiOccupati;
    }
}
