package RandomCode;


import java.util.*;

public class Parking {

	public static void main(String[] args) {
		List<List<Integer>> input=new ArrayList<List<Integer>>();
		List<Integer> row=new ArrayList<Integer>();
		row.add(1);
		row.add(1);
		row.add(1);
		row.add(0);
		row.add(0);
		input.add(row);
		row=new ArrayList<Integer>();
		row.add(1);
		row.add(1);
		row.add(1);
		row.add(1);
		row.add(0);
		input.add(row);
		row=new ArrayList<Integer>();
		row.add(1);
		row.add(1);
		row.add(0);
		row.add(0);
		row.add(0);
		input.add(row);
		row=new ArrayList<Integer>();
		row.add(1);
		row.add(1);
		row.add(1);
		row.add(0);
		row.add(0);
		input.add(row);
		row=new ArrayList<Integer>();
		row.add(1);
		row.add(0);
		row.add(0);
		row.add(0);
		row.add(0);
		input.add(row);
		//List<Integer> result= carParking(5,input);
		float price=(float) 1.87;
		List<Float> in=new ArrayList<Float>();
		in.add((float) 0.25);
		in.add((float) 0.25);
		in.add((float) 0.25);
		in.add((float) 0.25);
		in.add((float) 1.00);
		List<Integer> result= ChangeMaker(price,in);
	}


	static List<Integer> carParking(int n, List<List<Integer>> available) {
		List<Integer> result=new ArrayList<Integer>(); 
		int min=available.size(); 
		int k=0,j=0; 
		boolean foundmin=false;
		
		for(int	i=0;i<available.size();i++)
		{ 
			List<Integer> row=available.get(i); 
			
			int count=Collections.frequency(row, 1); 
			if(count<min){ 
				min=count; 
				foundmin=true;
				k=i; 
				j=row.indexOf(0); 
			} 
		} 
		if(foundmin){
			result.add(k);
			result.add(j); 
		}
		else{ 
			result.add(0);
			result.add(0); 
		} 
		return result; 
	}

	public static List<Integer> ChangeMaker(float price, List<Float> payment) {
		int[] values={25,10,5,1};
		List<Integer> result=new ArrayList<Integer>();
		float valuePrice=price;
		// if(valuePrice%1!=0)
		// valuePrice=(int)price *100;

		float pricePayed=0;
		for(int i=0;i<payment.size();i++){
			float paymentValue=payment.get(i);
			// if (paymentValue % 1 != 0)
			//     pricePayed = pricePayed+(int) paymentValue * 100;
			// else{
			pricePayed = pricePayed + paymentValue;
			//}
		}
		int priceP=(int)(pricePayed*100);
		int cost=(int)(valuePrice*100);
		int sum=cost;
		int count=3;
		if(priceP>cost){
			sum=priceP-cost;
		}
		result.add(0);
		result.add(0);
		result.add(0);
		result.add(0);
		for(int i=0;i<4;i++){
			int coin=values[i];
			while(sum-coin>=0){
				sum=sum-coin;
				result.set(count,(result.get(count)+1));
			}
			count--;
		}
		String abc="GHsn";
		return result;
	}
}
