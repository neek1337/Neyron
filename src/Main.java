import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        int size  = 2;
        int b  = scanner.nextInt();
        ArrayList<Integer> w = new ArrayList<Integer>();
        ArrayList<Integer> p  = new ArrayList<Integer>();


        for (int i = 0; i < size; i++) {
            w.add(scanner.nextInt());
        }
        for (int i = 0; i < size; i++) {
            p.add(scanner.nextInt());
        }

        Pers pers = new Pers(w,b);
        System.out.println(pers.sort(p));

    }
}
