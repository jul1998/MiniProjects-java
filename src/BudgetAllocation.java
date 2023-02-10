import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BudgetAllocation {
    public static void main(String[] args){
        System.out.println("How much you can spend?");
        Scanner scanner = new Scanner(System.in);
        double userBudget = scanner.nextDouble();
        double sum = 0;
        int i = 0;

        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter your propotion of various expenses");
        System.out.println("The system stops if cumulative proportion exceeds 100%");

        while(sum<=100){
            System.out.println("Your proportion of expense "
                    + (i + 1) + ":");
            double value = scanner.nextDouble();
            proportion.add(value);
            sum += proportion.get(i);
            i ++;
        }
        scanner.close();
        if (sum>100){
            double cumulativeSum = 0.0;
            for (int j =0; j < proportion.size() - 1; j++ ){
                cumulativeSum += proportion.get(j);
            }
            proportion.set(proportion.size()-1, 100.0 - cumulativeSum);
        }
        for (double value: proportion){
            double expense = value * userBudget / 100.0;
            System.out.println("Your " + value + "% equals $" + expense);
        }
    }
}
