/*
정홍섭
*/

import java.util.Random;
import java.util.Scanner;

public class Mini4 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요. (yyyy) : ");
        int year = sc.nextInt();

        String srtYear = Integer.toString(year).substring(2);

        System.out.print("출생월을 입력해 주세요. (mm) : ");
        int month = sc.nextInt();

        System.out.print("출생일을 입력해 주세요. (dd) : ");
        int day = sc.nextInt();

        System.out.print("성별을 입력해 주세요. (m/f) : ");
        char gender = sc.next().trim().charAt(0);
        int intGender = 0;
        if (gender == 'm') {
            intGender = 3;
        } else {
            intGender = 4;
        }
        Random rnd = new Random();
        int num = rnd.nextInt(1000000);

        System.out.println(srtYear+month+day+"-"+intGender+num);

    }
}
