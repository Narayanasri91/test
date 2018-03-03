package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		ArrayList<String> or=new ArrayList<String>();
		
		arr.add(10);
		arr.size();
		
		arr.addAll(arr);
		
		System.out.println(arr);
		
		Object[] abj=arr.toArray();
		for (Object object : abj) {
			System.out.println(object);
		}
		

	}

}
