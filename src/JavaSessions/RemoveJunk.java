package JavaSessions;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		String s = "&&&&&&sher$$$$$$$$$$$$67 ";
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}