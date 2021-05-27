public class DemoFactorial {
    // 3! = 3x2x1 = 6
    // 4! = 4x3x2x1 = 24

    public static void main(String[] args){
        int number = 5;
        int fact = 1;
        for(int x = 1 ; x<=number;x++){
            //fact = fact * x;
            fact *= x;
        }
        System.out.println("Factorial dari angka "+ number +" adalah "+ fact );
    }
}
