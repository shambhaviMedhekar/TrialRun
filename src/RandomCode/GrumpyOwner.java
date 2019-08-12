package RandomCode;


import java.util.Arrays;

public class GrumpyOwner {

	public static void main(String[] args) {
		int customers[]={1,0,1,2,1,1,7,5};
		int grumpy[]= {0,1,0,1,0,1,0,1};
		/*
		 * int X=3; int value=maxSatisfied(customers,grumpy, X);
		 * System.out.println(value); String abc="asg"; String bb="a"; String[] sdf=new
		 * String[3];
		 */
				
				String pattern="abba";
				String str="dog cat cat dog";
				System.out.println(wordPattern(pattern,str));
				
	}
	public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int[] newgrumpy=Arrays.copyOf(grumpy, grumpy.length);

        int left=0;
        int sum=0,maxsum=0;
        while(left<=customers.length-X){
            newgrumpy=Arrays.copyOf(grumpy, grumpy.length);
            sum=0;
            for(int i=0;i<X;i++){
            newgrumpy[left+i]=0;    
            }
            for(int j=0;j<customers.length;j++){
                if(newgrumpy[j]!=1){
                    sum+=customers[j];
                }
            }
            if(sum>maxsum){
                maxsum=sum;
            }
            left++;
            
        }
        return maxsum;
    }
	
	 public static boolean wordPattern(String pattern, String str) {
	        String[] stringValue=str.split(" ");
	        String[] values=new String[26];
	        boolean isValid=false;
	        if(pattern.length()==0 && values.length!=0){
	            return isValid;
	        }
	        if(pattern.length()!=values.length){
	            return isValid;
	        }
	        for(int i=0;i<pattern.length();i++){
	            if(values[(int)pattern.charAt(i)]==null){
	                values[(int)pattern.charAt(i)]=stringValue[i];
	            }
	            else{
	                String value=values[(int)pattern.charAt(i)];
	                if(value.equals(stringValue[i])){
	                    isValid=true;
	                }
	                else{
	                    isValid=false;
	                    break;
	                }
	            }
	        }
	        return isValid;
	        
	    }
}
