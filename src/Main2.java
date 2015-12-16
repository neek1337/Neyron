import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input2.txt"));
        int size = 2;
        int b = scanner.nextInt();
        ArrayList<Integer> w = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            w.add(scanner.nextInt());
        }


        ArrayList<ArrayList<Integer>> p = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> t = new ArrayList<Integer>();

        while(scanner.hasNextInt()){
            ArrayList<Integer> p1 = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                p1.add(scanner.nextInt());
            }
            p.add(p1);
            t.add(scanner.nextInt());
        }



        Pers pers = new Pers(w, b);
        pers.learning(p,t);
        System.out.println(pers);

    }
}
