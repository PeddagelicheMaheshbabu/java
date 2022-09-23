import java.util.Scanner;
class pattern1  
{   
public static void main(String args[])   
{ 
Scanner s = new Scanner(System.in);
System.out.print("Enter number of rows :");
int row = s.nextInt();  
int i, j; 
int num=1;    
for(i=0; i<row; i++)   
{   
for(j=0; j<=i; j++)   
{     
System.out.print(num*num + " "); 
  num++;  
}   
System.out.println();   
}   
}   
}