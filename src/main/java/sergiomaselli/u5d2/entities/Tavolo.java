package sergiomaselli.u5d2.entities;

import sergiomaselli.u5d2.enums.StatoTavolo;

public class Tavolo {
    private int numero;
    private int copertiMax;
    private StatoTavolo status;


    public Tavolo() {

        this.numero = numero;
        this.copertiMax = copertiMax;
        this.status = StatoTavolo.LIBERO;
    }

    public Tavolo(int numero, int copertiMax, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.status = statoTavolo;
    }

    // Getter e setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCopertiMax() {
        return copertiMax;
    }

    public void setCopertiMax(int copertiMax) {
        this.copertiMax = copertiMax;
    }

    public StatoTavolo getStatus() {
        return status;
    }

    public void setStatus(StatoTavolo status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", copertiMax=" + copertiMax +
                ", status=" + status +
                '}';
    }
}