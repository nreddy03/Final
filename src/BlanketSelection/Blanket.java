package BlanketSelection;
public abstract class Blanket {
	
	String blanketName;
	String blanketType;
	double price;
	
	
	
	public String getBlanketName() {
		return blanketName;
	}
	public void setBlanketName(String blanketName) {
		this.blanketName = blanketName;
	}
	public String getBlanketType() {
		return blanketType;
	}
	public void setBlanketType(String blanketType) {
		this.blanketType = blanketType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

 

}
