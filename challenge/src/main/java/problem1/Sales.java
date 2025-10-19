package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of sales: ");
        final int SALESPEOPLE = scan.nextInt();;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxsale = 0;
        int minsale = sales[0];
        int maxind = 0;
        int minind = 0;
        for (int i=0; i<sales.length; i++)
        {
            if(sales[i]> maxsale){
                maxsale = sales[i];
                maxind = i;
            }
            if(sales[i]< minsale){
                minsale = sales[i];
                minind = i;
            }

            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + sum/SALESPEOPLE);
        System.out.println("Salesperson " + (maxind+1) + " had the highest sale with $" + maxsale);
        System.out.println("Salesperson " + (minind+1) + " had the lowest sale with $" + minsale);
        System.out.println("Enter a value: " );
        int value =scan.nextInt();
        int totalprsn = 0;
        for (int i=0; i<sales.length; i++)
        {
            if(sales[i]> value){
                totalprsn++;
                System.out.println("Saleperson" + (i+1) + "exceed with sales $" + sales[i]);
            }
        }
        System.out.println("Total number of salespeople whose sales exceeded the value " + totalprsn);



    }
}