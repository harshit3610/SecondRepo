package harshit.SecondRepo;

public class Syedfactorial {
    class Factorial{
        public Factorial(int value){
            System.out.println("factorial of "+value+factorial(value));
        }
        public int factorial(int value){
            if(value==1){
                return 1;
            }
            else{
                return value*factorial(value-1);
            }
        }
    }
}
