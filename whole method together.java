public static int binarySearch(int [] arr , int target){
  int left = 0;
  int right = arr.length -1;
  while (left < = right){
    int mid = left + (right - lift)/2;

    if(arr[mid] == target ){
      return mid ;
    }else if (target < arr[mid]){
      right = mid -1;
    }else {
      lift = mid +1;

    }

  }
  return -1;


} 

