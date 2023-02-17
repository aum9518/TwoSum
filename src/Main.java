public class Main {
    public static void main(String[] args) {

        int[] nums={1,8,6,83,12};
        int target = 84;
        for (int i=0;i< nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}