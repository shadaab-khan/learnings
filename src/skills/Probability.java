package skills;

public class Probability {

    public static void main(String[] args) {

        randomNum();
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
}
