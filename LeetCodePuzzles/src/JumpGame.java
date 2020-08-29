
public class JumpGame {
	 public boolean canJump(int[] nums) {
	        boolean reached=false;
	        int len=nums.length;
	        System.out.println("length is:"+len);
	        for (int i=1;i<len;i++){
	            if(nums[i]+i==len-1) {
	                reached=true;
	                break;
	            }
	        }
	        return reached;
	    }
	 
	 public static void main(String arg[]) {
		 JumpGame jg = new JumpGame();
		 int input[]= {2,3,1,1,4};
		 System.out.println(jg.canJump(input));
	 }
}
