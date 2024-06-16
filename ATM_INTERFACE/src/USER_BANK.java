public class USER_BANK {
     public double balance;
     USER_BANK(double intialBalance){
         this.balance=intialBalance;
     }

     public void checkBalance(){

          System.out.println(balance);
     }
     public void deposit(double d_amount){
          if(d_amount>0){
               System.out.println("Your deposited amount is: " + d_amount);
               balance += d_amount;
          }else{
               System.out.println("Invalid deposit amount");
          }

     }
     public void withdraw(double w_amount){
          if(w_amount>0 && balance>=w_amount) {
               System.out.println("You have withdrawn Rupees : " + w_amount);
               balance -= w_amount;
          }else{
               System.out.println("Invalid or insufficient funds for withdrawal.");
          }

     }
}
