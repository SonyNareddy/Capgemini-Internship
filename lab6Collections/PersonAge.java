package lab6Collections;

import java.util.*;

public class PersonAge {
	public static void main(String[] ar)
    {
           HashMap<String,Integer> per = new HashMap<>();
           PersonAge pa = new PersonAge();
           per.put("R121",20);
           per.put("A123",17);
           per.put("R451",25);
           per.put("R321",14);
           per.put("R167",22);
           System.out.println(pa.votersList(per));
    }
	public List<String> votersList(HashMap<String,Integer> per)
    {
           List<String> age = new ArrayList<>();
           Set<String> set = per.keySet();
           for(String s:set)
           {
                  Integer age1 = per.get(s);
                  if(age1 > 18)
                  {
                        age.add(s);
                  }
           }
           return age;
    }
}
