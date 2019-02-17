package J36_2;

public class KontoBank2 extends KontoBankowe{



    @Override
    public void addDebit(double debit) {
        this.setMaxDebit(debit);

    }

    @Override
    public void interest() {
        this.addSaldo(this.getSaldo()*0.03);
    }

    @Override
    public String toString() {
        return "KontoBank2{{Nrkonta = " +getNrKonta()+ " Saldo = " + getSaldo()+ " Debet = " + getMaxDebit()+"}";
    }
}
