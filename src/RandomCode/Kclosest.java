package RandomCode;


import java.util.*;



public class Kclosest {

	public static void main(String[] args) {
		Point[] input =new Point[4];
		Point first=new Point(1,2);
		input[0]=first;
		Point second=new Point(3,3);
		input[1]=second;
		Point third=new Point(5,2);
		input[2]=third;
		Point fourth=new Point(-1,-1);
		input[3]=fourth;
		List<Point> listOfPoints=new ArrayList<Point>();
		for(int i=0;i<input.length;i++) {
			listOfPoints.add(input[i]);
		}
		Collections.sort(listOfPoints,new SortBydistance(7));
		for(int j=0;j<2;j++) {
			System.out.println((j+1)+" "+listOfPoints.get(j).x+" "+listOfPoints.get(j).y);
		}
	}
	public static class SortBydistance implements Comparator<Point> {
		int y;
		public SortBydistance(int i) {
			this.y=i;
		}

		@Override
		public int compare(Point o1, Point o2) {
			int distance1=(int) Math.sqrt(Math.pow((o1.x-0),2)+Math.pow((o1.y-0),2));
			int distance2=(int) Math.sqrt(Math.pow((o2.x-0),2)+Math.pow((o2.y-0),2));
			return distance1 - distance2;
		}

	}
}
