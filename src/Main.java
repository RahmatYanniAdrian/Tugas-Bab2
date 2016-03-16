package PraktikumBab2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte pilihan1 = 0;
        byte pilihan2 = 0;
        int pass=0;
        System.out.println("===========================");
        System.out.println("|    Registrasi User 1    |");
        System.out.print("Input No. Rekening(9 digit)\t: ");
        int NoRek1=s.nextInt();
        System.out.print("Input Password(6 digit)\t\t: ");
        int password1=s.nextInt();
        System.out.print("Masukkan saldo\t\t\t: ");
        int saldo1=s.nextInt();
        System.out.println("===========================");
        System.out.println("|    Registrasi User 2    |");
        System.out.print("Input No. Rekening(9 digit)\t: ");
        int NoRek2=s.nextInt();
        System.out.print("Input Password(6 digit)\t\t: ");
        int password2=s.nextInt();
        System.out.print("Masukkan saldo\t\t\t: ");
        int saldo2=s.nextInt();
        System.out.println("===========================");
        
        do {
        System.out.println("1. Login");
        System.out.println("0. Keluar");
        System.out.print("Pilihan Anda : ");
        pilihan1=s.nextByte();
        System.out.println("===========================");
        if (pilihan1==1){
        System.out.print("Masukkan Password : "); 
        pass=s.nextInt();}
        else break;
        User user=new User(pass, password1, saldo1, password2, saldo2);
        System.out.println("===========================");
        do {
           System.out.println("===========================");
            System.out.println("Pilihan Menu :");
            System.out.println("1. Informasi Saldo");
            System.out.println("2. Penarikan Tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Keluar");
            System.out.println("===========================");
            System.out.print("Pilihan anda : ");
            pilihan2 = s.nextByte();
            System.out.println("===========================");
            if (pilihan2 == 1) {
                user.lihatSaldo();
            } else if (pilihan2 == 2) {
                user.menarikUang();
            } else if (pilihan2 == 3) {
        System.out.println("===========================");
        System.out.print("Masukkan Nomor Rekening : ");
        int rekening = s.nextInt();
        System.out.print("Masukkan Jumlah Transfer : ");
        int jmlhTransfer = s.nextInt();
                user.transferRekening(rekening, jmlhTransfer);
                saldo2 += jmlhTransfer;
            }
        } while (pilihan2 != 4);
        }while (pilihan1 ==1 );
    }
}
