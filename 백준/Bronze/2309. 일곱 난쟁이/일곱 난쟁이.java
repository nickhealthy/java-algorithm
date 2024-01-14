import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            intList.add(Integer.valueOf(br.readLine()));
        }

        List<Integer> deleteList = new ArrayList<>();

        flag:
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = i + 1; j < intList.size(); j++) {
                int sum = intList.stream().mapToInt(a -> a).sum();
                // 잘못된 2개의 난쟁이만 찾아내면 7명의 난쟁이의 합이 100이 되도록 한다.
                if (intList.get(i) + intList.get(j) == sum - 100) {
                    deleteList.add(intList.get(i));
                    deleteList.add(intList.get(j));

                    break flag;
                }
            }
        }

        for (Integer num : deleteList) {
            intList.remove(num);
        }

        Collections.sort(intList);

        for (Integer num : intList) {
            System.out.println(num);
        }

    }
}