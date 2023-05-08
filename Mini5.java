/*
정홍섭
*/

import java.util.Calendar;
import java.util.Scanner;

public class Mini5 {
    public static void main(String[] argus) {
        Calendar cal = Calendar.getInstance();
        System.out.println("[달력 출력 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요. (yyyy) : ");
        int year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요. (mm) : ");
        int month = sc.nextInt();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);

        System.out.println("["+year+"년 "+month+"월]");
        System.out.println("   일    월     화    수     목    금    토");

        cal.set(year,month-1,1);

        int end = cal.getActualMaximum(Calendar.DATE);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        for(int i=1; i<=end; i++) {
            if (i == 1) {
                for(int j = 1; j < dayOfWeek; j++) {
                    System.out.print("      ");
                }
            }
            if (i < 10) {
                System.out.print(" ");
            }
            System.out.print("  " + i + "  ");
            if(dayOfWeek%7==0) {
                System.out.println();
            }
            dayOfWeek++;
        }
    }
}
