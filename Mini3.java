/*
정홍섭
*/

import java.util.Scanner;

public class Mini3 {
    public static void main(String[] argus) {
        System.out.println("[입장권 계산]");
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요. (숫자) : ");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요. (숫자입력) : ");
        int time = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요. (y/n) : ");
        String len= sc.next();

        System.out.print("복지카드 여부를 입력해 주세요. (y/n) : ");
        String card = sc.next();
        String result = " ";

        if (age < 3) {
            result = "0";
        } else if (time > 17) {
            result = "4000";
        } else if (age < 13) {
            result = "4000";
        } else if(len.equals("y")) {
            result = "8000";
        } else if(card.equals("y")) {
            result = "8000";
        } else {
            result = "12000";
        }
        System.out.println("입장료 " + result);
    }
}
