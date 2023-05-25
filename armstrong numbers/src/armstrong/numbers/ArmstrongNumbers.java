
package armstrong.numbers;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();

        int digit = 0, temp = number;
        while (temp != 0) {
            temp /= 10;
            digit++;
        }

        int base,resault=0;
        temp=number;
        for (int i = 0; i < digit; i++) {
            base=temp%10;
            temp/=10;
            resault+=Math.pow(base, digit);
            
        }
        if(resault==number){
            System.out.printf("%s is Armstrong number.",number);
        }else{      
            System.out.printf("%s is not Armstrong number.",number);
        }
    }

}
