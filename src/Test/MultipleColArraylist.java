package Test;

import java.util.*;

public class MultipleColArraylist{

	public static void main(String[] args) {
		ArrayList<List<Object>> ab=new ArrayList<List<Object>>();
		List<Object> value=new ArrayList<Object>();
		value.add(2);
		value.add("abc");
		value.add(43.66);
		value.add('c');
		ab.add(value);
		value=new ArrayList<Object>();
		value.add(3);
		value.add("dabc");
		value.add(433.66);
		value.add('s');
		ab.add(value);
		value=new ArrayList<Object>();
		value.add(4);
		value.add("eabc");
		value.add(4311.66);
		value.add('y');
		ab.add(value);
		Object ans= ab.toArray();//contains("abc");
	
		ValuesTest vc=new ValuesTest();
		System.out.println(vc.toString());
		System.out.println(String.format("id=%08.2f", 234.226));
		String values="one";
		switch(values) {
		case "one":
			System.out.println("Fail");
		case "teo":
			System.out.println("OK");
		}
	}

}
