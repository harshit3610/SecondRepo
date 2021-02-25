class Demo {
   static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 
}
class RutujaFact
{    
    public static void main(String args[]){
    
        System.out.println("Hello, World!");
        int num = 5; 
        System.out.println("Factorial of "+ num + " is " + factorial(num)); 
    }


}
