

public class Animals {
	
	private String CatName;
	private String DogName;
	 
	public String CatName(String x){
		return (x);
	}
	public String DogName(String y, String z){
		return (y + z);
	}
 public static void main(String[] args){

	 Animals pur = new Animals();
	 Animals ruff = new Animals();
	 
	 System.out.println("This dog name is: \n" + ruff.DogName("dallas\n", "eddie"));
	 System.out.println("Here is my cat : \n" + pur.CatName("cat"));
	 
		 
	 }
	 
}
