package RPL6;
public class SavingAccount {
    
    double saldo;
    double bunga = 0.02;
    String nama;
    public void cetak(){
        System.out.println("Nama: " + nama);
        System.out.println("Saldo: " + saldo);
        System.out.println("Bunga: " + bunga);
        System.out.println("Total Saldo Dengan Bunga: " + (saldo + (saldo * bunga)));
        System.out.println();

    }

   }
