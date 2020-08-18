
public class PerfectNumber
{
    public static boolean isPerfectNumber(int numbers)
    {
        if(numbers<1)
        {
            return false;
        }
        int sum=0;
        for(int i=1;i<=Math.sqrt(numbers);i++)
        {
            if(numbers%i==0)
            {
                if(i==numbers/i)
                {
                    sum+=i;
                }
                else
                {
                    sum+=i;
                    if(numbers/i==numbers)
                    {
                        continue;
                    }
                    sum+=numbers/i;
                }
            }
        }

        if(sum==numbers)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {
        if(isPerfectNumber(5))
        {
            System.out.println("Perfect");
        }
        else
        {
            System.out.println("Not Perfect");
        }
    }
}
