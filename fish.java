public abstract class fish{

	public abstract void mostCommonFish();
	public abstract void aquariumInfo();

	public void getFish(String fishType){
		if (fishType.equals("saltwater")){
			System.out.println("You've chosen Saltwater Fish!!");
		}
		else{
			System.out.println("You've chosen Freshwater Fish!!");
		}
	}
}
