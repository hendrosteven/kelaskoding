public class DemoFibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, ... ini deret Fibo

    public static void main(String[] args){
        int count = 10;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.print(n1 +" "+ n2);

        for(int i = 2; i<count; ++i){
            n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
