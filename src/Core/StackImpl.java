package Core;

import java.util.Stack;
import java.util.regex.Pattern;

public class StackImpl {

	public static void main(String[] args) {
		
		String input="(({}[((({{[]}})))]))";
		boolean valid=getResult(input);
		if(valid) {
			System.out.println("is valid");
		}
		else {
			System.out.println("not valid");
		}
	}

	private static boolean getResult(String input) {
		Stack<Character> entry=new Stack<Character>();
		for(int i=0;i<input.length();i++) {
			char value=input.charAt(i);
			if(value=='{'||value=='('||value=='[') {
				entry.push(value);
			}
			else if(value=='}'||value==']'||value==')') {
				if(entry.isEmpty()) {
					return false;
				}
				entry.pop();
			}
		}
		return entry.isEmpty();
	}

}
