class FactorialHarsh{
    public Factorial(int num){
        System.out.println("Factorial of "+num+factorial(num));
    }
    public int factorial(int num){
        if(num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}