import java.util.InputMismatchException;

public class Calculator {
    public static float calculate(float firstNumber,float secondNumber,String operator){
        float result=0;
        switch(operator){
            case "+":
                result = firstNumber+secondNumber;
                break;
            case "-":
                result = firstNumber-secondNumber;
                break;
            case "*":
                result = firstNumber*secondNumber;
                break;
            case "/":
                if(secondNumber!=0)
                    result = firstNumber/secondNumber;
                else
                    throw new RuntimeException("Khong chia cho 0");
                break;
            default:
                throw new RuntimeException("Nhap du lieu khong phu hop");
        }
        return result;
    }
}
