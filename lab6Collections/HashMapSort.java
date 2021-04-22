package lab6Collections;

import java.util.*;
public class HashMapSort {
	public static void main(String[] args)
	{
	    HashMap<String, Integer> hm = new HashMap<String, Integer>();
	    
	    hm.put("Ramu", 107);
	    hm.put("Ramesh", 101);
	    hm.put("Raju", 109);
	    hm.put("Rakesh", 102);
	    hm.put("Rahul", 105);
	    hm.put("Ravi", 103);
	    Map<String, Integer> hm1 = getValues(hm);

	    for (Map.Entry<String, Integer> m : hm1.entrySet()) {
	        System.out.println("Key : " + m.getKey() +   ", Value = " + m.getValue());
	    }
	}
	public static HashMap<String, Integer> getValues(HashMap<String, Integer> hm)
	{
		List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
	  
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
	    });

	    HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
	    for (Map.Entry<String, Integer> aa : list) {
	        temp.put(aa.getKey(), aa.getValue());
	    }
	    return temp;
	}
}


