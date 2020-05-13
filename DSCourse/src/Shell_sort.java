
public class Shell_sort {
public static void main(String[] args) {
	int[] nums = {25,24,21,20,19,15,12,10,9,7};
//	System.out.println(calcH(nums,0));
	shellSort(nums,calcH(nums,0));
	for(int i :nums) {
		System.out.println(i+ ",");
	}
}
public static void shellSort(int[] nums,int gap) {

	if(gap>0) {
		for(int j = 0;j<gap;j++) {
			for(int i=gap*2-1;i<nums.length; i+=gap) {
				int key = nums[i];
				int prev = i-gap;
				while(prev>=gap-1 && nums[prev]>key) {
					nums[prev+gap] = nums[prev];
					prev-=gap;
				}
				nums[prev+gap] = key;
			}
}
		shellSort(nums, (gap-1)/3);
	}
}
public static int calcH(int[] nums, int h) {
	if(h<nums.length-1) {
		return calcH(nums,3*h+1);
	}
	else {
		return (h-1)/3;
	}
	
	}
}
