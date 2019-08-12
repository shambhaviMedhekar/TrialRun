package RandomCode;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		List<List<Integer>> value=generate(1);
		for(int i=0;i<value.size();i++)
		{
			List<Integer> item=value.get(i);
			for(int j=0;j<item.size();j++) {
				System.out.print(" "+item.get(j)+" ");
			}
			System.out.println();
		}

	}

	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		
		for(int i=0;i<numRows;i++) {
			List<Integer> item=new ArrayList<Integer>();
			
			for(int j=0;j<=i;j++) {
				int value=0;
				if(i==j || j==0){
					value= 1;
				}
				item.add(value);
			}
			result.add(item);
		}
		if(numRows>1)
		generatePascal(numRows-1,numRows-2,result);

		return result;
	}

	private static int generatePascal(int i, int j, List<List<Integer>> result) {
		
		int value=1;
		
		if(i>-1 && j>-1) {
			if(result.get(i).get(j)>0) {
				return result.get(i).get(j);
			}
		
		if(i==j || j==0){
			value= 1;
		}
		else {
			
			int value1=0,value2=0;
			if(i>-1 && j>-1)
				value1=generatePascal(i-1,j-1,result);
			if(i>-1 && j>-1)
				value2=generatePascal(i-1,j,result);
			value=value1+value2;
		}
		}
		result.get(i).set(j,value);
		if(j-1>0)
		generatePascal(i,j-1,result);
		return value;
		

	}

}
