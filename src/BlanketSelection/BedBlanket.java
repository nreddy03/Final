package BlanketSelection;

public abstract class BedBlanket extends Blanket {
	String clothType;
	
	public void setBlanketType() {
		this.blanketType="Bed Blanket";
		
	}	
	public String getClothType() {
		return clothType;
	}
	public void setCLothType(String clothType) {
		this.clothType = clothType;
	}
		
	
}