int [] numbers = {11, 25, 8, 19, 30};
int target = 19;
int index = -1;

for (int i = 0; i< numbers.length; i++){
  if(numbers[i] == target){
    index = i;
    break;

  }

}
System.out.println(index);
