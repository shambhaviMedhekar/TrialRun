package Core;

public class SingletonImpl {

	public static void main(String[] args) {
		Singleton first=Singleton.getInstance();
		System.out.println(first.i);
		first.i=first.i+90;
		Singleton second=Singleton.getInstance();
		System.out.println(second.i);
		
	}
}
class Singleton {
	private static Singleton single=null;
	int i;
	private Singleton() {
		i=90;
		
	}
	public static Singleton getInstance() {
		if(single==null) {
			single=new Singleton();
			
		}
		return single;
	}
}


