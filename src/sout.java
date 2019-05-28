import java.util.HashMap;

public class sout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data;
		int[] a1 = { 1, 2, 3, 4, 5 };
		data = twoSum(a1,9);
		
	}

    public static int[] twoSum(int[] nums, int target) {
        
        int len = nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < len; ++i) {
           final Integer value = map.get(nums[i]);
          System.out.println(value);
           if (value != null) {
               return new int[] { value, i };
           }
           
           map.put(target - nums[i], i);
       }
       return null;
   }

}
