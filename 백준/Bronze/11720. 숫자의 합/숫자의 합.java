import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        String s = br.readLine();

        int answer = 0;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            answer += Character.getNumericValue(c);
        }

        System.out.println(answer);

    }
}

