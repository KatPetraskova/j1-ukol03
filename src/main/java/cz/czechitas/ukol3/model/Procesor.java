package cz.czechitas.ukol3.model;

public class Procesor {

    private String vyrobce;

    private long rychlostProcesoru;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlostProcesoru() {
        return rychlostProcesoru;
    }

    public void setRychlostProcesoru(long rychlostProcesoru) {
        this.rychlostProcesoru = rychlostProcesoru;
    }

    @Override
    public String toString() {
        return "Rychlost procesoru je " + getRychlostProcesoru() + " Hz a výrobce je " + getVyrobce() + ".";
    }
}
