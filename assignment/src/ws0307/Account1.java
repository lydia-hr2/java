package ws0307;

public class Account1 {
    private String accountNumber;   // 계좌번호
    private String accountHolder;   // 예금주명
    private int balance;            // 잔액
    
    public Account1(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public int getBalance() {
        return balance;
    }
    
    // 입금 메소드
    public void deposit(int amount) {
        balance += amount;
    }
    
    // 출금 메소드
    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }
}