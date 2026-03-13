class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = getFirst(nums, target);
        int last = getLast(nums,target);
        return new int[]{first,last};
    }

    public int getFirst(int[] nums,int target){
        int left =0;
        int right = nums.length-1;

        int index = -1;
        while(left<=right){
            int mid = left + (right-left) /2;
            if(nums[mid] == target){
                index = mid;
                right = mid -1;
            }else if (nums[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return index;
    }
    public int getLast(int[] nums, int target){
        int left =0;
        int right = nums.length - 1;
        int index=-1;

        while(left <= right){
           int mid = left + (right - left) /2;

            if(nums[mid] == target){
                index = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid + 1;

            }else{
                right = mid -1;
            }
        }
        return index;
    }
}