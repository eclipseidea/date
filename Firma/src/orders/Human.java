package orders;

public class Human {
	private String name;
	private int age;
	private Messenger messenger;
	private Job job;
	private Gold gold;
	private int money;

	public Human(String name, int age, int money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Messenger getMessenger() {
		return messenger;
	}

	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Gold getGold() {
		return gold;
	}

	public void setGold(Gold gold) {
		this.gold = gold;
	}

	public  String getName() {

		return name;
	}

	public void writeText(Object human) {

	}

	public void setLove(boolean b) {
		
	}

		

}
