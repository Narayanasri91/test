package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		

		ArrayList arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(true);
		arr.add("ram");
		arr.add(new String("Laksh"));
		
		System.out.println(arr.size());
		
		System.out.println(arr.contains("true"));
		System.out.println(arr.contains(10));
		
		System.out.println(arr.get(2));
		
	
	}

}

