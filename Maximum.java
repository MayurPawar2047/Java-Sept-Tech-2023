class Maximum{

	
		public static void main(String[] args) {
			int[] a={1,2,3,5,10};
			int ans=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>ans)
				{
					ans=a[i];
				}
			}
			System.out.println(ans);
			 	
		}
		
	}
