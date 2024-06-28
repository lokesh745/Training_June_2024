package Introduction;

import java.util.Map;
import java.util.LinkedHashMap;

public class linkedHashMapPractice {

	public static void main(String[] args) 
	{
		
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		
		System.out.println("Before giving any input: " + map);
		
		map.put(1,"Lokesh");
		map.put(2,"Tanush");
		map.put(3,"Vipul");
		System.out.println("After giving some input: " + map);
		
		map.put(1,"Lokesh Bagul");		
		System.out.println("After Overriding: " + map);
		
		map.remove(2);
		System.out.println("After remving id: " + map);
		
		System.out.println(map.get(1));
		
		System.out.println("Contains value '1' ?: " + map.containsKey(1) );
		
		System.out.println("Contains value 'Vipul': " + map.containsValue("Tanush"));

	}

}
