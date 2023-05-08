/*
정홍섭
*/

import java.util.*;

public class Mini7 {
    static Integer[] getLottoNumbers() {
        HashSet<Integer> lotto = new HashSet<>();
        Random random = new Random();

        while (lotto.size() < 6) {
            lotto.add(random.nextInt(46));
        }
        return lotto.toArray(new Integer[6]);
    }

    static int matchLottoNumbers(Integer[] lotto, Integer[] myLotto) {
        HashSet<Integer> lottoSet = new HashSet<>(Arrays.asList(lotto));
        int matched = 0;

        for (Integer integer : myLotto) {
            if (lottoSet.contains(integer)) {
                matched++;
            }
        }
        return matched;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10): ");
        int howMuchLotto = sc.nextInt();
        Integer[][] lottoResult = new Integer[howMuchLotto][6];


        Integer[] lotto = getLottoNumbers();
        Arrays.sort(lotto);


        for (int i = 0; i < howMuchLotto; i++) {
            Integer[] numbers = getLottoNumbers();
            Arrays.sort(numbers);
            lottoResult[i] = numbers;

            System.out.print((char) (i + 65) + "\t");
            for (Integer integer : lottoResult[i]) {
                System.out.printf("%02d ", integer);
            }
            System.out.println();
        }

        System.out.println("\n[로또 발표]");
        System.out.print("당첨번호\t");
        for (Integer integer : lotto) {
            System.out.print(integer + " ");
        }
        System.out.println("\n");

        System.out.println("[내 로또 결과]");
        for (int i = 0; i < lottoResult.length; i++) {
            System.out.print((char) (i + 65) + "\t");
            for (Integer integer : lottoResult[i]) {
                System.out.printf("%02d ", integer);
            }
            System.out.printf("==> %d개 일치", matchLottoNumbers(lotto, lottoResult[i]));
            System.out.println();
        }
    }
}
