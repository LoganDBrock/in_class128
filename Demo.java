import java.util.Scanner;
public class Demo{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Please answer \"freshwater\" or \"saltwater\": ");
		
		String ans = "";
		ans = kb.nextLine();
		fish fishy;
		
		if (ans.equals("freshwater")){
			fishy = new freshWaterFish();
			fishy.getFish(ans);
		}
		else{
			fishy = new saltWaterFish();
			fishy.getFish(ans);
		}

		System.out.println("Here are some fish from the category you chose: ");
		fishy.mostCommonFish();
		System.out.println();
		System.out.println("Here is some info if you are thinking of keeping some of these fish as pets: ");
		fishy.aquariumInfo();
		
	}
}
