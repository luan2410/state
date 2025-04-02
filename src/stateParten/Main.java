package stateParten;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Người dùng đưa tiền vào máy
        vendingMachine.insertMoney();

        // Người dùng yêu cầu sản phẩm
        vendingMachine.dispense();

        // Người dùng cố gắng đưa tiền khi máy hết hàng
        vendingMachine.insertMoney();
    }
}
