import java.util.Scanner;

public class DemoPalindrom {
    public static void main(String[] args){
        String original, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan input String/Number untuk dicek:");
        original = input.nextLine();

        int length = original.length();
        for(int x = length - 1; x >=0 ;x--){
            reverse = reverse + original.charAt(x);
        }

        if(original.equals(reverse)){
            System.out.println("String/Number adalah Palindrom");
        }else{
            System.out.println("String/Number bukan Palindrom");
        }
    }
}
