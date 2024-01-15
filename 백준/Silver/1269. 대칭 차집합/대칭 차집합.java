import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String limit = br.readLine();

        String[] firstInputArr = br.readLine().split("\\s+");
        String[] secondInputArr = br.readLine().split("\\s+");

        Set set1 = new HashSet<>(List.of(firstInputArr));
        Set set2 = new HashSet<>(List.of(secondInputArr));

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // 대칭 차집합 계산
        // 교집합 구하기
        Set intersection = new HashSet(set1);
        intersection.retainAll(set2);
        // 전체 집합에서 교집합 빼기
        unionSet.removeAll(intersection);
        System.out.println(unionSet.size());

    }
}