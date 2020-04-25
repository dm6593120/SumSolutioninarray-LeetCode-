import java.util.Scanner;

class twosumleetcode{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int len,x;
		System.out.print("Enter how many no. You want to enter in array=");
		len=sc.nextInt();
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Which Summation no. you want to find=");
		x=sc.nextInt();
		int[] array=find(arr,x);
		for(int a:array)
		{
			System.out.println(a);
		}
		}
	
	public static int[] find(final int[] nums, final int target) {
		int i=0,j=0,flag=0;
		for(i=0;i<nums.length;i++)
       	 {
            for(j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j)
                {
					flag=1;
                   break;
                }

    
        	}
        	if(flag==1){
				break;
			}
    	}
    	int[] array={i,j};
                    return array;
    }
	}
