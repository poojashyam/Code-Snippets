import java.util.*;
public class Longest_Polish_notation {
	public static void main(String args[]){
		Longest_Polish_notation lpn = new Longest_Polish_notation();
		LPolishNotation();
		
	}
	public static void LPolishNotation(){
		String notation;
		Stack st = new Stack();
		char[] arrayS = new char[100];
		int top = -1;
		int number1=0;
		int number2 = 0;
		System.out.println("Enter the Polish notation to be solved");
		Scanner scr = new Scanner(System.in);
		notation = scr.next();
		
		System.out.println(notation);
		for(int i = 0; i<notation.length(); i++){
			arrayS[i] = notation.charAt(i);
		}
		for(int  i = 0; i <notation.length();i++){
			int num = 0;
			if(arrayS[i] >= '0' && arrayS[i] <='9')
			{
				int k= ((int)arrayS[i] & 0xF);
				System.out.println(k);
				StackPush(st,k);
				
			}
			else
			{
				number2 = StackPop(st);
				number1 = StackPop(st);
				System.out.println(number1);
				System.out.println(number2);
				if(arrayS[i] == '+'){
					num =number1 + number2;
					StackPush(st,num);
				}
				else if(arrayS[i] == '-'){
					num =number1 - number2;
					StackPush(st,num);
				}
				else if(arrayS[i] == '*'){
					num =number1 * number2;
					StackPush(st,num);
				}
				else if(arrayS[i] == '/'){
					num =number1 / number2;
					StackPush(st,num);
				}
				else
					System.out.println("none");
			}
			
		}
	}
	public static int StackPop(Stack st){
		int a = (int) st.pop();
		System.out.println("popped " +a);
		return a;
		
	}
	public static void StackPush(Stack st, int a)
	{
		st.push(new Integer(a));
		System.out.println(st);
	}
	

}