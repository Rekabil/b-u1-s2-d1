package src.entities;

import src.exceptions.BancaException;

public class ContoCorente {

    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;


    public ContoCorente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {
        if ((saldo - x) <= 0 ) throw new BancaException("il conto è in rosso"); else {
        if (nMovimenti < maxMovimenti)
            saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;}
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}
