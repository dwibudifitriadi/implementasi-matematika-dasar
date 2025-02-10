package matematikatapikode.aritmatika;


import matematikatapikode.hanyaGaris.garis;

public class sistembilangan {
    static private garis garis = new garis();
    public void sistembilangan() {
        garis.garis();
        System.out.println(
                """
                        Bilangan merupakan dasar dari matematika, semuanya di matematika pake bilangan. Dalam pemrograman, bilangan juga sangat penting. Kita bisa melakukan berbagai operasi matematika dengan bilangan, seperti penjumlahan, pengurangan, perkalian, dan pembagian.
                        Namun bilangan di pemrograman dibagi-bagi ke beberapa jenis, tergantung dari tipe datanya. Jadinya penggunaan bilangan di program bakalan sedikit beda dengan di matematika biasa.\
                        """);
        garis.garis();
        System.out.println("# Bilangan Bulat (Integer)");
        System.out.println(
                "Bilangan bulat adalah bilangan yang tidak punya koma. Di pemrograman, bilangan bulat biasanya disebut dengan integer. Contoh bilangan bulat adalah 1, 2, 3, 4, 5, dan seterusnya.");
        System.out.println(
                """
                        Contoh penulisan bilangan bulat dalam bahasa java adalah:
                        int bilbul = 10;
                        Meski kelihatannya sederhana, jangan lupa kalau di pemrograman, bilangan punya batasan! Contohnya, di java, bilangan paling besar yang bisa kamu pakai adalah 2,147,483,647 atau 2 pangkat 32. Itu angka yang sangat besar, aku aja bingung ngucapinnya.""");
        garis.garis();
        System.out.println("# Bilangan desimal (Float)");
        System.out.println(
                """
                        Bilangan desimal atau floating point adalah bilangan yang punya koma. Di pemrograman, bilangan desimal biasanya disebut dengan float atau double. Contoh bilangan desimal adalah 1.5, 2.3, 3.14, dan seterusnya. Untuk membuat bilangan desimal kamu bisa menggunakan kode seperti dibawah ini
                        Contoh penulisannya sebagai berikut :
                        float bildel = 3.14; // atau pi""");
        garis.garis();
        System.out.println("# Bilangan Pecahan (Fraction)");
        System.out.println(
                """
                        Bilangan pecahan adalah bilangan yang punya pembilang dan penyebut. Di pemrograman, bilangan pecahan biasanya disebut dengan fraction. Contoh bilangan pecahan adalah 1/2, 3/4, 5/6, dan seterusnya. Sayangnya di pemrograman, bilangan pecahan gak ada tipe datanya tapi langsung dihitung aja yang nantinya hasilnya bakal jadi bilangan desimal. Contoh penggunaannya seperti ini:
                        int bilpec = 1/2; // 0.5
                        Gimana dengan Bilangan pecahan campuran kan di matematika ada kaya , di pemrograman juga bisa kok. Kita bisa menggunakan float atau double untuk bilangan pecahan campuran serta menambahkan casting. Contoh penggunaannya seperti ini:
                        float bilpeccamFloat = 1 + (float) 1 / 2; // 1.5
                        double bilpeccamDouble = 1 + (double) 1 / 2; // 1.5 """);
        garis.garis();
    }
}
