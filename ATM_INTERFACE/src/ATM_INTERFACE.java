public class ATM_INTERFACE {
    public static void main(String[] args) {
        USER_BANK obj1=new USER_BANK(1000);// initial balance
        ATM obj2=new ATM(obj1);
        obj2.start();
    }
}