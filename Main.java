package matematikatapikode;
import java.util.InputMismatchException;
import java.util.Scanner;
import matematikatapikode.hanyaGaris.*;
import matematikatapikode.kalkulus.limit;
import matematikatapikode.aritmatika.*;
import matematikatapikode.aljabar.*;

public class Main {
    static private final Scanner scan = new Scanner(System.in);
    static private final sistembilangan sbil = new sistembilangan();
    static private final operasi opbil = new operasi();
    static private final faktordankelipatan fdank = new faktordankelipatan();
    static private final persen materiPersen = new persen();
    static private final garis garis = new garis();
    static private final fungsi aFungsi = new fungsi();
    static private final persamaanlinear plinear = new persamaanlinear();
    static private final persamaankuadrat pkuadrat = new persamaankuadrat();
    static private final limit limit = new limit();
    
    public static void main(String[] args) {
        while (true) {
            garis.garisStart();
            System.out.println("""
                    MATEMATIKA TAPI KODE
                    1. Aritmatika
                    2. Aljabar
                    3. Kalkulus
                    4. Keluar
                    """);
            int pilih = terimaInput("Pilih: ");
            switch (pilih) {
                case 1 -> aritmatika();
                case 2 -> aljabar();
                case 3 -> kalkulus();
                case 4 -> {
                    System.out.println("Terima kasih telah menggunakan program!");
                    garis.garisEnd();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            if (terimaInput("Kembali ke menu utama? (1 untuk ya, lainnya untuk keluar): ") != 1) {
                System.out.println("Terima kasih telah menggunakan program!");
                garis.garisEnd();
                break;
            }
        }
    }
    
    static void aritmatika() {
        System.out.println("""
                1. Bilangan
                2. Operasi Bilangan
                3. Faktor dan Kelipatan
                4. Persen
                """);
        int pilih = terimaInput("Pilih: ");
        switch (pilih) {
            case 1 -> sbil.sistembilangan();
            case 2 -> opbil.operasiBilangan();
            case 3 -> fdank.faktorDanKelipatan();
            case 4 -> materiPersen.mulai();
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    static void aljabar() {
        System.out.println("""
                1. Fungsi
                2. Persamaan Linear
                3. Persamaan Kuadrat
                """);
        int pilih = terimaInput("Pilih: ");
        switch (pilih) {
            case 1 -> aFungsi.mulai();
            case 2 -> plinear.mulai();
            case 3 -> pkuadrat.mulai();
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    static void kalkulus() {
        System.out.println("1. Limit");
        int pilih = terimaInput("Pilih: ");
        if (pilih == 1) {
            limit.mulai();
        } else {
            System.out.println("Maaf, anda salah input");
        }
    }

    static int terimaInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid, masukkan angka!");
                scan.next();
            }
        }
    }
}
