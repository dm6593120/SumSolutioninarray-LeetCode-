import java.util.Scanner;

class twosumleetcode{
	public static void main(String[] args){
		
		int[] ar ={3,7,11,2};
		int[] array=find(ar,9);
		for(int a:array)
		{
			System.out.println(a);
		}
	
	
	}
	public static int[] find(int[] nums,int target){
			int[] array= new int[10];
		for(int i=0;i<nums.length;i++)
       	 {
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    array[0]=i;
                    array[1]=j;
                    return array;
                }
    
        	}
    	}
    	return array;
    }
	}
