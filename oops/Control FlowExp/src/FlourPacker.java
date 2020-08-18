public class FlourPacker
{
    public static boolean canPack(int bigCount,int smallCount,int goal)
    {
        if(bigCount<0 || smallCount<0 || goal<0)
        {
            return false;
        }

        int totalKilos = (5 * bigCount) + smallCount;
        int count =0;
        int temp = 0;

        if (totalKilos < goal)
        {
            return false;
        }
        else if (totalKilos == goal)
        {
            return true;
        }
        else
        {
            for(int i=0;i<goal;i++){
                temp = goal - i;
                if (temp % 5 == 0){
                    break;
                }
            }
            if(bigCount>= temp/5)
            {

                goal -= temp;
                if (smallCount >= goal)
                {
                    return true;
                }
                return false;
            }
            else
            {
                goal -= (bigCount*5);
                if (smallCount >= goal)
                {
                    return true;
                }
                return false;
            }
        }



    }

    public static void main(String[] args) {

        if(canPack(2,10,18))
        {
            System.out.println("Pack");
        }
        else
        {
            System.out.println("Not Pack");
        }

    }
}
