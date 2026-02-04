import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = 2;
    System.out.println("Enter the value for n: ");
    int n = in.nextInt();
    boolean[] set = new boolean[n];

    for (int i = 0; i < n; i++) {
        set[i] = true;
    }

    while (p < n && p < Math.sqrt(n)) {
    set[2 * p] = false;
    
    p++;
    }


    }
}
