package RandomCode;


import java.util.*;

public class MatchString {

	public static void main(String[] args) {
		String[] queries= {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
		String pattern="FoBaT";
		int df=123;
		List<Boolean> result= camelMatch(queries,pattern) ;
	}
	public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> isMatch=new ArrayList<Boolean>();
        String regex="";
        for(int i=0;i<pattern.length();i++){
            if(Character.isUpperCase(pattern.charAt(i))){
                if(i==0){
                    regex=regex+pattern.charAt(i);
                }
                else{
                    regex=regex+"(.*)"+pattern.charAt(i);
                }
            }  
            else{
             regex=regex+pattern.charAt(i);   
            }
            
        }
        regex=regex+"(.*)";
        for(int i=0;i<queries.length;i++){
            isMatch.add(queries[i].matches(regex));
        }
        return isMatch;
    }

}
