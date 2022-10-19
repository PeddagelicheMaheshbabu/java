import java.util.Scanner;

class avg
{
    public static void main(String args[])
    {
    
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        
        }
        scanner.close();
  
        float agg=total/6;
       System.out.println("TOTAL= " + total);
        System.out.print("The student class is:\n ");
 System.out.println("Aggregate=" + agg);
        if(agg>=75)
        {
            System.out.println("Distinction");
        }
        else if(agg>=60 && agg<75)
        {
           System.out.println("Frist Distinction");
        } 
        else if(agg>=50 && agg<60)
        {
            System.out.println("Second Distinction");
        }
        else if(agg>=40 && agg<50)
        {
            System.out.println("Third Distinction");
        }
           else if(agg<40)
{
       System.out.println("fail");


}

    }
}