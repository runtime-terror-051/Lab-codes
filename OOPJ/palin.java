//WAP to check a number is pallindrome or not
class palin
{
    public static void main (String [] args)
    {
        int r, sum=0,temp;
        int n=454;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Pallindrome number");
            else 
            System.out.println("Not Pallindrome");
    }
}