package matematikatapikode.aljabar;

import java.util.Arrays;
import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;

public class persamaanlinear {
    static private garis garis = new garis();
    public void mulai() {
        garis.garis();
        helper.promptMateri("Tentang Persamaan Linear", persamaanlinear::tentangPL);
        helper.promptMateri("Persamaan Linear Satu Variabel", persamaanlinear::PLsatuvariabel);
        helper.promptMateri("Persamaan Linear Dua Variabel", persamaanlinear::persamaanlinearduavariabel);
        helper.promptMateri("Metode Eliminasi", persamaanlinear::metodeeliminasi);

    }
    private static void tentangPL() {
        garis.garis();
        System.out.println("# Persamaan Linear");
        System.out.println(
                """
                        Persamaan adalah persamaan dengan variabel tunggal yang jika digambarkan membentuk garis lurus. Unsur pentingnya:
                        - Variabel: Nilai yang belum diketahui.
                        - Koefisien: Bilangan pengali variabel.
                        - Konstanta: Bilangan tanpa variabel.
                        - Suku: Bagian persamaan yang terdiri dari variabel, koefisien, atau konstanta.

                        Aturan dasar:
                        - Menambah/mengurangi bilangan di kedua ruas tidak mengubah nilai.
                        - Mengalikan/membagi kedua ruas dengan bilngan yang sama tidak mengubah nilai.
                        - Pindah ruas mengubah operasi (penjumlahan <-> pengurangan, perkalian <-> pembagian).
                        """);
    }

    private static void PLsatuvariabel() {
        garis.garis();
        System.out.println("# Persamaan Linear Satu Variabel");
        System.out.println(
                """
                        Persamaan ini biasanya ditulis dalam bentuk ax + b = c dimana a,b, dan c adalah bilangan rill dan x adalah variabel.
                        Contoh persamaan linear satu variabel :

                        2x + 3 = 7

                        Untuk mengetahui nilai x yang memenuhi persamaan tersebut, kita harus mencari nilai x yang membuat kedua ruas persamaan sama. Berikut langkah-langkahnya :
                        1. Eliminasi konstanta pada ruas kiri dengan cara mengurangkan konstanta pada ruas kiri dengan konstanta pada ruas kanan.
                                    2x + 3 - 3 = 7 - 3
                                    2x = 4
                        2. Eliminasi koefisien variabel dengan cara membagi kedua ruas dengan koefisien variabel.
                                    2x/2 = 4/2
                                    x = 2
                        3. Sehingga nilai x yang memenuhi persamaan tersebut adalah x = 2
                        Jika diimplementasikan dalam kode, maka hasilnya seperti ini :
                        static private int PLlinear(int a, int b, int c){
                            int x = (c-b)/a;
                            return x;
                        }
                        PLlinear(2, 3, 7);
                        """);
        System.out.println("Hasilnya adalah " + PLlinear(2, 3, 7));

    }

    static private int PLlinear(int a, int b, int c) {
        // Persamaan: a * x + b = c
        int x = (c - b) / a;
        return x;
    }

    private static void persamaanlinearduavariabel() {
        garis.garis();
        System.out.println("# Persamaan Linear Dua Variabel");
        System.out.println(
                """
                        Sesuai dengan namanya, persamaan ini memiliki dua variabel yang ditulis dalam bentuk ax + by = c dimana a,b,dan c adalah bilangan rill sementara x dan y adalah variabel. Contoh persamaan linear dua variabel :
                        2x + 3y = 7
                        Ada 2 cara untuk menyelesaikan persamaan, yaitu dengan menggunakan metode substitusi atau eliminasi. Untuk metode substitusi, kita bisa mengganti salah satu variabel dengan nilai yang sudah diketahui. Sedangkan untuk metode eliminasi, kita bisa menghilangkan salah satu variabel dengan cara mengalikan salah satu persamaan dengan bilangan tertentu.
                        """);
        garis.garis();
        System.out.println("# Metode Substitusi");
        System.out.println(
                """
                        Berikut contoh penyelesaian persamaan di atas dengan menggunakan metode substitusi :
                        1. Kita pilih salah satu variabel untuk diisolasi, misalnya kita pilih x.
                        2. Variabel yang kita isolasi kemudian kita simpan dan pindahkan lainnya ke kanan.
                                    2x = 7 - 3y
                        3. Karena nilai yang diisolasi adalah 2x maka kita bagi kedua ruas dengan dua.
                                    x = 7 - 3y / 2
                                    x = (7 / 2) - (3y / 2)
                        4. Nah kita dapat solusi parametrik dari x
                        Nilai parametrik inilah yang nantinya berapapun nilai y yang kita massukkan akan menghasilkan nilai x yang sesuai. Misalnya nilai y = 1 maka :
                                    x = (7 - 3(1)) / 2
                                    x = 4 / 2
                                    x = 2
                        Bagaimana jika permasalahan ini kita jadikan kode? Berikut contoh implementasinya:
                        static private int[] pldv(int a, int b, int c, int y){
                            int x = ( c - b * y ) / a ;
                            return new int [] {y,x};
                        }""");
        int[] result = pldv(2, 3, 7, 1);
        System.out.println("Hasilnya adalah " + Arrays.toString(result));
    }

