import java.util.ArrayList;
import java.util.List;

public class MountainArray {
	List<Integer> values=new ArrayList<Integer>();
	public int get(int index) {
		return values.get(index);
	}
	public int length() {
		return values.size();
	}
}
