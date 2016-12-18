c class Solution {
    public void sortColors(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] == 2 && i < tail){
                swap(nums,i,tail--);
            }
            while(nums[i] == 0 && i > head){
                swap(nums,i, head++);
            }
        }
    }
    private void swap(int A[], int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}
