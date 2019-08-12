package RandomCode;


public class FindDistanceOfCharacterFromEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc="loveleetcode";
		int a[]=new int[abc.length()];
		for(int i=0;i<abc.length();i++) {
			a[i]=abc.indexOf('e', i)-i;
		}
		StringBuilder str=new StringBuilder(abc);
		str=str.reverse();
		
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
