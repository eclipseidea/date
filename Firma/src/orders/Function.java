package orders;

public class Function {
	Human man = new Man("roman", 37, 500);
	Human woman = new Woman("tanya", 36, 0);
	Bank bank = new Bank();

	public void manSendText() {
		Messenger messenger = new Messenger();
		messenger.manWriteText(man);
	}

	public void womanSendText() {
		Messenger messenger = new Messenger();
		messenger.manWriteText(woman);
	}

	public void settJob() {
		Job job = new Job("developer", 15000);
		man.setJob(job);
		man.setMoney(man.getMoney() + job.getPayment());
	}

	public void settGold() {
		Gold gold = new Gold(7000);
		man.setGold(gold);
		man.setMoney(man.getMoney() - gold.getPrice());
	}

	public void womanSetGold() {
		woman.setGold(man.getGold());
		man.setGold(null);
	}

	public void getBankMoney() {
		int nedsSum = 40000;
		if (man.getMoney() < nedsSum) {
			bank.setMoney(bank.getMoney() - nedsSum);
			man.setMoney(man.getMoney() + (nedsSum / 2));
			woman.setMoney(woman.getMoney() + (nedsSum / 2));
			woman.setLove(true);
		}
	}

	public void information() {
		System.out.println(man.getMoney());
		System.out.println(woman.getMoney());
		System.out.println(man.getGold());
		System.out.println(woman.getGold().toString());
		System.out.println(bank.getMoney());
		System.out.println(((Woman) woman).isLove());
	}
}
