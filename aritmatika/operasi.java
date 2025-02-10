package matematikatapikode.aritmatika;

import java.util.Scanner;

import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;

public class operasi {
        static private garis garis = new garis();
        static private Scanner scan = new Scanner(System.in);

        public void operasiBilangan() {
                garis.garis();
                helper.promptMateri("Operasi Dasar", this::operasiDasar);
                helper.promptMateri("Mencoba Operasi Dasar", this::operasiDasarInput);
                helper.promptMateri("Operasi Pangkat", this::operasiPangkat);
                helper.promptMateri("Mencoba Operasi Pangkat", this::operasiPangkatInput);
                helper.promptMateri("Operasi Akar", this::operasiAkar);
                helper.promptMateri("Mencoba Operasi Akar", this::operasiAkarInput);
                helper.promptMateri("Operasi Akar Tanpa Modul", this::akarTanpaModul);
                helper.promptMateri("Mencoba Operasi Akar Tanpa Modul", this::akarTanpaModulInput);
        }

        private void operasiDasar() {
                System.out.println(
                                """
                                                # Operasi Dasar
                                                Di pemrograman, kita bisa melakukan berbagai operasi matematika dengan bilangan. Ada penjumlahan, pengurangan, perkalian, dan pembagian. Berbeda dengan matematika biasa yang pakai simbol +, -, *, dan /, di pemrograman kita pakai simbol yang berbeda. Contoh penggunaannya seperti ini:""");
                int nilaiA = 10;
                int nilaiB = 5;
                System.out.println("""
                                int nilaiA = 10;
                                int nilaiB = 5;""");
                System.out.println("Hasil penjumlahan A + B adalah " + (nilaiA + nilaiB));
                System.out.println("Hasil pengurangan A - B adalah " + (nilaiA - nilaiB));
                System.out.println("Hasil perkalian A * B adalah " + (nilaiA * nilaiB));
                System.out.println("Hasil pembagian A / B adalah " + (nilaiA / nilaiB));
        }

        private void operasiDasarInput() {
                System.out.println("Coba masukkan nilai Anda sendiri untuk Operasi Dasar:");
                System.out.print("Masukkan bilangan pertama: ");
                int bil1 = scan.nextInt();
                System.out.print("Masukkan bilangan kedua: ");
                int bil2 = scan.nextInt();
                System.out.println("Hasil penjumlahan " + bil1 + " + " + bil2 + " adalah " + (bil1 + bil2));
                System.out.println("Hasil pengurangan " + bil1 + " - " + bil2 + " adalah " + (bil1 - bil2));
                System.out.println("Hasil perkalian " + bil1 + " x " + bil2 + " adalah " + (bil1 * bil2));
                System.out.println("Hasil pembagian " + bil1 + " / " + bil2 + " adalah " + (bil1 / bil2));
        }

        private void operasiPangkat() {
                System.out.println(
                                """
                                                # Pangkat (Exponentiation)
                                                Pangkat adalah operasi matematika yang digunakan untuk menghitung hasil perkalian bilangan dengan dirinya sendiri sebanyak kali. Di pemrograman, kita bisa menggunakan operator ** ataupun pakai pow() untuk menghitung pangkat. Contoh penggunaannya seperti ini:
                                                int konstanta = 3;
                                                int pangkat = 2;
                                                double hasilPangkat = Math.pow(konstanta, pangkat); // 9.0""");
                int konstanta = 3;
                int pangkat = 2;
                double hasilPangkat = Math.pow(konstanta, pangkat);
                System.out.println("Hasil dari " + konstanta + " dipangkatkan " + pangkat + " adalah " + hasilPangkat);
        }

        private void operasiPangkatInput() {
                System.out.println("Coba masukkan nilai Anda sendiri untuk Operasi Pangkat:");
                System.out.print("Masukkan bilangan (base): ");
                int base = scan.nextInt();
                System.out.print("Masukkan pangkat (exponent): ");
                int exponent = scan.nextInt();
                double hasil = Math.pow(base, exponent);
                System.out.println("Hasil dari " + base + " dipangkatkan " + exponent + " adalah " + hasil);
        }

        private void operasiAkar() {
                System.out.println(
                                """
                                                # Akar (Root)
                                                Setiap bahasa pemrograman juga biasanya punya fungsi untuk menghitung akar. Di Java, kita bisa menggunakan fungsi Math.sqrt() (Square Root) untuk menghitung akar. Contoh penggunaannya seperti ini:""");
                int nilaiAwal = 9;
                double hasilAkar = Math.sqrt(nilaiAwal);
                System.out.println("""
                                int nilaiAwal = 9;
                                double hasilAkar = Math.sqrt(nilaiAwal);""");
                System.out.println("Akar dari " + nilaiAwal + " adalah " + hasilAkar);
        }

        private void operasiAkarInput() {
                System.out.println("Coba masukkan nilai Anda sendiri untuk Operasi Akar:");
                System.out.print("Masukkan bilangan: ");
                int bilangan = scan.nextInt();
                double hasilAkar = Math.sqrt(bilangan);
                System.out.println("Akar dari " + bilangan + " adalah " + hasilAkar);
        }

        private void akarTanpaModul() {
                System.out.println(
                                """
                                                # Akar (Tanpa Modul)
                                                Kita juga bisa mencari akar dari n tanpa memakai modul dengan cara memanfaatkan persamaan
                                                n = x^2 + a
                                                dengan x adalah perpangkatan terdekat dari n dan sisanya adalah a. Sebagai contoh n = 18 maka x = 4 lalu sisanya kita bisa cari dengan cara a = n - x^2. Kalau di kodingan seperti ini:
                                                int n = 18;
                                                int x = 1;
                                                while ((x + 1) * (x + 1) <= n) {
                                                        x++;
                                                }
                                                int a = n - x * x;""");
                int n = 18;
                int x = 1;
                while ((x + 1) * (x + 1) <= n) {
                        x++;
                }
                int a = n - x * x;
                System.out.println("Nilai x: " + x);
                System.out.println("Nilai a: " + a);
        }
        private void akarTanpaModulInput() {
                System.out.println("Coba masukkan nilai Anda sendiri untuk Akar Tanpa Modul:");
                System.out.print("Masukkan bilangan n: ");
                int n = scan.nextInt();
                int x = 1;
                while ((x + 1) * (x + 1) <= n) {
                    x++;
                }
                int a = n - x * x;
                System.out.println("Nilai x (akar terdekat): " + x);
                System.out.println("Sisa nilai a: " + a);
            }
}
