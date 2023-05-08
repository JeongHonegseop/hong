/*
정홍섭
*/

import java.util.Random;

public class Mini6 {

    public static void main(String[] args) {
        String[] candidate = {"이재명", "윤석열", "심상정", "안철수"};
        Random rd = new Random();

        int criteria = 0;
        int voteCount = 0;
        int[] getVote = new int[4];

        int totalVote = 10000;
        String votecd = "";
        String electedcd = "";

        for (int k = 1; k<= totalVote; k++) {
            int voteNum = rd.nextInt(4);
            getVote[voteNum]++;
            voteCount++;

            double voteRate = ((double) voteCount / totalVote) * 100;
            votecd = candidate[voteNum];
            System.out.println("[투표진행율]: " + String.format("%.2f", voteRate) + "%, " + voteCount + "명 투표 =>" + votecd);

            System.out.printf("[기호:1] 이재명: %.2f, (투표수:%d)\n", ((double) getVote[0] / 10000) * 100, getVote[0]);
            System.out.printf("[기호:2] 윤석열: %.2f, (투표수:%d)\n", ((double) getVote[1] / 10000) * 100, getVote[1]);
            System.out.printf("[기호:3] 심상정: %.2f, (투표수:%d)\n", ((double) getVote[2] / 10000) * 100, getVote[2]);
            System.out.printf("[기호:4] 안철수: %.2f, (투표수:%d)\n", ((double) getVote[3] / 10000) * 100, getVote[3]);

            for (int i = 0; i <= 3; i++) {
                if (getVote[i] > criteria) {
                    criteria = getVote[i];
                    electedcd = candidate[i];
                }
            }
        }
        System.out.println("[투표 결과] 당선인 : " + electedcd);
    }
}
