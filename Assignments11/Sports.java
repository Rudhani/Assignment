package Assignments11;

public class Sports {
	
	public void acheiver(String name, int medalCount) {
		System.out.println();
	}
	
	public void acheiver(double d, int i, int rank) {
		System.out.println();
	}
	
	public void acheiver(float weight, int height, long contactNO) {
		System.out.println();
	}
	
	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Sports sp=new Sports();
		
		sp.acheiver("Anirudh", 5);
		sp.acheiver("India", 1);
		sp.acheiver(82.5, 5, 952450539);
		sp.acheiver("National level tournament", 5000000);
	}
}
