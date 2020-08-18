public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        number=Math.abs(number);
        int temp=number;
        int sum=0;
        while(number>0)
        {
            int r=number%10;
            sum=(sum*10)+r;
            number/=10;
        }

        if(temp==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        if(isPalindrome(121))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
