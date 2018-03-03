package Array;

public class CommonElement {

	public static void main(String[] args) {
		
		int[] a= {10,10,20,30,40};
		int[] b= {20,30};
		//int c= a.length;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("Duplioactes are "+a[i]);
					
					
				}
			}
		}
		
int[] c= {10,20,30,12,10};


		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
				//	System.out.println("Duplioactes are "+c[j]);
					//a[j]=0;
					
					 c[i]=0;
					
					
				}
			}
		
		}
		for (int i : c) {
			System.out.print(" "+i);
			
		}
		//System.out.println(c.toString());
		

	}

}
