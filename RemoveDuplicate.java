import java.util.*;
public class RemoveDuplicate{
	static Set duplicateChar = new HashSet();
	
	public static void main(String [] args)throws Exception{
		String str = "ankitamakwana";
		
		char []strs = str.toCharArray();
		
		for(char ch : strs){
			if(!hasCharacter(ch)){
				System.out.print(ch);
			}
		}
	}
	
	public static boolean hasCharacter(char ch){
		if(duplicateChar.contains(ch)){
			return true;
		}
			
		else{
			duplicateChar.add(ch);
		}
		
		return false;
	}
}

/*
E:\Any\SEM 3\JAVA\Exam>java RemoveDuplicate
ankitmw
*/