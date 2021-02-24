<<<<<<< HEAD
class Factorial{
    int fact=1;
    public Factorial(int val){
    
    this.fact=val;

    }

    public static void facto(int val)
    {
        for(int i=1;i<val;i++)
        {
            fact=fact*i;
            
        }
    }
    public static void main(String args[]){
        Factorial ff=new Factorial(4);
        ff.facto();

    }
}
=======
class Factorial{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=3;    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
>>>>>>> 23c92de0b597f9720efb665e396a4a32e167c3d8
