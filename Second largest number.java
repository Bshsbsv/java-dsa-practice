int [] nums = {10,5,20,8,15};

int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for(int i =0; i< nums.length; i++){
  if(nums[i] > largest){
    secondLargest = largest;
    largest = nums[i];
  }else if (nums[i] > secondLargest && nums[i] !largest){
    secondLargest = nums[i];


  }


}

}
System.out.println(secondLargest);


  

    
    
