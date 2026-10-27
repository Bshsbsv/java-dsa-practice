int [] num = {10,20,30,40,50};

int left = 0;
int right = num .lenght -1;
while (left < right){
  int temp = num[left];
  num[left] = num[right];
  num[right] = temp;

  left++;
  right--;

}

for(int i = 0; i < num.lenght; i++){
  System.out.print(num[i] + "");

}
