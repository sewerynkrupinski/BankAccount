package J36_2;

public abstract class KontoBankowe {

    private String nrKonta;
    private double saldo;
    private double maxDebit;

    public void addSaldo(double price){

        this.saldo = saldo + price;

    }

    public void subSaldo(double price){

        if (price <= saldo + maxDebit){

            this.saldo = saldo - price;

        }

        else
            System.out.println("Nie ma tylu pieniędzy na koncie");


    }

    public abstract void addDebit(double d);
    public abstract void interest();

    public String getNrKonta() {
        return nrKonta;
    }

    public void setNrKonta(String nrKonta) {
        this.nrKonta = nrKonta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMaxDebit() {
        return maxDebit;
    }

    public void setMaxDebit(double maxDebit) {
        this.maxDebit = maxDebit;
    }
}
