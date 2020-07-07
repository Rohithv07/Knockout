
import java.util.ArrayList;
import java.util.List;
import java.io.*;  

public class TravelAgency {
    
    //write the required business logic methods as expected in the question description
	
	public List<Package> generatePackageCost(String filePath) {
		
		// Fill you code Here
		List<Package> packages = new ArrayList<>();
		try{
			File file = new File(filePath);
			FileReader fr = new FileReader(file);   //reads the file  
			BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream   
			String line;  
			while((line=br.readLine())!=null){  
				    Package p = generatePackageFromString(line);
				   	if(p == null){
					   continue;
					}
					packages.add(p);
			}  
			fr.close();
		}catch(IOException e){  
			e.printStackTrace();  
		} 
		return packages;
	}

	private Package generatePackageFromString(String line){
		String[] items = line.split(",");
		Package p = new Package();
		for(int i=0; i < items.length;i++){
			switch(i){
				case 0:
					try{
						String packageId = items[i];
						if(validate(packageId)){
							p.setPackageId(packageId);
						}
					}catch(InvalidPackageIdException e){
						e.printErrorMessage();
						return null;
					}
					break;
				case 1:
					p.setSourcePlace(items[i]);
					break;
				case 2:
					p.setDestinationPlace(items[i]);
					break;
				case 3:
					p.setBasicFare(Double.parseDouble(items[i]));
					break;
				case 4:
					p.setNoOfDays(Integer.parseInt(items[i]));
					break;
				default:
					continue;
			}
		}
		return p;
	}
	
	public boolean validate(String packageId) throws InvalidPackageIdException {
		
		// Fill you code Here
		boolean valid = true;
		if(packageId.length() != 7 || packageId.charAt(3) != '/'){
			valid = false;
			throw new InvalidPackageIdException();
		}
		return valid;
	}
	
	
	public List<Package> findPackagesWithMinimumNumberOfDays() {
		
		// Fill you code Here
	}
}
