public class SharedDigit
{
    public static boolean hasSharedDigit(int n1,int n2)
    {
        if(n1<10 || n2<10 || n1>99 || n2>99)
        {
            return false;
        }

        while(n1>0)
        {
            int r1=n1%10;
            int temp=n2;
            while (temp>0)
            {
                int r2=temp % 10;
                if(r1==r2)
                {
                    return true;
                }
                temp/=10;
            }
            n1/=10;
        }
        return false;
    }

    public static void main(String[] args) {
        if(hasSharedDigit(12,13))
        {
            System.out.println("Related");
        }
        else
        {
            System.out.println("Not Related");
        }
    }
}
