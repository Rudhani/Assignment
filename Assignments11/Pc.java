package Assignments11;

class PC extends Laptop {
	@Override
	public void getSystemInfo() {
		System.out.println("System OS Is : MAC");
	}		

	public static void main(String[] args) {
		PC info = new PC();
		info.getSystemInfo();
	}
}
