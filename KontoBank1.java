package J36_2;



public class KontoBank1 extends KontoBankowe {


    @Override
    public void addDebit(double debit) {
        this.setMaxDebit(debit);

    }

    @Override
    public void interest() {
            this.addSaldo(this.getSaldo()*0.05);
    }

    @Override
    public String toString() {
        return "KontoBank1{Nrkonta = " +getNrKonta()+ " Saldo = " + getSaldo()+ " Debet = " + getMaxDebit()+"}";
    }
}
