
public class Main
{
    public static void main(String[] args)
    {

        for(int num = 0; num < 31; num++)
        {

            System.out.printf("%3d",num);

        }
        for(int num = 30; num > 0; num--)
        {

            System.out.printf("%3d",num);

        }
        for(int num = 0; num < 19; num+=3)
        {
            System.out.printf("%3d",num);
        }

        for(int num = 10; num > -1; num-=2)
        {
            System.out.printf("%3d",num);
        }

    }
}