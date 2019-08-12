package RandomCode;

public class ConvertToBase7 {

	public static void main(String[] args) {

		System.out.println(convrtToBase7(4509));
		
	}
	public static String convrtToBase7(int num) {
        boolean isNegative=false;
        if(num<0){
            isNegative=true;
            num=Math.abs(num);
        }
        int div=1;
        int count=0;
        while(num>=div*7){
            div*=7;
            count++;
        }
        StringBuilder str=new StringBuilder();
        if(isNegative){
            str.append("-");
        }
        for(int i=0;i<count+1;i++){
            int rem=num%div;
            int divid=num/div;
            div=div/7;
            num=rem;
            str.append(Integer.toString(divid));
        }
        return str.toString();
    }
}
