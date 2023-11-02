import java.util.Scanner;
import java.util.Random;
class EvenOdd{

	static void getEvenOddArray(int A[]){
		int evenCnt=0; int oddCnt=0;
		for(int i=0;i<A.length;i++){
			 if(A[i]%2==0)
			 	evenCnt++;
			 else
			 	oddCnt++;
		}

		// Create Array 
		int Even[]=new int[evenCnt];
		int Odd[]=new int[oddCnt];
        int e=-1;  int o=-1;
        for(int i=0;i<A.length;i++){
        	if(A[i]%2==0){
        		++e;
        		Even[e]=A[i];

        	}else{
        		++o;
        		Odd[o]=A[i];
        	}
        }
       // Print Even
        System.out.println("Even Array ");
for(int i=0;i<Even.length;i++)
	 System.out.print(Even[i]  +"  ");

System.out.println();

        //Print Odd
System.out.println("   ODD Array  ");
for(int i=0;i<Odd.length;i++)
	 System.out.print(Odd[i] +"  ");

	}

	public static void main(String[] args) {
		Random r=new Random(5656);
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		size=sc.nextInt();
		int A[]=new int[size];
		
			// INPUT

		for(int i=0;i<A.length;i++){
			A[i]=r.nextInt(88);
		}

		getEvenOddArray(A);


	}
}
