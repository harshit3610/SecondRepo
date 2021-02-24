class Factorial{
    int fact=1;
    public Factorial(int val){
    
    this.fact=val;

    }

    public static void facto(int val)
    {
        for(int i=1;i<val;i++)
        {
            fact=fact*i;;
        }

    }
    public static void main(String args[]){
        Factorial ff=new Factorial(4);
        ff.facto();

    }
}