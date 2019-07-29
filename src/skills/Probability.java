package skills;

import java.util.ArrayList;
import java.util.List;

public class Probability {
    public static void main(String[] args) {

//        randomNum();
        loop();
    }

    public static void randomNum() {
        int randomNumber = 0;
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.9) {
                randomNumber = 1 + (int) (Math.random() * 9);
            } else {
                randomNumber = 10 + (int) (Math.random() * 90);
            }

            System.out.println(randomNumber);
        }
    }

    //40% to get number from 1-10
//            20% to get number from 11-20
//            30% to get number from 21-30
//            10% to get number from 31-40
    static int i=0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, num=0;
    static List list = new ArrayList();
    private static List randomProb() {
        double rnd = Math.random();
        double rnd2 = Math.random();
        if(i==10){
            return list;
        }
        else if (rnd < 0.4 && cnt1 < 4) {
            cnt1++;
            i++;
            num = (int) (1 + 10 * rnd2);
            System.out.println(" 40% Generated Num: " + num);
            list.add(num);
        } else if (rnd < 0.6 && cnt2 < 2) {
            cnt2++;
            i++;
            num = (int) (11 + 10 * rnd2);
            System.out.println(" 20% Generated Num: " + num);
            list.add(num);
        } else if (rnd < 0.9 && cnt3 < 3) {
            cnt3++;
            i++;
            num =(int) (21 + 10 * rnd2);
            System.out.println(" 30% Generated Num: " + num);
            list.add(num);
        } else if (cnt4 < 1) {
            cnt4++;
            i++;
            num = (int) (31 + 5 * rnd2);
            System.out.println(" 10% Generated Num: " + num);
            list.add(num);
        }
        return randomProb();
    }

    static void loop() {

        List numList = randomProb();

        System.out.println("List of Nums : " + numList);
    }
}
