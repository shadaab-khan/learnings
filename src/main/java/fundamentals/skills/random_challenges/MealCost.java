package random_challenges;

public class MealCost {
    // Complete the solve function below.
    private static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip, tax, total;
        tip = meal_cost*tip_percent/100;
        tax = meal_cost*tax_percent/100;
        total = meal_cost+tip+tax;
        System.out.println(Math.toIntExact(Math.round(total)));

    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = 12.00;//scanner.nextDouble();
        int tip_percent = 20;//scanner.nextInt();
        int tax_percent = 8;//scanner.nextInt();
        solve(meal_cost, tip_percent, tax_percent);
//        scanner.close();
    }
}
