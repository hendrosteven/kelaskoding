public class DemoFactorialRecursive {
    
    public static void main(String[] args) {
        int fact = 1;
        int number = 5;
        fact = factorial(number);
        System.out.println("Factorial dari angka "+ number +" adalah "+ fact );
    }

    private static int factorial(int number) {
        if(number==0){
            return 1;
        }else{
            return(number * factorial(number-1));
        }
    }
}
