package AutomationTestingTraining.ProgramsAndCollections;

import java.io.*;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;

public class RemoveZerosFromEnd {

	public static void main(String[] args) throws IOException {
		//Int a=1202300
//		Output =12023
//				a=101000000
//				Output = 101
	//	System.out.println(removeZeros(101000000));
	FileInputStream source = new FileInputStream(new File("C:\\Users\\anwreddy\\Desktop\\Invoices\\I-76361-invoice-Anwesh Reddy Kommidi.pdf"));
	File destination = new File("C:\\Users\\anwreddy\\Desktop\\Form-16");
	//FileUtils.copyToFile(source, destination);
	//FileUtils.copyDirectory(new File("C:\\\\Users\\\\anwreddy\\\\Desktop\\\\Invoices"), destination);
	
	}
public static int removeZeros(int input) {
	int output=0;
	Deque<Character> queue = new  LinkedList<>();
	char[] ch  = Integer.toString(input).toCharArray();
	
	for(char c:ch) {
		queue.add(c);		
		}
	System.out.println(queue);
	for(int i=queue.size()-1;i>=0;i--) {
		//This line will get the last value of deque 
		//and compares whether it matches with char 0 or not
		if(queue.getLast()=='0') {
			//if char matches to zero then remove that zero from deque list
			queue.pollLast();}
		//if non zero element get displayed then break out of the loop
		else {
				break;
			}
	}
	//This is used to convert deque char array to String
	StringBuilder sb = new StringBuilder();
	for(char c:queue) {
		sb.append(c);
	}
	//To convert String to Integer
	output = Integer.parseInt(sb.toString());	
	
	return output;
}
}
