

import java.util.*;

public class Postfix_expression {

    public static void postfix(String expression){
        
   /*----------------------------------------------------------------------------------------------------------- */

        //just for practise i wrote in comments....
        /*Stack<Integer>s = new Stack<>();
         * for (int i =0;i<exp.;ength();i++){
         * charc = exp.charAt(i);
         * 
         * if(Characcter.isDigit(c)){
         * s.push(Character.getNumericValue(c));
         * }
         * else {
         * int operand2 = s.pop();
         * int operand1 = s.pop();
         * int result = 0;
         * }
         * 
         * switch(c){
         * case'+' :
         * 
         * }
         * s.push(result);
         * }
         * int final results = s.pop();
         * 
         */
        /*----------------------------------------------------------------------------------------------------------- */
        Stack<Integer> s= new Stack<Integer>();

        for(int i =0;i<expression.length();i++){
            char c = expression.charAt(i);

            if (Character.isDigit(c)){
                s.push(Character.getNumericValue(c));

            }
            else {
                int operand2 = s.pop();
                int operand1 =s.pop();
                int result = 0;

                switch (c){
                    case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
            }

            s.push(result);
            }
        }

        int finalResult = s.pop();
        System.out.println("Result: " + finalResult);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String expression = scanner.nextLine();

        postfix( expression);

    }
}
