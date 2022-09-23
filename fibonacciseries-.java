import java.util.Scanner;
class nfibo
{
 public static void main(String[] args)
 {
   try
   {
    int N,n1=0,n2=-1,i,n3=-1;
    Scanner s= new Scanner(System.in);
    System.out.print(" Enter the number : ");
    N= s.nextInt();
    if(N<=0)
    {
       System.out.print("Enter only positive numbers");
    }
    
    else
    {
        System.out.println("The fibonacci series:");
        System.out.print(n1+"\t");
        System.out.print(n2+"\t");
        for(i=2;i<N;i++)
         {
              
              n3=n1+n2;
              System.out.print(n3+"\t");
              n1=n2;
              n2=n3;
          }
        
    }
    
    
    
    }
    catch(Exception e)
    {
        System.out.print("Enter only numbers");
    }
  }
}