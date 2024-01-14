import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            return;
        }

        List<Integer> intArr = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                intArr.add(i);
                num /= i;
            }
        }

        for (int i = 0; i < intArr.size(); i++) {
            System.out.println(intArr.get(i));
        }
    }
}