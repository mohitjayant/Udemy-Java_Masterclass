public class NumberToWords
{
    public static void numberToWords(int num)
    {
        int number=reverse(num);
        if(number<0)
        {
            System.out.println("Invalid Value");
        }
        int before=getDigitCount(num);
        int after=getDigitCount(number);
        if(num==0)
        {
            System.out.println("Zero");
        }
        String ans="";
        while (number>0)
        {
            int digit=number % 10;

            String word="";
            switch (digit)
            {
                case 0:
                    word="Zero";
                    break;
                case 1:
                    word="One";
                    break;
                case 2:
                    word="Two";
                    break;
                case 3:
                    word="Three";
                    break;
                case 4:
                    word="Four";
                    break;
                case 5:
                    word="Five";
                    break;
                case 6:
                    word="Six";
                    break;
                case 7:
                    word="Seven";
                    break;
                case 8:
                    word="Eight";
                    break;
                case 9:
                    word="Nine";
                    break;

            }

            ans+=word+" ";
            number/=10;
        }
        while (before!=after)
        {
            ans+="Zero ";
            after++;
        }

        System.out.println(ans);
    }

    public static int reverse(int n)
    {
        int number=Math.abs(n);
        int sum=0;
        while (number>0)
        {
            int digit=number % 10;
            sum=(sum*10)+digit;
            number/=10;

        }
        if(n<0)
        {
            return (-sum);
        }
        else
        {
            return sum;
        }
    }

    public static int getDigitCount(int num)
    {
        if(num<0)
        {
            return -1;
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;
        while (num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(0);
    }
}
