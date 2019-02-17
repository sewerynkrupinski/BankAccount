package J36_2;

import java.util.Scanner;

public class BankApplication {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Witaj, w którym banku chcesz utworzyć konto?");
        System.out.println("1 - Bank Pierwszy, oprocentowanie 5%");
        System.out.println("2 - Bank Drugi, oprocentowanie 3%");

        int dec = sc.nextInt();
        sc.nextLine();

        KontoBankowe konto = null;


        switch(dec) {
            case 1:
                konto = new KontoBank1();
                break;
            case 2:
                konto = new KontoBank2();
                break;
        }

        System.out.println("Podaj numer konta");
        String nr_konta = sc.nextLine();
        konto.setNrKonta(nr_konta);

        System.out.println("Podaj saldo początkowe");
        double saldo_pocz = sc.nextDouble();
        sc.nextLine();
        konto.setSaldo(saldo_pocz);

        System.out.println(konto);


        System.out.println("Ile mam dodać do salda");
        double price = sc.nextDouble();
        konto.addSaldo(price);
        System.out.println("Na koncie jest " +konto.getSaldo());

        System.out.println("Jaki ustawić debet dla konta");
        double debit = sc.nextDouble();
        konto.setMaxDebit(debit);
        System.out.println(konto);

        System.out.println("Ile mam wypłacić?");
        double wyplata = sc.nextDouble();
        konto.subSaldo(wyplata);
        System.out.println("Na koncie pozostało " + konto.getSaldo());

        System.out.println(konto);
        konto.interest();
        System.out.println(konto);

    }
}
