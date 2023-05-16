package com.example.maytinh;

public class MayTinh {
    public static float KetQua(float number1, float number2, char a){
        switch (a){
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if(number2 != 0){
                    return number1 / number2;
                }
                else {
                    throw new RuntimeException("Number != 0");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
