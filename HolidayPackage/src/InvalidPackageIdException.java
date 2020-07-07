//make the required changes to this class so that InvalidPackageIdException is of type exception.
public class InvalidPackageIdException extends Exception{
    String packageId = "";
    InvalidPackageIdException(String packageId){
        this.packageId = packageId;
    }
    InvalidPackageIdException(){}
//fill your code here
    public void printErrorMessage(){
        System.out.println("Invalid Package Id".concat(packageId));
    }
	
}
	