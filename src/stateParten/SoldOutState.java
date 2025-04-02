package stateParten;

public class SoldOutState implements State {
    @Override
    public void insertMoney() {
        System.out.println("Hết hàng. Không thể nhận tiền.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Bạn chưa đưa tiền vào.");
    }

    @Override
    public void dispense() {
        System.out.println("Hết hàng. Không thể xuất sản phẩm.");
    }
}
