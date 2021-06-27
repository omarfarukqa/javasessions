package OOP_Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("page --const");
		
	}
	
	public abstract void title ();
	public abstract void header ();
	
	public void timeOut() {
		System.out.println("page timeout is 20 sec");
	}
	
	public final void logo () {
		System.out.println("App logo");
		
	 
	}
}
