package stateParten;

public class NoMoneyState implements State {

	@Override
	public void insertMoney() {
		System.out.println("ban chua dua tien vao");
		
	}

	@Override
	public void ejectMoney() {
		System.out.println("ban chua dua tien vao");
		
	}

	@Override
	public void dispense() {
		System.out.println("ban can dua tien truoc");
		
	}
	

}
