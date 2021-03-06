package lab6Collections;

import java.util.*;

public class StudentMedals {
	public HashMap<String, String> getStudents(HashMap<String,Integer> stu)
    {
           HashMap<String,String> medal = new HashMap<>();
           Set<String> set = stu.keySet();
           for(String s:set)
           {
                  Integer marks = stu.get(s);
                  if(marks>=90)
                  {
                        medal.put(s,"Gold");
                  }
                  else if(marks >=80)
                  {
                        medal.put(s,"Silver");
                  }
                  else if(marks>=70)
                  {
                        medal.put(s,"Bronze");
                  }
           }
           return medal;
    }
    public static void main(String[] ar)
    {
           HashMap<String,Integer> stu = new HashMap<>();
           StudentMedals sm = new StudentMedals();
           stu.put("Ramu",65);
           stu.put("Raju",76);
           stu.put("Ravi",89);
           stu.put("Ramesh",90);
           stu.put("Rakesh",93);
           System.out.println(sm.getStudents(stu));
    }
}
