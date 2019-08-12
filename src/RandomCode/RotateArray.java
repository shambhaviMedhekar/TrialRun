package RandomCode;


public class RotateArray {

	public static void main(String[] args) {
		int a[]= {12,13,14,15,10,11};
		int k=12;
		int index=findIndex(a,k);
		System.out.println(index);
	}
	
	private static int findIndex(int[] a, int k) {
		/*
		 * for(int i=0;i<a.length;i++) { if(a[i]==k) { return i; } }
		 */
		int val=findHighest(a,0,a.length-1);
		int index=-1;
		if(val==-1) {
			index=binarySearchIndex(a,0,a.length-1,k);
		}
		else if(a[val]==k) {
			index=val;
		}
		else if(a[0]<=k) {
			index= binarySearchIndex(a,0,val-1,k);
		}
		else {
			index= binarySearchIndex(a,val+1,a.length-1,k);
		}
		return index;
	}

	private static int findHighest(int[] a, int start, int end) {
		
		if(start>end) {
			return -1;
		}
		if(start==end) {
			return start;
		}
		int mid=start+(end-start)/2;
		if(mid<end && a[mid]>a[mid+1]) {
			return mid;
		}
		if(mid>start && a[mid]<a[mid-1] ){
			return (mid-1);
		}
		if(a[start]>=a[mid]) {
			return findHighest(a,start,mid-1);
		}
		else {
			return findHighest(a,mid+1,end);
		}
	}

	private static int binarySearchIndex(int[] a, int start, int end, int k) {
		if(start>end) {
			return -1;
		}
		if(start==end) {
			if(a[start]==k) {
				return start;
			}
			else {
				return -1;
			}
		}
		int mid= start+(end-start)/2;
		int index=-1;
		if(a[mid]==k) {
			return mid;
		}
		else {
			if(k>a[mid]) {
				index=binarySearchIndex(a,mid+1,end,k);
			}
			else {
				index=binarySearchIndex(a,start,mid-1,k);
			}
		}
		
		return index;
	}

}
