package ssa;

import java.util.Stack;

public class RPNCalculatorSolution {

	public static void main(String[] args) {
		
		char[] chs = new char[] {'1','2','+','3','+','2','*','4','/'}; // should be 3
		Stack<Integer> stk = new Stack<Integer>();
		for(char ch : chs) {
			if(charIsNum(ch)) {
				stk.push(Character.getNumericValue(ch));
			} else {
				int p2 = (int)stk.pop();
				int p1 = (int)stk.pop();
				switch(ch) {
				case '+':
					stk.push(p1 + p2);
					break;
				case '-':
					stk.push(p1 - p2);
					break;
				case '*':
					stk.push(p1 * p2);
					break;
				case '/':
					stk.push(p1 / p2);
					break;
				}
			}
		}
		System.out.printf("The value is %d", (int)stk.pop());
		System.out.println(" Done..");
	}
	static boolean charIsNum(char ch) {
		switch(ch) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return true;
			default:
				return false;
		}
	}

}
