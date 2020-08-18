public class FirstLastDigitSum
{
    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0)
        {
            return -1;
        }
        if(number<10)
        {
            return (number+number);
        }

        int firstDigit=number % 10;
        int lastDigit=0;
        while(number>=10)
        {
            number/=10;
            lastDigit=number;
        }

        int sum=lastDigit+firstDigit;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(121));
    }
}
