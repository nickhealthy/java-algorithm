import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String limit = br.readLine();

        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();

        Arrays.sort(arr);

        final int ARR_LENGTH = arr.length;
        StringBuilder stringBuilder = new StringBuilder(2 * ARR_LENGTH);
        for (int i = 0; i < ARR_LENGTH; i++) {
            stringBuilder.append(arr[i]).append(" ");
        }

        bw.write(stringBuilder.toString());
        bw.close();
        br.close();

        /*
         * 첫 번째 풀이 - 메모리 초과
         *  */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(tokenizer.nextToken());
//        int M = Integer.parseInt(tokenizer.nextToken());
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(String.join("", br.readLine().split(" ")))
//                .append(String.join("", br.readLine().split(" ")));
//
//        String[] stringArr = stringBuilder.toString().split("");
//
//        Arrays.sort(stringArr);
//
//        stringBuilder = new StringBuilder();
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            System.out.println(stringArr[i]);
//            stringBuilder.append(stringArr[i]).append(" ");
//        }
//
//        System.out.println(stringBuilder);
//
//        bw.write(stringBuilder.toString());
//        bw.flush();
//        bw.close();
//        br.close();

    }
}