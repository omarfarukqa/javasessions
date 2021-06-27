package webDriverArch;

public interface WebDriver {
	
	public void get(String url);
	
	public String getTitle ();
	
	public void close();
	
	public void maximize ();
	
	public void click(String element);
	
	public void sendKeys(String value);

}
