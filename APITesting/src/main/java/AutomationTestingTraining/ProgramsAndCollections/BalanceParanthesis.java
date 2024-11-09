package AutomationTestingTraining.ProgramsAndCollections;

import java.util.Stack;

public class BalanceParanthesis {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para="({}}";
		Stack<Character> sc=new Stack<>();
		int count=0;
		for(int i=0;i<para.length();i++)
		{
			char a= para.charAt(i);
			if(a=='(' || a=='{' || a=='[' )
			{
				sc.push(a);
			}
			else if(sc.empty()) {
				System.out.println("Given string :"+para+" is not well balance paranthesis");
				count++;
			}
			else if((a==')' && sc.peek()=='(') || (a=='}'  && sc.peek()=='{') || (a==']'  && sc.peek()=='['))
			{
				sc.pop();
			}
		}
		if (count==0) {
			System.out.println("Given string :"+para+" is well balance paranthesis");
		}
 
	}
 
}