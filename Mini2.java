/*
정홍섭
*/

import java.util.Scanner;

public class Mini2 {
    public static void main(String[] argus) {
        System.out.println("[캐쉬백 계산]");
        Scanner sc = new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요. (금액) : ");
        int num = sc.nextInt();
        String result = " ";

        if (num * 0.001 > 3) {
            result = "300";
        } else if (num * 0.1 > 200) {
            result = "200";
        } else if (num * 0.1 > 100) {
            result = "100";
        } else {
            result = "0";
        }
        System.out.println("결제 금액은 " + num + "이고, " + "캐쉬백은 " + result + "원 입니다.");

    }
}
