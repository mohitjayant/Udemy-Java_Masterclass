import java.util.Vector;

public class FactorPrinter
{
    public static void printFactors(int numbers)
    {
        if(numbers<1)
        {
            System.out.println("Invalid Value");
        }
        Vector<Integer> v=new Vector<>();
        for(int i=1;i<=Math.sqrt(numbers);i++)
        {
            if(numbers%i==0)
            {
                if(i==numbers/i)
                {
                    System.out.printf("%d ", i);
                }
                else
                {
                    System.out.printf("%d ",i);
                    v.add(numbers/i);
                }
            }
        }

        for(int i=v.size()-1;i>=0;i--)
        {
            System.out.printf("%d ",v.get(i));
        }
    }

    public static void main(String[] args) {
        printFactors(28);
    }
}
