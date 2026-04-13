import java.util.Scanner;

public class FirstOccurrence {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            if (!sc.hasNextInt()) return;
            int k = sc.nextInt();
            
            int position = -1;
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    int val = sc.nextInt();
                    if (val == k && position == -1) {
                        position = i + 1;
                    }
                }
            }
            
            System.out.println(position);
        }
    }
}
