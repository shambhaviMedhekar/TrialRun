package Stage;

public class CheckSum {

	public static void main(String[] args) {
		int a[]={2, 3, 4, 5};
		int target=9;
		int count=0;
		for(int i=0;i<a.length-1;i++){
			int sum=target-a[i];
			
			int k=i+1;
			while(sum>0){
				sum-=a[k];
				k++;
				if(sum==0){
					count ++;
				}
			}
		}
		System.out.println(count);

	}

}
