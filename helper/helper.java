package matematikatapikode.helper;

import java.util.Scanner;

public class helper {
    private static final Scanner scan = new Scanner(System.in);

    public static boolean promptMateri(String materi, Runnable action) {
        System.out.print("Ingin membaca " + materi + "? (1 untuk ya, lainnya untuk tidak): ");
        int pilihan = scan.nextInt();
        if (pilihan == 1) {
            action.run();
            return true;
        }
        return false;
    }
}
