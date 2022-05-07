package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Počítač se skládá z:  " + cpu + " " + ram + " " + pevnyDisk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač je již zapnutý.");
        } else if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Počítač nemá potřebné komponenty pro zapnutí!");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač se zapíná.");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypíná.");
        } else {
            System.out.println("Počítač nelze vypnout, už je vypnutý.");
        }
    }



}