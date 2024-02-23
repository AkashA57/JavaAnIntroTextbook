package chat.twelve;

import java.util.ArrayList;

public class ArraylistSize {
	
	public static ArrayList<String> getCommonStrings(ArrayList<String> list1, ArrayList<String> list2) {
		
		ArrayList<String> commonList = new ArrayList<String>();
		
		for(String extractList1:list1) {
			for(String extractList2:list2) {
				
				if(extractList1.equals(extractList2)) {
					commonList.add(extractList1);
					break;
				}
			}
			
		}
		return commonList;
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("what");
		list1.add("is");
		list1.add("my");
		list1.add("name");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("is");
		list2.add("is");
		list2.add("is");
		list2.add("is");
		
		ArrayList<String> commonList = getCommonStrings(list1, list2);
		
		for(String printCommon:commonList) {
			System.out.println(printCommon);
		}

	}

}
