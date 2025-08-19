package RPL6;

public class accounttest {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount();
        account1.nama = "via";
        account1.saldo = 1000.0;
        account1.bunga = 0.02;
        account1.cetak();

        SavingAccount account2 = new SavingAccount();
        account2.nama = "landis";
        account2.saldo = 2000.0;
        account2.cetak();

    }
}
