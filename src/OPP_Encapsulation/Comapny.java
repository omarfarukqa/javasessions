package OPP_Encapsulation;

public class Comapny {

	private String name;
	private int sharePrice;
	private String HQ;

	public Comapny(String name, int sharePrice, String hQ) {
		this.name = name;
		this.sharePrice = sharePrice;
		this.HQ = hQ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getHQ() {
		return HQ;
	}

	public void setHQ(String hQ) {
		HQ = hQ;

	}

}
