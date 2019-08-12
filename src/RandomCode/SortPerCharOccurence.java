package RandomCode;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortPerCharOccurence {

	public static void main(String[] args) {
		String val="tree";
		String result=sortValue(val);
		System.out.println(result);
	}

	private static String sortValue(String val) {
		Map<String,Integer> values=new HashMap<String,Integer>();
		
		String[] input=val.split("");
		List<String> stringSplit=Arrays.asList(input);
		for(int i=0;i<stringSplit.size();i++) {
			if(!values.containsKey(stringSplit.get(i))){
				values.put(stringSplit.get(i),Collections.frequency(stringSplit, stringSplit.get(i)));
			}
		}
		List<Map.Entry<String,Integer>> listToSort=new LinkedList<Map.Entry<String, Integer> >(values.entrySet());
		Collections.sort(listToSort,new Comparator<Map.Entry<String,Integer>>() {
			public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer>o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		});
		StringBuilder str=new StringBuilder();
		for(int i=0;i<listToSort.size();i++) {
			Map.Entry<String,Integer> entry=listToSort.get(i);
			int count=entry.getValue();
			for(int j=0;j<count;j++) {
				str.append(entry.getKey());
			}
		}
		return str.toString();
	}

}
