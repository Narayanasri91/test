package DailyJavaProgrmas;

public class AlterNative {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i+=2) {
			
			System.out.println(i);			
		}
		System.out.println("One more way");
		
for (int i = 1; i <=10; i++) {
			
			System.out.println(i);
			i++;
		}
System.out.println("Printing Alternative in reverse");

for (int i = 10; i>=1; i-=2) {
	
	System.out.println(i);			
}
System.out.println();
for (int i = 10-1; i>=1; i-=2) {
	
	System.out.println(i);			
}
System.out.println("Nested loop");
for (int i = 1; i <=2; i++) {
	for(int j=1;j<=2;j++)
	{
		System.out.println(j);	
	}
	
	System.out.println();}

	
	for (int i = 1; i<=2; i++) {
		for(int j=1;j<=2;j++)
		{
			System.out.println(i);	
		}
}

	System.out.println();

	for (int i = 1; i<=2; i++) {
		for(int j=1;j<=i;j++)
		{
			System.out.println(j);	
		}
	}

}
}