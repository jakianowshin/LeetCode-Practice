class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
        
    }

      public static void main(String[] args) {
          RemoveElement r = new RemoveElement();
          int val = 3;
          int [] nums = {3,2,2,3};

          System.out.println(r.removeElement(nums, val));
        
    }
}
