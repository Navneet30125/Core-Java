package Assign_20_02_serialization_deserialization;

import java.util.*;

class ArrayToList{
	public static List<String> convertToList(String[] inputArray) {
		if(inputArray==null) {
			return null;
		}
		if(inputArray.length==0) {
			return new ArrayList<>();
			
		}
		return Arrays.asList(inputArray);
	}
}
public class Tester {

	public static void main(String[] args) {
		String[] array1 = {"apple", "Banana", "Orange"};
		List<String> list1 = ArrayToList.convertToList(array1);
		System.out.println("Normal array: "+list1);
		
		String[] array2 = null;
		List<String> list2 = ArrayToList.convertToList(array2);
		System.out.println("Null Array: "+list2);
		
		String[] array3 = {};
		List<String> list3 = ArrayToList.convertToList(array3);
		System.out.println("Empty Array: "+list3);		
		
	}

}
