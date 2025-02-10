package matematikatapikode.aljabar;
import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;

public class fungsi {
    static private garis garis = new garis();
    public void mulai(){
        garis.garis();
        helper.promptMateri("Fungsi",fungsi::operasifungsi);
        helper.promptMateri("Fungsi Perkalian", fungsi::fungsiperkalian);
        helper.promptMateri("Fungsi Komposisi", fungsi::fungsikomposisi);
        helper.promptMateri("Fungsi Invers", fungsi::fungsiinvers);

    }
    private static void operasifungsi(){
        garis.garis();
        System.out.println("# Operasi pada Fungsi (Penjumlahan & Pengurangan)");
        System.out.println("""
            Penjumlahan dan pengurangan fungsi dilakukan dengan cara menambahkan atau mengurangkan fungsi satu dengan fungsi lainnya. Misalnya :
            f(x) = 2x + 3
            g(x) = 3x - 2
            Maka penjumalahn kedua fungsi tersebut adalah
            (f + g)(x) = f(x)+g(x)
                       = (2x + 3)+(3x - 2)
                       = 5x + 1
            Apabila kita jadikan sebagai fungsi di pemrograman, maka akan menjadi seperti berikut :
            private static int f(int x){
                return 2 * x + 3;
            }
            private static int g(int x){
                return 3 * x - 2;
            }
            private static int fg(int x){
                return f(x) + g(x);
            }""");
        System.out.println("Hasil f(1) = "+f(1));
        System.out.println("Hasil f(2) = "+f(2));
        System.out.println("Hasil g(1) = "+g(2));
        System.out.println("Hasil fg(1) = "+fg(1));
        System.out.println("Hasil fg(2) = "+fg(2));
    }
    private static int f(int x){
        return 2 * x + 3;
    }
    private static int g(int x){
        return 3 * x - 2;
    }
    private static int fg(int x){
        return f(x) + g(x);
    }
    private static void fungsiperkalian(){
        garis.garis();
        System.out.println("# Perkalian Fungsi");
        System.out.println("""
                Perkalian fungsi dilakukan dengan cara mengalikan fungsi satu dengan fungsi lainnya. Misalnya :
                f(x) = 2x + 3
                g(x) = 3x - 2
                Maka perkalian dari kedua fungsi tersebut adalah :
                (f.g)(x) = f(x).g(x)
                         = (2x + 3).(3x -2)
                         = 6x^^2 + 4x - 6
                Apabila kita jadikan sebagai fungsi di pemrograman, maka akan menjadi seperti berikut :
                private static int f(int x){
                    return 2 * x + 3;
                }
                private static int g(int x){
                    return 3 * x - 2;
                }
                private static int fg(int x){
                    return f(x) + g(x);
                }""");
        System.out.println("Hasil perkalian (f.g)(x) ketika x adalah 2 = "+fgkali(2));
    }
    private static int fkali(int x){
        return 2 * x + 3;
    }
    private static int gkali(int x){
        return 3 * x - 2;
    }
    private static int fgkali(int x){
        return fkali(x) * gkali(x);
    }
    private static void fungsikomposisi(){
        garis.garis();
        System.out.println("# Fungsi Komposisi");
        System.out.println("""
                Fungsi komposisi adalah fungsi yang hasilnya adalah fungsi lain. Misalnya :
                f(x) = 2x + 3
                g(x) = 3x - 2
                Maka fungsi komposisi dari kedua fungsi tersebut adalah :
                (f o g)(x) = f(g(x))
                           = f(g(x))
                           = f(3x - 2)
                           = 2(3x - 2) + 3
                           = 6x - 4 + 3
                           = 6x - 1
                Apabila kita jadikan sebagai fungsi di pemrograman, maka akan menjadi seperti berikut :
                private static int fkom(int x){
                    return 2 * x + 3;
                }
                private static int gkom(int x){
                    return 3 * x - 2;
                }
                private static int fgkom(int x){
                    return fkom(gkom(x));
                }""");
        System.out.println("Hasil dari fungsi komposisinya ketika x = 2 adalah "+fgkom(2));
    }
    private static int fkom(int x){
        return 2 * x + 3;
    }
    private static int gkom(int x){
        return 3 * x - 2;
    }
    private static int fgkom(int x){
        return fkom(gkom(x));
    }
    private static void fungsiinvers(){
        System.out.println("# Invers FUngsi");
        System.out.println("""
                Invers fungsi adalah fungsi yang hasilnya adalah fungsi lain yang merupakan kebalikan dari fungsi tersebut. Misalnya :
                f(x) = 2x + 3
                Maka untuk mencari invers dari fungsi tersebut, kita harus mencari f⁻¹ (x) dimana f⁻¹(f(x)) = x.
                Langkah-langkah untuk mencari invers fungsi adalah sebagai berikut:
                1. Ubah bentuk y = f(x) menjadi x = f⁻¹(y)
                2. Selesaikan x dari persamaan tersebut
                3. Gantikan x dengan f⁻¹(y)
                4. Selesaikan persamaan tersebut
                
                Contoh untuk mencari invers dari fungsi f(x) = 2x + 6 adalah sebagai berikut :
                y = f(x) = 2x + 6
                2x = y - 6
                x = 1/2y - 3
                Maka invers dari fungsi f(x) = 2x + 6 adalah f⁻¹(x) = 1/2x -3

                Apabila kita jadikan sebagai fungsi di pemrograman dimana nilai x sudah diketahui dan outputnya adalah nilai y, maka akan menjadi seperti berikut:
                private static int fungsiInvert(int y,int a, int b){
                    if (a==0) {
                        throw new Error("Nilai a tidak boleh dari 0");
                    }
                    return (y - b)/a;
                }""");
                int hasilInvert = fungsiInvert(7, 2, 3);
                System.out.println("Hasilnya adalah "+hasilInvert);
    }
    private static int fungsiInvert(int y,int a, int b){
        if (a==0) {
            throw new Error("Nilai a tidak boleh dari 0");
        }
        return (y - b)/a;
    }
}
