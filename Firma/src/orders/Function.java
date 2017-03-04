package orders;

public class Function {
	private Woman woman;
	private Bank bank;
	private Man man;
	private Job job;
	private Gold gold;

	public Function(Woman woman, Bank bank, Man man, Job job, Gold gold) {
		this.woman = woman;
		this.bank = bank;
		this.man = man;
		this.job = job;
		this.gold = gold;
	}

	public void manSendText() {
		Messenger.manWriteText(man);
	}

	public void womanSendText() {
		Messenger.manWriteText(woman);
	}

	public void settJob() {
		// Job job = new Job("developer", 15000);
		man.setJob(job);
		man.setMoney(man.getMoney() + job.getPayment());
	}

	public void settGold() {
		// Gold gold = new Gold(7000);
		man.setGold(gold);
		man.setMoney(man.getMoney() - gold.getPrice());
	}

	public void womanSetGold() {
		woman.setGold(man.getGold());
		man.setGold(null);
	}

	public void getBankMoney() {
		int needsSum = 40000;
		if (man.getMoney() < needsSum) {
			bank.setMoney(bank.getMoney() - needsSum);
			man.setMoney(man.getMoney() + (needsSum / 2));
			woman.setMoney(woman.getMoney() + (needsSum / 2));
			woman.setLove(true);
		}
	}

	public void information() {
		System.out.println("Man's money: "+man.getMoney());
		System.out.println("Woman's money: "+woman.getMoney());
		System.out.println("Man now has gold: "+man.getGold());
		System.out.println("Woman has "+woman.getGold());
		System.out.println("Bank has money: "+bank.getMoney());
		System.out.println("Woman has love: "+woman.isLove());
	}
}
