package ws0307;

public class Account {
    private String accNo;      // 계좌번호
    private String name;       // 예금주명
    private double balance;    // 잔액
	private String accountNumber;
	private String accountHolder;
    
    public Account(String accNo, String name, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("잔액은 음수일 수 없습니다.");
        }
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    
    public String getAccNo() {
        return accNo;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // 입금 메소드
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("입금액은 음수일 수 없습니다.");
        }
        balance += amount;
    }
    
    // 출금 메소드
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("출금액은 음수일 수 없습니다.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        balance -= amount;
    }
    
    // 계좌 정보 조회
    public void displayInfo() {
        System.out.println("계좌번호: " + accNo);
        System.out.println("예금주명: " + name);
        System.out.println("잔액: " + balance);
    }

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	 public Account(String accountNumber, String accountHolder, int balance) {
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
    
   
	
}