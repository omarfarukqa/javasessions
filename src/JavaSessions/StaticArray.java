package JavaSessions;

public class StaticArray {

	public static void main(String[] args) {

		// int array
		
		int i [] = new int [4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i.length);
		System.out.println(i[3]);
		
		for (int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		
	}

}
