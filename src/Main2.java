public class Main2
{
    public static void main(String[] args)
    {
        for(int n=0; n < 6; n++){
            for(int t = 1; t <= n; t++)
        {
            System.out.print("*");
        }
            System.out.println();
        }
        for(int n=9; n > 0; n--){
            for(int t = 5; t <= n; t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int n=1; n < 6; n++){
            for(int t = 1; t <= 5; t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
