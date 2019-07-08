import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(getP(n));
    }

    public static boolean numberIsPrime(int n) {
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return true;
    }

    public static List<Integer> getP(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) if (numberIsPrime(i)) list.add(i);
        return list;
    }


}
