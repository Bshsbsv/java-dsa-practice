public class BinarySearch{
  public static void main (String [] args){
    int [] nums ={3,6,9,12,15,18,21};
    int target = 7;
    int left = 0;
    int right = nums.length -1;
    int index = -1;

    while (left < right){
      int mid = left + (right - left) /2;

      if(nums[mid] == target){
        index = mid;

      }else if (target < nums[mid]){
        right = mid -1;

      }else{
        left = mid +1;

      }


    }
    System.out.println(index);


  
