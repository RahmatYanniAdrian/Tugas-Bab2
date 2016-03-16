package PraktikumBab2;
import java.util.Scanner;
public class User {
    Scanner s = new Scanner(System.in);
    private int Password;
    private int Saldo;

    public User(int pass, int password1, int saldo1, int password2, int saldo2) {
        Password=pass;
        if (Password == password1) {
            Saldo = saldo1;
        } 
        else if (Password == password2) {
            Saldo = saldo2;
        } 
    }
    public void lihatSaldo() {
        System.out.println("===========================");
        System.out.println("Saldo Anda Saat ini \nRp." + Saldo + ",-");
        System.out.println("===========================");
    }
    public void menarikUang() {
        byte pilihan = 0;
        System.out.println("===========================");
        System.out.println("Pilihan Menu Tarik Cepat: ");
        System.out.println("1. Tarik Rp. 100.000");
        System.out.println("2. Tarik Rp. 300.000");
        System.out.println("3. Tarik Rp. 500.000");
        System.out.println("4. Tarik dalam jumlah lain");
        System.out.println("===========================");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = s.nextByte();
        System.out.println("===========================");
        if (pilihan == 1) {
            Saldo -= 100000;
            System.out.println("Saldo sebanyak Rp.100000 berhasil ditarik");
            System.out.println("Saldo Anda Saat ini \nRp." + Saldo + ",-");
        } else if (pilihan == 2) {
            Saldo -= 300000;
            System.out.println("Saldo sebanyak Rp.300000 berhasil ditarik");
            System.out.println("Saldo Anda Saat ini \nRp." + Saldo + ",-");
        } else if (pilihan == 3) {
            Saldo -= 500000;
            System.out.println("Saldo sebanyak Rp.500000 berhasil ditarik");
            System.out.println("Saldo Anda Saat ini \nRp." + Saldo + ",-");
        } else if (pilihan == 4) {
            int jumlahLain;
            System.out.println("===========================");
            System.out.println("Masukkan jumlah penarikan");
            jumlahLain = s.nextInt();
            System.out.println("===========================");
            Saldo -= jumlahLain;
            System.out.println("Saldo sebanyak" +jumlahLain+" berhasil ditarik");
            System.out.println("Saldo Anda Saat ini \nRp." + Saldo + ",-");
        }
    }
    public void transferRekening(int rekening, int jmlhTransfer) {
        byte pilihan = 0;
        System.out.println("===========================");
        System.out.println("Apakah anda yakin akan mentransfer uang ke ?");
        System.out.println("Nomor Rekening : " + rekening);
        System.out.println("Dengan Jumlah  : Rp." + jmlhTransfer + ",-");
        System.out.println("1. Ya       2.Tidak ");
        System.out.println("===========================");
        System.out.print("Pilihan anda :");
        pilihan = s.nextByte();
        System.out.println("===========================");
        if (pilihan == 1) {
            System.out.println("===========================");
            Saldo -= jmlhTransfer;
            System.out.println("Tranfer berhasil, sisa saldo anda = Rp." + Saldo + ",-");
            System.out.println("===========================");
        } else if (pilihan == 2) {
            System.out.println("===========================");
            System.out.println("Transfer gagal");
           System.out.println("===========================");
        }
    }
}

