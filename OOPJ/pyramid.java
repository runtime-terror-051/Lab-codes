/*WAP in java to print a pyramid using loop*/
public class pyramid
{
    public static void main(String[]args)
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
       }
    }
}