import java.util.*;
class Solve{
	public int getMinNum(int []arr) {
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>count) {
				return count;
			}
			else if(arr[i]==count) {
				count++;
			}
		}		
		return count;
	}
	
}

public class TaskExercise {
	
	
	public static void main(String[]args) {
		int [] nums= {1,2,0};
		int [] nums1= {3,4,-1,1};
		int [] nums2= {7,8,9,11,12};
		Arrays.sort(nums);
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Solve sol=new Solve();
		
		System.out.println("For Case 1 : "+sol.getMinNum(nums));
		System.out.println("For Case 2 : "+sol.getMinNum(nums1));
		System.out.println("For Case 3 : "+sol.getMinNum(nums2));
		
		
		
		
		/*
		int [] nums= {1,2,0};
		int []nums1= {0,1,2,3,4,5,6,7,8,9,10};
		int flag=0;
		Arrays.sort(nums);
		int n=nums.length;int k=0;
		for(int j=0,i=0;j<=nums1.length;j++) {
			
		//	for(int i=0;i<n;i++) {
			i=j;
				if(nums1[j]==nums[i]) {
					for(; ;) {
						break;
					}
				}
			
			if(nums1[j]!=nums[i]) {
				flag=1;
				k=nums1[j];
				break;
			}
			
	//	}
			if(flag==1)break;}
		System.out.println(k);*/
	}
	

}