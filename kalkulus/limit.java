package matematikatapikode.kalkulus;

import java.util.Scanner;

import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;

public class limit {
    static private garis garis = new garis();
    public void mulai() {
        garis.garis();

        helper.promptMateri("Limit Fungsi", limit::limitFungsi);
        helper.promptMateri("Cara Menentukan Limit", limit::caraMenentukanLimit);

    }
    private static void limitFungsi() {
        garis.garis();
        System.out.println("# Limit Fungsi");
        System.out.println(
                """
                        Limit adalah suatu nilai yang didekati oleh suatu fungsi ketika fungsi diberi input yang juga mendekati suatu nilai tertentu. Limit biasa didefinisikan dengan
                                    lim f(x) = L
                                    x->a
                        Dengan memahami konsep limit, kita bisa dapat mudah untuk mengetahui perilaku sebuah fungsi pada titik-titik tertentu. Kita dapat mengetahui suatu fungsi tersebut apakah bersifat kontinu, tidak kontinu, atau diferensiabel.
                        """);
    }

    private static void caraMenentukanLimit() {
        garis.garis();
        System.out.println("# Cara Menentukan Limit");
        System.out.println(
                """
                        Misalnya terdapat sebuah fungsi f(x) = x + 3 dan kita ingin mengetahui nilai limit di sekitar x = 3. NIlai limit bisa didapat dengan menghitung nilai suatu fungsi dari beberapa nilai input x dari "kanan" dan/atau dari "kiri"


                        Kiri                Kanan
                        f(2.9) = 5.9        f(3.1) = 6.1
                        f(2.99) = 5.99      f(3.01) = 6.01
                        f(2.99) = 5.999     f(3.001) = 6.001
                        ...                 ....

                        atau dengan menggunakan kode program :
                        public static double f(double x) {
                            return x + 3;
                        }

                        public static void calculateLimit(double point) {
                            // Dari kanan
                            for (int i = 1; i <= 10; i++) {
                                double delta = 1 / Math.pow(10, i);
                                double y = f(point + delta);
                                System.out.println("f(" + (point + delta) + ") = " + y);
                            }

                            // Dari kiri
                            for (int i = 1; i <= 10; i++) {
                                double delta = 1 / Math.pow(10, i);
                                double y = f(point - delta);
                                System.out.println("f(" + (point - delta) + ") = " + y);
                            }
                        }
                        calculateLimit(3);
                        """);
        System.out.println("Hasilnya adalah ");
        calculateLimit(3);
        System.out.println(
                """
                Baik dari kiri maupun kanan, semua nilai fungsi mendekati nilai 6. Dengan begitu nilai limit dari fungsi di sekitar pada x = 3 adalah 6. Sekilas hasilnya identik dengan ketika kita langsung memberi input x = 3 pada fungsi tersebut. Namun terdapat satu keunikan yaitu limit dari suatu fungsi dapat tetap dihitung walaupun fungsi tersebut tidak terdefinisi di titik yang ditentukan. Sebagai contoh, ambil sebuah fungsi yang mirip dengan f(x) = x + 3 yakni g(x) = x² - 9 / x - 3
                Begini implementasi kodenya :
                public static double f2(double x) {
                    return (Math.pow(x, 2) - 9) / (x - 3);
                }

                public static void calculateLimit2(double point) {
                // Dari kanan
                    for (int i = 1; i <= 10; i++) {
                        double delta = 1 / Math.pow(10, i);
                        double y = f(point + delta);
                        System.out.println("f(" + (point + delta) + ") = " + y);
                    }

                // Dari kiri
                    for (int i = 1; i <= 10; i++) {
                        double delta = 1 / Math.pow(10, i);
                        double y = f(point - delta);
                        System.out.println("f(" + (point - delta) + ") = " + y);
                    }
                }
                        """);
        System.out.println("Dan ini hasilnya :");
        calculateLimit(3);
    }

    private static double f(double x) {
        return x + 3;
    }

    private static void calculateLimit(double point) {
        // Dari kanan
        for (int i = 1; i <= 10; i++) {
            double delta = 1 / Math.pow(10, i);
            double y = f(point + delta);
            System.out.println("f(" + (point + delta) + ") = " + y);
        }

        // Dari kiri
        for (int i = 1; i <= 10; i++) {
            double delta = 1 / Math.pow(10, i);
            double y = f(point - delta);
            System.out.println("f(" + (point - delta) + ") = " + y);
        }
    }

    public static double f2(double x) {
        return (Math.pow(x, 2) - 9) / (x - 3);
    }

    public static void calculateLimit2(double point) {
        // Dari kanan
        for (int i = 1; i <= 10; i++) {
            double delta = 1 / Math.pow(10, i);
            double y = f(point + delta);
            System.out.println("f(" + (point + delta) + ") = " + y);
        }

        // Dari kiri
        for (int i = 1; i <= 10; i++) {
            double delta = 1 / Math.pow(10, i);
            double y = f(point - delta);
            System.out.println("f(" + (point - delta) + ") = " + y);
        }
    }

}
