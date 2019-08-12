package RandomCode;


public class FindIndexInMountainArray {

	public static void main(String[] args) {
		MountainArray mn=new MountainArray();
		mn.values.add(1);
		mn.values.add(2);
		mn.values.add(3);
		mn.values.add(4);
		mn.values.add(5);
		mn.values.add(3);
		mn.values.add(1);
		int index=findInMountainArray(3,mn);
		System.out.println(index);
		
		
	}
	public static int findInMountainArray(int target, MountainArray mountainArr) {
        int index=-1;
        if(mountainArr.length()<3){
            return index;
        }
        index=findIndex(target,mountainArr,0,mountainArr.length()-1);
        return index;
    }
    public static int findIndex(int target, MountainArray mountainArr,int left,int right) {
        if(right<left){
            return -1;
        }
        if(left==right) {
        	if(target==mountainArr.get(left)) {
        		return left;
        	}
        	else {
        		return -1;
        	}
        }
        int mid=left+(right-left)/2;
        int indexFromLeft=findIndex(target,mountainArr,left,mid);
        int indexFromRight=findIndex(target,mountainArr,mid+1,right);
        if(indexFromLeft!=-1 && indexFromRight!=-1){
            if(indexFromLeft<indexFromRight){
                return indexFromLeft;
            }
            else{
                return indexFromRight;
            }
        }
        else if (indexFromLeft==-1 && indexFromRight!=-1){
            return indexFromRight;
        }
        else if(indexFromLeft!=-1 && indexFromRight==-1){
            return indexFromLeft;
        }
        else{
            return -1;
        }
        
    }
}
