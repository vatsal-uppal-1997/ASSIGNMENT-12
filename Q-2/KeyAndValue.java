import java.util.*;

public class KeyAndValue {
	
	public static void main(String[] args) {

		HashMap<Character,Integer> hm = new HashMap<>();

		hm.put('A',1);
		hm.put('B',2);
		hm.put('C',3);
		hm.put('D',4);

		for (char i: hm.keySet())
			System.out.println("'"+i+"' --> "+hm.get(i));

	}


}
