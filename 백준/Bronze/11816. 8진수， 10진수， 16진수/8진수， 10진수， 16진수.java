import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int answer = 0;
        if (s.startsWith("0x")) {
            answer = Integer.valueOf(s.substring(2), 16);
        } else if (s.startsWith("0")) {
            answer = Integer.valueOf(s.substring(1), 8);
        } else {
            answer = Integer.valueOf(s);
        }
        
        System.out.println(answer);
    }
}

