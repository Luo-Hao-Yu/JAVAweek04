import java.util.Scanner;
public class calculator {
    public static float add(float a,float b){
        return a+b;
    }
    public static float subtract(float a,float b){
        return a-b;
    }
    public static float multiply(float a,float b){
        return a*b;
    }
    public static float divide(float a,float b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sca1 = new Scanner(System.in);
        while(true) {
            System.out.println("请输入第一个数：");
            float firstNum = sca1.nextFloat();
            System.out.println("请输入标点符号：");
            String notation = sca1.next();
            System.out.println("请输入第二个数：");
            float secondNum = sca1.nextFloat();
            switch (notation) {
                case "+":
                    System.out.println(add(firstNum, secondNum));
                    break;
                case "-":
                    System.out.println(subtract(firstNum, secondNum));
                    break;
                case "*":
                    System.out.println(multiply(firstNum, secondNum));
                    break;
                default:
                    System.out.println(divide(firstNum, secondNum));
                    break;
            }
        }
    }

}
