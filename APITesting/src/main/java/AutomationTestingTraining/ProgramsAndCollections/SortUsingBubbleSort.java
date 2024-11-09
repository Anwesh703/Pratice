package AutomationTestingTraining.ProgramsAndCollections;

public class SortUsingBubbleSort {
public static void main(String[] args) {
	//input = {3,0,2,4,0,5,0}
	int[] arr = {3,1,0,24,0,20,5,0};
	int count = arr.length-1;
	sortElementsAndZerosToRight(arr);
	for(int i=0;i<arr.length-1;i++) {
		//for(int j=0;j<arr.length-i-1;j++) {
		for(int j=0;j<arr.length-1;j++) {			
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] =arr[j+1] ;
				arr[j+1] = temp;
			}
		}
	}
//	for(int i:arr) {
//	System.out.println(i);}
	
}
public static void sortElementsAndZerosToRight(int[] arr) {
	int size = arr.length;
	int count =0;
	//int[] arr = {3,1,24,0,20,5,0};
	for(int i:arr) {
		if(i!=0) {
			arr[count++]=i;
		}
	}
	for(int i=0;i<count-1;i++) {
		for(int j=i+1;j<count;j++) {
			if(arr[i]>arr[j]) { 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	while(count<size) {
		arr[count++] = 0;
	}
	for(int i:arr) {
		System.out.println(i);}
}
}