import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hash {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();

        int iterations = 100000;
        int colletionsize = 1000000;
        int neigbours = 0;

        for(int i = 0;i<colletionsize;i++){
            hm.put(i, i);
        }

        Random rnd = new Random();
        long start = System.currentTimeMillis();
        for (int j = 0; j < iterations; j++) {
            int query = rnd.nextInt(colletionsize - 100);
            for (int i = 0; i < neigbours +1; i++) {
                hm.get(query + i);
            }
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
    }
}
