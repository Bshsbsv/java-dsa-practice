int [] num {10,20,8,12,94};
int target = 12;
int index = -1;

for(int i = 0; i< num.lenght; i++){
  if(num [i] == target){
    index = i;
    break;

  }

}

System.out.println(index);
