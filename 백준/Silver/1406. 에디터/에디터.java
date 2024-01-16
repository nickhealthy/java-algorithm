import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String ORIGINAL_STRINGS = br.readLine();
        final int ORIGINAL_STRINGS_LENGTH_FOR_ARRAY = ORIGINAL_STRINGS.length() - 1;
        final int COMMAND_COUNT = Integer.parseInt(br.readLine());

        Stack<String> stackA = new Stack<>();
        Stack<String> stackB = new Stack<>();

        for (char c : ORIGINAL_STRINGS.toCharArray()) {
            stackA.add(String.valueOf(c));
        }

        for (int i = 0; i < COMMAND_COUNT; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();

                switch (token) {
                    case "L":
                        if (!stackA.empty()) {
                            stackB.add(stackA.pop());
                        }
                        break;
                    case "D":
                        if (!stackB.empty()) {
                            stackA.add(stackB.pop());
                        }
                        break;
                    case "B":
                        if (!stackA.empty()) {
                            stackA.pop();
                        }
                        break;
                    case "P":
                        stackA.push(tokenizer.nextToken());
                        break;
                } // switch 끝
            } // while 끝
        } // for 끝

        List<String> combineStack = new Stack<>();
        combineStack.addAll(stackA);
        Collections.reverse(stackB);
        combineStack.addAll(stackB);
        
        StringBuilder sb = new StringBuilder();
        for (String s : combineStack) {
            sb.append(s);
        }

        System.out.println(sb);

        /* 첫 번째 풀이 - 시간 초과 */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        final String ORIGINAL_STRINGS = br.readLine();
//        final int ORIGINAL_STRINGS_LENGTH = ORIGINAL_STRINGS.length();
//        final int COMMAND_COUNT = Integer.parseInt(br.readLine());
//        int cursor = ORIGINAL_STRINGS_LENGTH - 1;
//
//        char[] charArray = ORIGINAL_STRINGS.toCharArray();
//        List<String> arrayList = new ArrayList<>();
//        for (char c : charArray) {
//            arrayList.add(String.valueOf(c));
//        }
//
//        for (int i = 0; i < COMMAND_COUNT; i++) {
//            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//
//            while (tokenizer.hasMoreTokens()) {
//                String token = tokenizer.nextToken();
//                switch (token) {
//                    case "P":
//                        token = tokenizer.nextToken();
//                        arrayList.add(++cursor, token);
//                        break;
//                    case "L":
//                        if (cursor == -1) {
//                            break;
//                        }
//                        cursor -= 1;
//                        break;
//                    case "D":
//                        if (cursor == arrayList.size() - 1) {
//                            break;
//                        }
//                        cursor += 1;
//                        break;
//                    case "B":
//                        if (cursor == -1) {
//                            break;
//                        }
//                        arrayList.remove(cursor--);
//                        break;
//                }
//            } // while 끝
//        } // for 끝
//
//        StringBuilder answer = new StringBuilder();
//        for (String s : arrayList) {
//            answer.append(s);
//        }
//
//        System.out.println(answer);

    }
}