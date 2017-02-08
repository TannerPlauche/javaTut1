package com.tanner;

/**
 * Created by tannerp on 2/7/17.
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public MathEquation(){}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }
    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int) result;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                if (rightVal != 0.0d)
                    result = leftVal / rightVal;
                else
                    result = 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0;
                break;
        }
    }

    public void setLeftVal(double newLeftVal) {
        leftVal = newLeftVal;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setRightVal(double newRightVal) {
        rightVal = newRightVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setOpCode(char newOpCode) {
        opCode = newOpCode;
    }

    public double getOpCode() {
        return opCode;
    }

    public double getResult() {
        return result;
    }

}
