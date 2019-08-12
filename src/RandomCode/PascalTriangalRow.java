package RandomCode;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangalRow {

	public static void main(String[] args) {
		List<Integer> value=getRow(29);
		for(int j=0;j<value.size();j++) {
			System.out.print(" "+value.get(j)+" ");
		}
	}

	/*
	 * public static List<Integer> getRow(int rowIndex) { List<Integer> result=new
	 * ArrayList<Integer>(); if(rowIndex>-1){ for(int i=0;i<=rowIndex;i++){
	 * if(i==0||i==rowIndex) { result.add(1); } else{ result.add(0); }
	 * 
	 * } if(rowIndex>0) { for(int i=1;i<rowIndex;i++){
	 * generatePascalRow(rowIndex,i,result); } }
	 * 
	 * }
	 * 
	 * return result;
	 * 
	 * 
	 * } private static void generatePascalRow(int rowIndex,int j, List<Integer>
	 * result) { int value=1; if(j==0||j==rowIndex) { value= 1; } else {
	 * value=generatePascal(rowIndex,j); } result.set(j,value);
	 * 
	 * } private static int generatePascal(int i, int j) {
	 * 
	 * int value=1; if(i>-1 && j>-1) { if(i==j || j==0){ value= 1; } else {
	 * 
	 * int value1=0,value2=0; if(i>-1 && j>-1) value1=generatePascal(i-1,j-1);
	 * if(i>-1 && j>-1) value2=generatePascal(i-1,j); value=value1+value2; } }
	 * 
	 * 
	 * return value;
	 * 
	 * 
	 * }
	 */
	public static List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<Integer>();
        if(rowIndex==0){
            result.add(1);
        }
    else{
            for(int i=0;i<=rowIndex;i++){
                if(i==0||i==rowIndex){
                    result.add(1);
                }
                else{
                result.add(0);
                }    

            }
           generatePascal(rowIndex,rowIndex,rowIndex,result);
        }
        return result;
    }
    

    private static int generatePascal(int rowIndex,int i, int j,List<Integer> result) {
		int value=1;
        if(i==j || j==0){
            value= 1;
        }
        else {
            int value1=0,value2=0;
            if(i>0 && j>0)
                value1=generatePascal(rowIndex,i-1,j-1,result);
            if(i>0)
                value2=generatePascal(rowIndex,i-1,j,result);
            value=value1+value2;
        }
        if(i==rowIndex && j-1>0){
	        int val=generatePascal(rowIndex,i,j-1,result);
            result.set(j-1,val);
        }
		return value;
	}

	/*
	 * public static List<Integer> getRow(int rowIndex) { List<Integer> result=new
	 * ArrayList<Integer>(); if(rowIndex==0){ result.add(1); } else{ for(int
	 * i=0;i<=rowIndex;i++){ if(i==0||i==rowIndex){ result.add(1); } else{
	 * result.add(0); }
	 * 
	 * } int value=generatePascal(rowIndex,rowIndex-1,result);
	 * result.set(rowIndex-1, value); } return result; }
	 * 
	 * 
	 * private static int generatePascal(int i, int j,List<Integer> result) { int
	 * value=1; if(i==j || j==0){ value= 1; } else { int value1=0,value2=0; if(i>-1
	 * && j>-1) value1=generatePascal(i-1,j-1,result); if(i>-1 && j>-1)
	 * value2=generatePascal(i-1,j,result); value=value1+value2; } if(j-1>0){ int
	 * val=generatePascal(i,j-1,result); result.set(j-1,val); } return value; }
	 */
}
