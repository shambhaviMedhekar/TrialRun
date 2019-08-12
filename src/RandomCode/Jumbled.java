package RandomCode;



import java.util.*;

public class Jumbled {

	public static void main(String[] args) {
		String s="PAYPALISHIRING";
		String val=convert(s, 4);
	}
	public static String convert(String s, int numRows) {
        List<List<Character>> order=new ArrayList<List<Character>>();
        List<Character> values=new ArrayList<Character>();
        for(int j=0;j<numRows;j++){
                order.add(values);        
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(count>numRows-1){
                count=0;
            }
            
            List<Character> name=order.get(count);
            values.add(s.charAt(i));
            
            count++;
        }
        for(int i=0;i<order.size();i++){
            List<Character> val=order.get(i);
            for(int j=0;j<val.size();j++){
                System.out.println(val.get(j));
            }
            
        }
        return s;
    }

}
