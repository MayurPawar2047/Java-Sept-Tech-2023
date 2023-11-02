import java.util.Scanner;
class Hello1{
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);

  	int size;
  	System.out.println("Please enter the size");
  	size=sc.nextInt();

  	int b[]=new int[size];
  	for(int i=0;i<b.length;i++)
  	{
  		System.out.println("Please enter the number");
  		b[i]=sc.nextInt();
  	}
  	for(int i=0;i<b.length;i++)
  	{
  		System.out.println("The Number you had enter="+b[i]);
  	}

 	
 }

}