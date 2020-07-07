
public class Package {
	private String packageId;
	private String sourcePlace;
	private String destinationPlace;
	private double basicFare;
	private int noOfDays;
	private double packageCost;
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getSourcePlace() {
		return sourcePlace;
	}
	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}
	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}
	public double getBasicFare() {
		return basicFare;
	}
	public void setBasicFare(double basicFare) {
		this.basicFare = basicFare;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
//write the required business logic methods as expected in the question description
	public void calculatePackageCost() {
		//fill your code here
		double discount;
		packageCost = basicFare * noOfDays;
		if(noOfDays <= 5) {
		    discount = packageCost;
		}
		else if(noOfDays > 5 && noOfDays <= 8) {
		    discount = packageCost * (3 / 100);
		}
		else if(noOfDays > 8 && noOfDays <=10) {
		    discount = packageCost * (5 / 100);
		}
		else{
		    discount = packageCost * (7 / 100);
		}
		
		double gst = (packageCost - discount) * 0.12;
		packageCost = packageCost - discount + gst;
		    
		
		
	}
	
	
}

