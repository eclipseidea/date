package orders;

public class Main {

	public static void main(String[] args) {
		Function function = new Function(
				new Woman("tanya", 32, 0), 
				new Bank(999999999), 
				new Man("roman", 36, 500), 
				new Job("dev", 12000),
				new Gold(5000));
		function.manSendText();
		function.womanSendText();
		function.settJob();
		function.settGold();
		function.womanSetGold();
		function.getBankMoney();
		function.information();
	}

}
