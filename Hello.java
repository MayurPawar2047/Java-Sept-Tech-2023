import java.util.Scanner;
class Hello{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size;
	System.out.println("Enter Size  ...");
		size=sc.nextInt();


		int A[]=new int[size];

		for (int i=0 ;i<A.length ;i++ ) {
			System.out.println("Enter ");
			A[i]=sc.nextInt();
		}

		for (int i=0 ;i<A.length ;i++ ) {
			System.out.println(A[i] +"  ");
		}







	}
}
