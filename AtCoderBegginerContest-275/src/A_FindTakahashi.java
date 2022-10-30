package src;
import java.util.*;

public class A_FindTakahashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H[] = new int[N];
        int max = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            H[i] = scanner.nextInt();
            if (max < H[i]) {
            max = H[i];
            ans = i+1;
            }
        }
        scanner.close();

        System.out.println(ans);
    }
}