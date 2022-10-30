package src;
import java.util.*;

public class A_FindTakahashi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            List<Integer> partList = new ArrayList<>(N);
            int n = scanner.nextInt();
            partList.add(i);
            partList.add(n);
            list.add(partList);
        }
        scanner.close();

        List<Integer> max = new ArrayList<>();
        max.add(0);
        max.add(0);
        
        for (int i = 0; i < list.size(); i++) {
            if(max.get(1) <= list.get(i).get(1)) {
                max.add(0,list.get(i).get(0));
                max.add(1,list.get(i).get(1));
            }
        }

        System.out.println(max.get(0)+1);
    }
}

