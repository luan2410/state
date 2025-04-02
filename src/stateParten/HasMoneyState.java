package stateParten;
public class HasMoneyState implements State {
    @Override
    public void insertMoney() {
        System.out.println("Bạn đã đưa tiền vào rồi.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Tiền đã được trả lại.");
    }

    @Override
    public void dispense() {
        System.out.println("Sản phẩm đang được xuất...");
    }
}