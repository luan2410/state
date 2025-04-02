package stateParten;

public class VendingMachine {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldOutState;

    private State currentState;

    public VendingMachine() {
        noMoneyState = new NoMoneyState();
        hasMoneyState = new HasMoneyState();
        soldOutState = new SoldOutState();

        // Ban đầu máy không có tiền
        currentState = noMoneyState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void insertMoney() {
        currentState.insertMoney();
        setState(hasMoneyState);  // Chuyển sang trạng thái "Có tiền"
    }

    public void ejectMoney() {
        currentState.ejectMoney();
        setState(noMoneyState);  // Trả lại tiền -> quay về trạng thái "Không có tiền"
    }

    public void dispense() {
        currentState.dispense();
        setState(soldOutState);  // Nếu hết hàng thì chuyển sang "Hết hàng"
    }
}
