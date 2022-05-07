package cz.czechitas.ukol3.model;

public class Disk {

    private long kapacitaDisku;

    private long vyuziteMisto;

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Kapacita disku je " + getKapacitaDisku() + " bajtů a využité místo na disku je " + getVyuziteMisto() + " bajtů.";
    }
}