    static private int[] pldv(int a, int b, int c, int y) {
        int x = (c - b * y) / a;
        return new int[] { y, x };
    }

    static private void metodeeliminasi() {
        garis.garis();
        System.out.println("# Metode Eliminasi");
        System.out.println(
                """
                        Jika menggunakan metode eliminasi, kita membutuhkan 2 persamaan sebagai perbandingan. Misalnya kita punya 2 persaaan berikut :
                        2x + 3y = 7
                        3x - 2y = 8
                        Jika sudah memiliku dua persamaan, kita bisa menghilangkan salah satu variabel dengan bilangan tertentu. Berikut langkah - langkahnya :
                        1. Ubah kedua persamaan menjadi bentuk standar.
                                2x + 3y = 7
                                3x - 2y = 8
                        2. Kita akan mengeliminasi variabel y dengan cara mengalikan persamaan (1) dengan 2 dan persamaan (2) dengan 3 (koefisien yang sama kita pilih).
                                4x + (3 x 2y) = 7 x 2
                                9x - (2 x 3y) = 8 x 3
                                4x + 6y = 14
                                9x - 6y = 24
                        3. Nah nilai y udah sama, tinggal kita kurangkan persamaan (1) dengan persamaan (2).
                                4x + 6y = 14
                                9x - 6y = 24
                                __________ -
                                -5x = -10
                        4. Kita bagi kedua ruas dengan -5.
                                -5x / -5 = -10 / -5
                                x = 2
                        5. Nah kita sudah mendapatkan nilai x sekarang kita cari nilai y dengan cara substitusi nilai x ke salah satu persamaan
                                2x + 3y = 7
                                2(2) + 3y = 7
                                4 + 3y = 7
                                3y =3
                                y = 1
                        6. Sehingga nilai x dan y yang memenuhi persamaan tersebut adalah x = 2 dan y = 1.

                        Bagaimana jika permasalahan ini kita jadikan kode? Berikut contoh implementasinya:
                        public static double[] eliminasi_pldv(double a1, double b1, double c1, double a2, double b2, double c2) {
                            // Menghitung koefisien eliminasi
                            double factor = a2 / a1;

                            // Membuat persamaan baru dengan mengurangi
                            double new_b2 = b2 - factor * b1;
                            double new_c2 = c2 - factor * c1;

                            // Menyelesaikan untuk y
                            double y = new_c2 / new_b2;

                            // Menyelesaikan untuk x
                            double x = (c1 - b1 * y) / a1;

                            // Mengembalikan hasil dalam bentuk array
                            return new double[] { x, y };
                        }
                            eliminasi_pldv(2, -3, 7, 3, -2, 8);
                        """);
                
        double []result = eliminasi_pldv(2, 3, 7, 3, -2, 8);
        System.out.println("Hasilnya adalah : [ x = " +result[0]+", y = "+result[1]+"]");
    }

    public static double[] eliminasi_pldv(double a1, double b1, double c1, double a2, double b2, double c2) {
        // Menghitung koefisien eliminasi
        double factor = a2 / a1;

        // Membuat persamaan baru dengan mengurangi
        double new_b2 = b2 - factor * b1;
        double new_c2 = c2 - factor * c1;

        // Menyelesaikan untuk y
        double y = new_c2 / new_b2;

        // Menyelesaikan untuk x
        double x = (c1 - b1 * y) / a1;

        // Mengembalikan hasil dalam bentuk array
        return new double[] { x, y };
    }
}
