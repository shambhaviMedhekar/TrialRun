package RandomCode;


public class RectangleOverlap {

	public static void main(String[] args) {
		int area=computeArea(-3,0,3,4,0,-1,9,2);

	}
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

		int area1=Math.abs(A-C)*Math.abs(B-D);
		int area2=Math.abs(E-G)*Math.abs(F-H);

		int common=0;
		if(doOverlap(A,B,C,D,E,F,G,H))
			common=(Math.min(C,G)-Math.max(A,E))*(Math.min(D,H)-Math.max(B,F));

		return (area1+area2)-common;


	}
	public static boolean doOverlap(int A, int B, int C, int D, int E, int F, int G, int H) { 
		if (A > G|| E > C) { 
			return false; 
		} 


		return true; 
	} 

}
