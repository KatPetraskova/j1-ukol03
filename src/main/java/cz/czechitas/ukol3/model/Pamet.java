package cz.czechitas.ukol3.model;

public class Pamet {

    private long kapacitaPameti;

    public long getKapacitaPameti() {
        return kapacitaPameti;
    }

    public void setKapacitaPameti(long kapacitaPameti) {
        this.kapacitaPameti = kapacitaPameti;
    }

    @Override
    public String toString() {
        return "Kapacita paměti je " + getKapacitaPameti() + ".";
    }
}
