package matematikatapikode.aritmatika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;

public class faktordankelipatan {
    static private garis garis = new garis();
    static private Scanner scan = new Scanner(System.in);

    public void faktorDanKelipatan() {
        garis.garis();
        helper.promptMateri("Faktorisasi", faktordankelipatan::faktorisasi);
        helper.promptMateri("Mencoba Operasi Faktor", faktordankelipatan::operasiFaktor);
        helper.promptMateri("Faktorisasi Prima", faktordankelipatan::faktorisasiPrima);
        helper.promptMateri("Pohon Faktor", faktordankelipatan::pohonFaktor);
        helper.promptMateri("Kelipatan", faktordankelipatan::kelipatan);
        helper.promptMateri("Faktor Persekutuan Terbesar", faktordankelipatan::FPB);
        helper.promptMateri("Mencoba FPB", this::inputFPB);
        helper.promptMateri("Faktor Persekutuan Terkecil", faktordankelipatan::KPK);
        helper.promptMateri("Mencoba KPK", this::inputKPK);
    }



    private static void operasiFaktor() {
        garis.garis();
        System.out.print("Masukkan bilangan yang ingin difaktorkan : ");
        int bilangan = scan.nextInt();
        int bil2 = bilangan;
        List<Integer> faktorisasi = new ArrayList<>();
        int faktor = 2;
        while (bilangan > 1) {
            if (bilangan % faktor == 0) {
                faktorisasi.add(faktor);
                bilangan /= faktor;
            } else {
                faktor++;
            }
        }
        System.out.println(bil2 + " setelah difaktorkan adalah " + faktorisasi);
    }

    private static void faktorisasi() {
        garis.garis();
        System.out.println("# Faktorisasi");
        System.out.println(
                """
                        Faktorisasi atau pemfaktoran adalah proses menguraikan suatu bilangan menjadi faktor-faktornya. Faktor disini kaya bilangan yang bisa dikalikan untuk menghasilkan bilangan yang kita mau. Contoh, faktorisasi dari 12 adalah 2 dan 6, karena 2 x 6 = 12. Faktorisasi dari 6 adalah 2 dan 3, karena 2 x 3 = 6.
                        """);
    }

    private static void faktorisasiPrima() {
        System.out.println("# Faktorisasi Prima");
        System.out.println(
                """
                        Faktorisasi prima adalah faktorisasi semua faktor yang dihasilkan adalah bilangan prima. Bilangan prima adalah bilangan yang hanya bisa dibagi oleh 1 dan bilangan itu sendiri, contoh :
                        1. Faktorisasi prima dari 12 adalah 12 = 22x312 = 22x3, karena 12 bisa dipecah menjadi 2 kali 6, lalu 6 dipecah lagi menjadi 2 kali 3.
                        2. Faktorisasi prima dari 30 adalah 30 = 2x3x530 = 2x3x5, karena 30 bisa dipecah menjadi 2,3 dan 5, yang semuanya adalah bilangan prima.
                        """);
    }

    private static void pohonFaktor() {
        garis.garis();
        System.out.println("# Pohon Faktor");
        System.out.println(
                """
                        Secara sederhana cara mencari faktorisasi, kita bisa pakai pohon faktor dimana kita melakukan pembagian berulang-ulang sampai bilangan yang kita bagi adalah bilangan prima.
                        Misalnya kita memiliki bilangan 100 maka pohon faktornya adalah seperti ini :
                        100
                          ||
                        2   50
                            ||
                           2  25
                               ||
                              5  5
                        Dari pohon faktor di atas, kita bisa liat bahwa faktorisasi dari 100 adalah 2 x 2 x 5 x 5 atau 2^^2 x 5^^2.
                        Kalau di pemrograman kita bisa pake loop dan modulus untuk mencari faktorisasi dari suatu bilangan. Berikut contoh implementasinya
                        List<Integer> faktorisasi = new ArrayList<>();
                        int bilangan = 100;
                        int faktor = 2;
                        int []hasilFaktorisasi = {};
                        while (bilangan>1) {
                            if (bilangan%faktor==0) {
                                faktorisasi.add(faktor);
                                bilangan/=faktor;
                            } else{
                                faktor++;
                            }
                        }""");
        List<Integer> faktorisasi = new ArrayList<>();
        int bilangan = 100;
        int faktor = 2;
        while (bilangan > 1) {
            if (bilangan % faktor == 0) {
                faktorisasi.add(faktor);
                bilangan /= faktor;
            } else {
                faktor++;
            }
        }
        System.out.println(faktorisasi);
    }

