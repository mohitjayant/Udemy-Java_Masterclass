public class SumOddRange
{
    public static boolean isOdd(int number)
    {
        if(number<=0)
        {
            return false;
        }
        if(number % 2==0)
        {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start,int end)
    {
        if(start<=0 || end<=0)
        {
            return -1;
        }
        if(start>end)
        {
            return -1;
        }
        int sum=0;
        for (int i=start;i<=end;i++)
        {
            if(isOdd(i))
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(-1,100));
    }
}
