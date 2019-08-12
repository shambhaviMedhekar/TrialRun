package RandomCode;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Math.abs(3-4);
		Scanner sc=new Scanner(System.in);
		
		int[] values=new int[] {1,0,1,0,1,0};
		
		String abc;
		ArrayList<Interval> intervals = new ArrayList();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(11,12));
		Interval newInterval=new Interval(4, 8);
		/*
		 * input.add(new Interval(1, 3)); input.add(new Interval(6, 8)); input.add(new
		 * Interval(9, 14));
		 */
		/*
		 * System.out.println("before"); for(int i = 0 ; i < input.size() ; i++){
		 * System.out.print(" "+input.get(i).start+","+input.get(i).end+" "); }
		 * System.out.println("after"); int a[]= {2,5,1,3,7,4}; Arrays.sort(a); for(int
		 * i = 0 ; i < a.length ; i++){ System.out.print(" "+a[i]+" "); }
		 */
		/*
		 * int ab=8; String value=Integer.toString(ab);
		 * 
		 * String abcs=Integer.toBinaryString(Integer.parseInt(value,2));
		 * System.out.println("abcs"+abcs); StringBuilder st=new StringBuilder(abcs);
		 * String reverse=st.reverse().toString();
		 * System.out.println("reverse"+reverse); System.out.println("decimal"+
		 * Integer.parseInt(String.valueOf(reverse)));
		 */
		/*
		 * Collections.sort(input,new SortByStart()); for(int i = 0 ; i < input.size() ;
		 * i++){ System.out.print(" "+input.get(i).start+","+input.get(i).end+" "); }
		 */
		  ArrayList<Interval> result = new ArrayList<>();
		  
	        boolean added=false;
	        Interval toBeAdded=newInterval;
	        for(int i=0;i<intervals.size();i++){
	            if(result.isEmpty()){
	                result.add(new Interval(intervals.get(i).start, intervals.get(i).end));
	                if(toBeAdded.start<=result.get(result.size() - 1).end
							&& toBeAdded.end > result.get(result.size() - 1).end){
	                    result.get(result.size() - 1).end = toBeAdded.end;
	                    added=true;
	              }
	            }
	            else{
	                
	                if(added){
	                toBeAdded=intervals.get(i);
	                }
	                
	                if(toBeAdded.start>result.get(result.size() - 1).end){
	                    result.add(new Interval(toBeAdded.start, toBeAdded.end));
	                    added=true;
	                }
	                else if(toBeAdded.start<=result.get(result.size() - 1).end
							&& toBeAdded.end > result.get(result.size() - 1).end){
	                    result.get(result.size() - 1).end = toBeAdded.end;
	                    added=true;
	              }
	                else if(toBeAdded.start < result.get(result.size() - 1).end
							&& toBeAdded.end <= result.get(result.size() - 1).end){
	                	for(int j = 0 ; j < result.size() ; j++)
	        	        { System.out.print(" "+result.get(j).start+","+result.get(j).end+" "); 
	        	        }
	                	break;
	                }
	                
	            }
	        
	        }
	        for(int i = 0 ; i < result.size() ; i++)
	        { System.out.print(" "+result.get(i).start+","+result.get(i).end+" "); 
	        }
		 
		/*
		 * String str = new String("4193 sdbfskfb"); StringBuilder s = new
		 * StringBuilder(); char c[] = str.toCharArray(); boolean decimal = false; for
		 * (int i = 0; i < c.length; i++) { if (i == 0 && (c[i] == '-' || c[i] == '+'))
		 * { s.append(c[i]); } else if (c[i] == '.') { decimal = true;
		 * 
		 * } else if (!Character.isDigit(c[i])) { if (s.length() == 0)
		 * System.out.println("char" + 0); else if (!Character.isDigit(c[i])) {
		 * System.out.println("multiplecah" + 0); } } else { if (!decimal)
		 * s.append(c[i]); } } if (decimal && s.length() == 0) {
		 * System.out.println("decimal" + 0); } else if (s.length() == 1 && (s.charAt(0)
		 * == '+' || s.charAt(0) == '-')) { System.out.println("sign" + 0); } str =
		 * s.toString(); int value = Integer.parseInt(str); str = s.toString();
		 * System.out.println(str);
		 */
		 
		
		/*
		 * int value[]={1,5,10,50,100,500,1000}; String
		 * symbol[]={"I","V","X","L","C","D","M"}; ArrayList valueList=new ArrayList();
		 * valueList.add(1); valueList.add(5); valueList.add(10); valueList.add(50);
		 * valueList.add(100); valueList.add(500); valueList.add(1000); ArrayList
		 * symbolList=new ArrayList(); symbolList.add("I"); symbolList.add("V");
		 * symbolList.add("X"); symbolList.add("L"); symbolList.add("C");
		 * symbolList.add("D"); symbolList.add("M"); int num=60; String
		 * input=Integer.toString(num); char arrayValue[]=input.toCharArray(); int
		 * reversedNumber[]=new int[arrayValue.length]; int k=0; for(int
		 * i=arrayValue.length-1;i>=0;i--){ reversedNumber[k++]=arrayValue[i]-'0'; } int
		 * special[]={1,10,100,1000}; String specialSymbol[]={"I","X","C","M"};
		 * StringBuilder roman=new StringBuilder(); for(int
		 * i=0;i<reversedNumber.length;i++){ int
		 * digit=reversedNumber[i]*((int)Math.pow(10,i)); if(digit==0) { continue; } int
		 * index=valueList.indexOf(digit); if(index!=-1){ roman.append(symbol[index]);
		 * continue; } for(int j=0;j<special.length;j++){ for(int
		 * x=1;x<value.length;x++){ if((digit+special[j])==value[x]){
		 * roman.append(symbol[x]); roman.append(specialSymbol[j]); break; } }
		 * 
		 * } int lessthan=5*(int)Math.pow(10,i); int greaterThan=4*(int)Math.pow(10,i);
		 * int times=digit/special[i]; if(digit<greaterThan){ for(int l=0;l<times;l++)
		 * roman.append(specialSymbol[i]); continue; } else if((digit>lessthan )&&
		 * (digit-lessthan<greaterThan)){ times=(digit-lessthan)/special[i]; for(int
		 * l=0;l<times;l++) roman.append(specialSymbol[i]); int
		 * symIndex=symbolList.indexOf(specialSymbol[i]);
		 * roman.append(symbol[symIndex+1]); continue; } } System.out.println(
		 * roman.reverse().toString());
		 */

		/*
		 * String intValue=Integer.toString(10000); char
		 * intValues[]=intValue.toCharArray(); String blankSpace=" "; String ten="Ten";
		 * 
		 * ArrayList<String> units=new ArrayList<String>(); for(int i=0;i<11;i++) {
		 * units.add(""); } units.add(3, "Hundred"); units.add(4, "Thousand");
		 * units.add(6, "Hundred"); units.add(7, "Million"); units.add(9, "Hundred");
		 * units.add(10, "Billion");
		 * 
		 * ArrayList numbers=new ArrayList(); numbers.add(" "); numbers.add("One");
		 * numbers.add("Two"); numbers.add("Three"); numbers.add("Four");
		 * numbers.add("Five"); numbers.add("Six"); numbers.add("Seven");
		 * numbers.add("Eight"); numbers.add("Nine");
		 * 
		 * StringBuilder str=new StringBuilder(); ArrayList result=new ArrayList();
		 * 
		 * int reversedNumber[]=new int[intValues.length]; int k=0; for(int
		 * i=intValues.length-1;i>=0;i--){ reversedNumber[k++]=intValues[i]-'0'; } int
		 * prev=0; boolean ifAllPrevZero=true; for(int i=0;i<reversedNumber.length;i++){
		 * if(reversedNumber.length==1 && reversedNumber[i]==0){ result.add("Zero");
		 * 
		 * } int digit=reversedNumber[i]; if(i>0){ prev=reversedNumber[i-1]; } if(i==5)
		 * { int abc=0; } if(digit==0) continue; else{ if(i!=reversedNumber.length-1)
		 * ifAllPrevZero=false; else if(ifAllPrevZero && i==reversedNumber.length-1){
		 * if(reversedNumber.length==5||reversedNumber.length==8){
		 * result.add(units.get(reversedNumber.length-1)); } } }
		 * if(units.get(i+1).length()!=0){ result.add(units.get(i+1)); } if(i%3==0){
		 * result.add(numbers.get(digit)); } else if(i==1){ if(digit==1) {
		 * if(result.size()>0) result.remove(result.size()-1);
		 * 
		 * } ArrayList duplicateResult=new ArrayList();
		 * duplicateResult=tensPlace(digit,prev); result.addAll(duplicateResult);
		 * 
		 * } else if((i+1)%3==0){ result.add(numbers.get(digit)); } else { if(digit==1)
		 * { if(result.size()>0 && !ifAllPrevZero) result.remove(result.size()-1);
		 * 
		 * } ArrayList duplicateResult=new ArrayList();
		 * duplicateResult=tensPlace(digit,prev); result.addAll(duplicateResult);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * } for(int i=result.size()-1;i>=0;i--){ str.append(result.get(i)+blankSpace);
		 * } System.out.println(str.toString());
		 */
		  }
	/*
	 * } }
	 */

	public static ArrayList tensPlace(int digit, int prev) {

		ArrayList partialnumbers = new ArrayList();
		ArrayList result = new ArrayList();
		partialnumbers.add(0, " ");
		partialnumbers.add(1, "Eleven");
		partialnumbers.add(2, "Twe");
		partialnumbers.add(3, "Thir");
		partialnumbers.add(4, "Four");
		partialnumbers.add(5, "Fif");
		partialnumbers.add(6, "Six");
		partialnumbers.add(7, "Seven");
		partialnumbers.add(8, "Eigh");
		partialnumbers.add(9, "Nine");
		String onetens = "teen";
		String tens = "ty";
		String ten = "Ten";
		if (digit == 1) {

			result = new ArrayList();
			if (prev == 0) {
				result.add(ten);
			} else if (prev == 1) {
				result.add(partialnumbers.get(prev));
			} else if (prev == 2) {
				result.add(partialnumbers.get(prev) + "lve");
			} else {
				result.add(partialnumbers.get(prev) + onetens);
			}

		} else {
			if (digit == 2) {
				result.add(partialnumbers.get(digit) + "n" + tens);
			} else if (digit == 4) {
				result.add("For" + tens);
			} else {
				result.add(partialnumbers.get(digit) + tens);
			}
		}
		return result;
	}

	public static class SortByStart implements Comparator<Interval> {

		@Override
		public int compare(Interval o1, Interval o2) {

			return o1.start - o2.start;
		}

	}

	public static class Interval {
		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		int start;
		int end;
	}

}