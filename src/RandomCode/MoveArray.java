package RandomCode;


public class MoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String abc=new String("aabcdeaacd");
		char value[]=abc.toCharArray();
		int count[]=new int[256];
		for(int i=0;i<value.length;i++) {
			count[(int)value[i]]++;
		}
		System.out.println(count);
		
				
	}

}
