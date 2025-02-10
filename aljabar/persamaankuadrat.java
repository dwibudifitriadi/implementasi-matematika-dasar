package matematikatapikode.aljabar;

import java.util.Scanner;

import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;

public class persamaankuadrat {
        static private garis garis = new garis();
    static private Scanner scan = new Scanner(System.in);

    public void mulai() {
        garis.garis();
        helper.promptMateri("Tentang Persamaan Kuadrat", persamaankuadrat::tentangPKuadrat);
        helper.promptMateri("Rumus Umum", persamaankuadrat::rumusUmum);
        helper.promptMateri("Diskriminan", persamaankuadrat::diskriminan);
        helper.promptMateri("Menggunakan Rumus", persamaankuadrat::gunakanRumus);

    }
    private static void tentangPKuadrat(){
        garis.garis();
        System.out.println("# Persamaan Kuadrat");
        System.out.println("""
            Persamaan kuadrat adalah persamaan polinomial tingkat dua yang memiliki bentuk umum:  
            ax² + bx + c = 0
            dengan x  sebagai variabel tak dikenal, dan a, b, c adalah koefisien.
            Contohnya:  x² + 2x + 1 = 0. Nilai a harus berbeda dari nol, jika a = 0, persamaan menjadi linear ( bx + c = 0 ).
                """);
    }
    private static void rumusUmum(){
        garis.garis();
        System.out.println("# Rumus Umum");
        System.out.println("""
            Akar akar dari persamaan kuadrat dapat ditemukan dengan menggunakan rumus kuadrat. Rumusnya adalah :
            x = -b ± √ b² - 4ac / 2a
            Dimana ± disini berarti dua kemungkinan nilai untuk x. Rumus ini dikenal sebagi rumus kuadrat atau rumus abc. Rumus ini dapat digunakan untuk menemukan akar-akar dari persamaan kuadrat ax² + bx + c = 0.
        """);
    }
    private static void diskriminan (){
        garis.garis();
        System.out.println("# Diskriminan");
        System.out.println("""
                Diskriminan adalah bagian dari rumus kuadrat yang terletak di bawah tanda akar. Diskriminan digunakan untuk menentukan jenis akar dari persamaan kuadrat. Diskriminan didefinisikan sebagai:
                                D = b² = 4ac
                Dimana a,b, dan c adalah koefisien dari persamaan kuadrat ax² + bx + c = 0. Berikut adalah beberapa kemungkinan nilai diskriminan:
                - Jika D > 0, maka persamaan kuadrat memiliki solusi bilangan real.
                - Jika D = 0, maka persamaan kuadrat memiliki dua akar real yang sama.
                - Jika D < 0, maka persamaan kuadrat memiliki dua akar kompleks.
                """);
    }
    private static void gunakanRumus(){
        garis.garis();
        System.out.println("# Menggunakan Rumus Kuadrat");
        System.out.println("""
                Akar - akar persamaan kuadrat adalah dua nilai x, yang diperoleh dengan menyelesaikan persamaan kuadrat. Akar-akar persamaan kuadrat ini juga disebut angka nol dari persamaan tersebut. Sebagai contoh, akar-akar persamaan x² - 3x - 4 = 0 dapat dicari dengan menggunakan cara berikut :
                        x = -b ± √b² - 4ac / 2a
                        x = -(-3) ± √3² - 4.1.(-4) / 2.1
                        x = 3 ± √9 - - 16 / 2
                        x = 3 ± √9 + 16 / 2
                        x = 3 ± √25 / 2
                        x = 3 + 5 / 2
                Mari kita sederhanakan menjadi :
                        x = 3 + 5 / 2
                        x = 8/2 atau x = -2/2
                Yang akhirnya menjadi x = 4 atau x = -1. Jadi, akar-akar dari persamaan x² - 3x - 4 = 0 adalah x = 4 dan x = -1
                Jika Diimplementasikan dalam kode, maka hasilnya adalah seperti ini :
                
                public static void cariAkarPersamaan(double a, double b, double c) {
                    // Langkah 1: Hitung b^2 dan 4ac
                    double bSquared = b * b;
                    double fourAC = 4 * a * c;

                    // Langkah 2: Hitung diskriminan
                    double discriminant = bSquared - fourAC;

                    if (discriminant >= 0) {
                        // Jika diskriminan >= 0, lanjutkan dengan akar real
                        // Langkah 3: Hitung akar dari diskriminan
                        double sqrtDiscriminant = Math.sqrt(discriminant);

                        // Langkah 4: Hitung dua kemungkinan nilai untuk x
                        double root1 = (-b + sqrtDiscriminant) / (2 * a);
                        double root2 = (-b - sqrtDiscriminant) / (2 * a);
                        System.out.printf("x1 = (-%.2f + %.2f) / (2 * %.2f) = %.2f%n", b, sqrtDiscriminant, a, root1);
                        System.out.printf("x2 = (-%.2f - %.2f) / (2 * %.2f) = %.2f%n", b, sqrtDiscriminant, a, root2);
                        System.out.printf("Akar-akarnya adalah: x1 = %.2f dan x2 = %.2f%n", root1, root2);
                    } else {
                        // Jika diskriminan < 0, akar kompleks
                        double realPart = -b / (2 * a);
                        double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                        System.out.printf("x1 = %.2f + %.2fi%n", realPart, imaginaryPart);
                        System.out.printf("x2 = %.2f - %.2fi%n", realPart, imaginaryPart);
                    }
                }
                """);
                double a = 1;
                double b = -3;
                double c = -4;
        
                cariAkarPersamaan(a, b, c);
    }
    public static void cariAkarPersamaan(double a, double b, double c) {
        // Langkah 1: Hitung b^2 dan 4ac
        double bSquared = b * b;
        double fourAC = 4 * a * c;

        // Langkah 2: Hitung diskriminan
        double discriminant = bSquared - fourAC;

        if (discriminant >= 0) {
            // Jika diskriminan >= 0, lanjutkan dengan akar real
            // Langkah 3: Hitung akar dari diskriminan
            double sqrtDiscriminant = Math.sqrt(discriminant);

            // Langkah 4: Hitung dua kemungkinan nilai untuk x
            double root1 = (-b + sqrtDiscriminant) / (2 * a);
            double root2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.printf("x1 = (-%.2f + %.2f) / (2 * %.2f) = %.2f%n", b, sqrtDiscriminant, a, root1);
            System.out.printf("x2 = (-%.2f - %.2f) / (2 * %.2f) = %.2f%n", b, sqrtDiscriminant, a, root2);
            System.out.printf("Akar-akarnya adalah: x1 = %.2f dan x2 = %.2f%n", root1, root2);
        } else {
            // Jika diskriminan < 0, akar kompleks
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("x1 = %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("x2 = %.2f - %.2fi%n", realPart, imaginaryPart);
        }
    }
}