import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi muốn kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));

        }
        String reverseString = "";

        while (!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }
        if (inputString.equals(reverseString)){
            System.out.println("Là chuỗi đối xứng: ");
        }else {
            System.out.println("Không phải chuỗi đối xứng: ");
        }
    }
}