    private static void kelipatan() {
        garis.garis();
        System.out.println("# Kelipatan");
        System.out.println(
                """
                        Kelipatan adalah hasil dari perkalian suatu bilangan dengan bilangan lain. Misalnya kamu memiliki bilangan a dan dikaitkan dengan bilangan n (positif, negatif, atau nol), maka hasilnya adalah kelipatan dari a.
                        Misalnya jika a = 3 maka kelipatan dari 3 adalah :
                        - 3 x 1 = 3
                        - 3 x 2 = 6
                        - 3 x 3 = 9
                        Jika kelipatan diimplementasikan dalam pemrograman, kita bisa menggunakan loop untuk melakukan perkalian berulang. Contohnya seperti ini:
                        int a = 3;
                        int n = 5;
                        List<Integer> hasil_kelipatan = new ArrayList<>();
                        for(int i =1; i<=n; i++){
                            hasil_kelipatan.add(a*i);
                        }""");
        int a = 3;
        int n = 5;
        List<Integer> hasil_kelipatan = new ArrayList<>();
        for(int i =1; i<=n; i++){
            hasil_kelipatan.add(a*i);
        }
        System.out.println("Hasilnya adalah "+hasil_kelipatan);
    }
    private static void FPB(){
        garis.garis();
        System.out.println("# Faktor Persekutuan Terbesar");
        System.out.println("FPB itu angka terbesar yang bisa membagi dua bilangan tanpa sisa. FPB biasanya dipakai untuk mencari kesamaan dari dua bilangan yang berbeda.");
        System.out.println("Nah untuk mencari FPB kita bisa mulai dengan mencari faktorisasi dari kedua bilangan tersebut, lalu kita cari faktor yang sama dari kedua bilangan tersebut. Contoh kalo kita mau cari FPB dari 12 dan 18 kita bisa lakukan seperti ini:");
        System.out.println("""
                12 = 1,2,3,4,5,6,12
                18 = 1,2,3,6,9,18
                Kita bisa lihat bahwa angka yang sama-sama ada di faktorisasi dari 12 dan 18 adalah 1,2,3 dan 6. Nah dari angka-angka ini kita bisa ambil yang terbesar yaitu 6, jadi FPB dari 12 dan 18 adalah 6.
                Cara lainnya adalah menggunakan algoritma Euclidean yang rumusnya adalah :

                FPB (a,b) = FPB(b,a mod b)

                Cara ngitungnya kek gini :
                1. Ambil dua bilangan a dan b
                2. Bagi a dengan b dan simpan sisanya (modulus), misalnya r = a mod b
                3. Ganti a dengan b dan b dengan r
                4. Ulangi langkah 2 dan 3 sampai sisanya (r) menjadi 0
                5. Kalo r udah 0, maka FPB dari a dan b adalah b

                Pusing? Tenang, mari jadiin kode aja biar lebih mudah dimengerti kek gini :
                int a = 12;
                int b = 18;
                while (b!=0) {
                    int t = b;
                    b = a%b;
                    a = t;
                }""");
        int a = 12;
        int b = 18;
        while (b!=0) {
            int t = b;
            b = a%b;
            a = t;
        }
        System.out.println("Hasilnya adalah "+a);
    }
    private void inputFPB(){
        System.out.print("Isi nilai a :");
        int a = scan.nextInt();
        System.out.print("Isi nilai b :");
        int b = scan.nextInt();
        while (b!=0) {
            int t = b;
            b = a%b;
            a = t;
        }
        System.out.println("Hasilnya adalah "+a);
    }
    private static int hitung_fpb(int a, int b){
        while (b!=0) {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    private static void KPK(){
        garis.garis();
        System.out.println("# Kelipatan Persekutuan Terkecil");
        System.out.println("""
                Kelipatan Persekutuan Terkecil adalah angka terkecil yang bisa dibagi habis oleh kedua bilangan, misalnya KPK dari 12 dan 18 adalah 36, karena 36 adalah angka terkecil yang bisa dibagi habis oleh kedua bilangan tersebut.
                Gak percaya? Coba kita itung 12 x 3 = 36 dan 18 x 2 = 36.
                Untuk mencari KPK, kita bisa pakai rumus ini :
                KPK (a,b) = a x b / FPB (a,b)
                Kalo disimulasikan kek gini :
                1. Kita punya FPB dari 12 dan 18 yaitu 6
                2. 12 x 18 = 216 (gede banget)
                3. 216 / 6 = 36 (nah ini KPKnya)
                Mari kita jadiin kode biar lebih mudah dimengerti:
                int a = 12;
                int b = 18;
                int KPK1218 = (a*b)/hitung_fpb(a,b);""");
        int a = 12;
        int b = 18;
        int KPK1218 = (a*b)/hitung_fpb(a,b);
        System.out.println("Hasilnya adalah "+KPK1218);
    }
    private void inputKPK(){
        System.out.print("Input a :");
        int a = scan.nextInt();
        System.out.print("Input b :");
        int b = scan.nextInt();
        int hasilKPK = (a*b)/hitung_fpb(a,b);
        System.out.println("Hasilnya KPKnya adalah "+hasilKPK);
    }
}
