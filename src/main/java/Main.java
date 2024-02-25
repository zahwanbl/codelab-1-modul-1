package example;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        String nama, tanggallahir;
        char jeniskelamin;
        int tahunlahir, tahunsekarang;

        Scanner input = new Scanner(System.in);
        System.out.println(" Nama : ");
        nama = input.nextLine();
        System.out.println(" Tanggal Lahir(yyyy-mm-dd) : ");
        tanggallahir = input.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Jenis kelamin(p/l) : ");
        jeniskelamin = scanner.next().charAt(0);

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(tanggallahir);
        Period usia = Period.between(birthDate, today);

        System.out.println(" Nama : " + nama);
        System.out.println(" Jenis Kelamin(p/l) : ");
       if (jeniskelamin == 'p' || jeniskelamin == 'P'){
           System.out.println("perempuan");
       } else if (jeniskelamin == 'l' || jeniskelamin == 'L') {
           System.out.println("laki laki");
       }else {
           System.out.println("input tidak valid");
       }

        System.out.println("Umur Anda : " + usia.getYears() + " Tahun " + usia.getMonths() + " Bulan ");
    }
}