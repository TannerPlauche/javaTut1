package com.tanner;

public class Main {

    public static void main(String[] args) {
        MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.println(testEquation.getResult());
        // write your code here
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];
//        double val1 = 100.0d;
//        double val2 = 50;
//        double result;
//        char opcode = 'd';

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println();
        System.out.println("using overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;
        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("result = " + equationOverload.getResult());
        equationOverload.execute(leftInt, rightInt);
        System.out.println("result = " + equationOverload.getResult());
        equationOverload.execute((double)leftInt, rightInt);
        System.out.println("result = " + equationOverload.getResult());

    }

}
