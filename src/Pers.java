import java.util.ArrayList;

public class Pers {
    ArrayList<Integer> w;
    Integer b;

    Pers(int b) {
        this.b = b;
    }

    Pers(ArrayList<Integer> w, int b) {
        this.w = w;
        this.b = b;
    }

    int sort(ArrayList<Integer> p) {
        int result = b;
        for (int i = 0; i < w.size(); i++) {
            result += w.get(i) * p.get(i);
        }
        if (result > 0) {
            return 1;
        }
        return 0;
    }

    void learning(ArrayList<ArrayList<Integer>> p, ArrayList<Integer> t) {
        for (int i = 0; i < p.size(); i++) {
            if (sort(p.get(i)) > t.get(i)) {
                for (int j = 0; j < w.size(); j++) {
                    w.set(j, w.get(i) - p.get(i).get(j));
                }
            }
        }
    }

    @Override
    public String toString() {
        return b + "\n" + w;
    }
}
