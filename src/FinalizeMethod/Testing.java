package FinalizeMethod;

public class Testing {

	public static void main(String[] args) {

		Testing t = new Testing();
		t = null;
		
		System.gc();
		System.out.println("testing is done");
		
		
		
		
		
		
	}

	@Override
	public void finalize() {
		System.out.println("Testing --finalize method ...");
		
	}
	
	
	
	
	
	
	
	
}
