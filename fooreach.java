public class fooreach {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 33;
        nums[1] = 54;
        nums[2] = 545;
        nums[3] = 545432;

        for (int i : nums) {
            System.out.println(i);
        }
        
    }
}
