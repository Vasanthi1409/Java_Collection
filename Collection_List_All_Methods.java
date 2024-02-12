package Collection.com;

import java.util.ArrayList;
import java.util.List;

public class Collection_List_All_Methods {

	public static void main(String[] args) {
		
		List<Object> ListAll = new ArrayList<Object>();
		
		ListAll.add(240);	
		ListAll.add(420.50);	
		ListAll.add(0, "Array");		//add(Index, Object)
		System.out.println(ListAll);
		int size = ListAll.size();		
		System.out.println(size);		
		int indexOfArray = ListAll.indexOf(240);
		System.out.println(indexOfArray);		
		int lastIndexOfListAll = ListAll.lastIndexOf("r");
		System.out.println(lastIndexOfListAll);		
		boolean ListAllcontains = ListAll.contains("Array");
		System.out.println(ListAllcontains);		
		Object getindexofListAll = ListAll.get(1);
		System.out.println(getindexofListAll);		
		ListAll.set(1, 230);
		System.out.println(ListAll);		
		
		List<Object> L = new ArrayList<Object>();		
		boolean IsemptyListAll = L.isEmpty();
		System.out.println(IsemptyListAll);		
		
		List<Object> NewList = new ArrayList<Object>();		
		NewList.add(120);
		NewList.add(30);
		NewList.add(230);
		
		ListAll.addAll(NewList);
		System.out.println(ListAll);		
		ListAll.remove(2);
		System.out.println(ListAll);		
		ListAll.removeAll(NewList);
		System.out.println(ListAll);		
		ListAll.retainAll(NewList);
		System.out.println(ListAll);		
		ListAll.clear();
		System.out.println(ListAll);		
	}
}
