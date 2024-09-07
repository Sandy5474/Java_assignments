class Demo {
   public static void main(String[] args) {
  char ch1='A';
char ch2='a';
    for(int i=4;i>0;i--){
		for(int j=0;j<i;j++){

            if(i%2==0){
		System.out.print((char)(ch1+j));
		
}else{
		System.out.print((char)(ch2+j));
		
}
           
        }
        System.out.println();
    }
   } 
}