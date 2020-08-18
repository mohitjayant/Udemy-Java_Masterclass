public class LastDigitChecker
{
    public static boolean hasSameLastDigit(int n1,int n2,int n3)
    {
        if(!isValid(n1) || !isValid(n2) || !isValid(n3))
        {
            return false;
        }
        int r1=n1 % 10;
        int r2=n2 % 10;
        int r3=n3 % 10;

        if((r1==r2) || (r2==r3) || (r1==r3))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean isValid(int number)
    {
        if(number<10 || number>1000)
        {
            return false;
        }
        else
        {
            return true;
        }
    }


}
