public class GreatestCommonDivisor
{
    public static int getGreatestCommonDivisor(int n1,int n2)
    {
        if((n1<10) || (n2<10))
        {
            return -1;
        }


        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else
            {
                n2=n2-n1;
            }
        }
        return n1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }
}
