package Assignment1;

public class Mobile {
	public void message() {
		System.out.println("Send message");
	}
	public void document() {
		System.out.println("Share document");
	}
	public void call() {
		System.out.println("Call");
	}
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		phone.message();
		phone.document();
		phone.call();
	}
}