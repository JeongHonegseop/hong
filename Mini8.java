/*
정홍섭
*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mini8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요. :  ");
        int income = sc.nextInt();

        List<Integer> taxRate= Arrays.asList(6,15,24,35, 38, 40, 42, 45);
        List<Integer> tax=Arrays.asList(0 , 1080000 , 5220000 , 14900000 , 19400000 , 25400000 , 35400000 , 65400000);
        List<Integer> taxRange=Arrays.asList(12000000 , 34000000 , 42000000 , 6200000 , 150000000 , 200000000 , 500000000 , Integer.MAX_VALUE);

        int m=0; int afterTaxIncome=income;
        int value=0;
        int calTax=0;
        if(afterTaxIncome>taxRange.get(0)) {
            while (afterTaxIncome > 0) {
                if (m == 0) value = taxRange.get(m);
                else value = taxRange.get(m) < afterTaxIncome ? taxRange.get(m) : afterTaxIncome;

                System.out.print(String.format("%10d*%2d%%=%10d", value, taxRate.get(m), value / 100 * taxRate.get(m)));
                System.out.println();
                calTax += value / 100 * taxRate.get(m);
                afterTaxIncome -= taxRange.get(m);
                m++;
            }
        } else {
            System.out.println(String.format("%10d*%2%%=%10d", value, taxRate.get(m), value / 100 * taxRate.get(m)));
            System.out.println();
            calTax += afterTaxIncome / 100 * taxRate.get(m);
        }int accTax=0;
        if(income>taxRange.get(0)) {
            while (afterTaxIncome > 0) {
                afterTaxIncome -= taxRange.get(m);
                m++;
            }
            accTax = income/100*taxRate.get(m-1) - tax.get(m-1);
        }else accTax=income/100*taxRate.get(0);
        System.out.println();
        System.out.println(String.format("[세율에 의한 세금] : %17d",calTax));
        System.out.println(String.format("[누진공제 계산에 의한 세금] : %10d",accTax));

            }
        }
