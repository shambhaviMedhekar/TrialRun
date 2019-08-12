package RandomCode;


public class SumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {-4,-3};
		System.out.println(consecutiveNumbersSum(values));

	}
	public static int consecutiveNumbersSum(int nums[]) {
		/*
		 * int size=2; int numberSum=1; int sum=0; int value[]=new int[(N/2)+2]; for(int
		 * i=0;i<=(N/2)+1;i++){ value[i]=i; } while(size<(N/2)+1){ for(int
		 * i=1;i<=(N/2)+1;i++){ sum=value[i]; for(int j=1;j<size;j++){
		 * if((i+j)<=(N/2)+1){ sum=sum+value[i+j];
		 * 
		 * }
		 * 
		 * } if(sum>N) { break; } if(sum==N){ numberSum++; break; }
		 * 
		 * } size++; } return numberSum;
		 */
		if(nums.length==1){
            return nums[0];
        }
		String abc="1234";
        int maxValue=0;
        int size=2;
        while(size<=nums.length){
        for(int i=0;i<nums.length;i++){
                int temp=nums[i];
            for(int j=1;j<size;j++){
                if((i+j)<nums.length){
                temp=temp*nums[i+j];
                System.out.println("mul"+temp);
                System.out.println("i "+i+" j "+j);
                System.out.println("max"+maxValue);
                if(temp>maxValue)
                    maxValue=temp;
                }
            }
        }
            size++;
        }
        return maxValue;
    }
}
