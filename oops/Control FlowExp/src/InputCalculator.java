import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int avg=0;
        int count=0;
        while(true)
        {
            boolean isAnInt=scanner.hasNextInt();

            if(isAnInt)
            {
                int number=scanner.nextInt();
                sum+=number;
                count++;
            }
            else
            {
                break;
            }
            scanner.nextLine();
        }
        double roughAvg=(double)sum/count;
        System.out.println("rough "+roughAvg);
        if(count!=0)
        {
            avg=(int)Math.round(roughAvg);
        }

        System.out.println("SUM = "+sum+ " AVG = "+avg);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
