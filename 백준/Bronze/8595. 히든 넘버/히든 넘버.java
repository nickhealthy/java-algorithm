import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String N = br.readLine();
        final String S = br.readLine();

        Long answer = 0L;
        StringBuilder currentNumber = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (Character.isDigit(c)) {
                // 현재 idx가 숫자라면 숫자 기록해두기
                currentNumber.append(c);
            } else if (isHaveNumber(currentNumber)) {
                // 현재 idx가 숫자가 아니고, 담아둔 히든 넘버가 있다면
                // 히든 넘버 더해주기
                answer += sumNumber(currentNumber);
                currentNumber.setLength(0);
            }
        }

        // 마지막으로 숫자가 남아있는지 확인 및 합산
        if (isHaveNumber(currentNumber)) {
            answer += sumNumber(currentNumber);
        }

        System.out.println(answer);

    }

    private static Long sumNumber(StringBuilder currentNumber) {
        return Long.parseLong(currentNumber.toString());
    }

    private static boolean isHaveNumber(StringBuilder currentNumber) {
        return currentNumber.length() > 0;
    }
}

