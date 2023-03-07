package ws0307;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        ArrayList<Account> accountList = new ArrayList<>();
        
        // 계좌 생성
        Account account1 = new Account("123-456-789", "홍길동", 100000);
        Account account2 = new Account("987-654-321", "김철수", 50000);
        
        // 계좌 정보 조회
        System.out.println("=== 계좌 정보 조회 ===");
        for (Account account : accountList) {
            System.out.println("계좌번호: " + account1.getAccountNumber());
            System.out.println("예금주명: " + account1.getAccountHolder());
            System.out.println("잔액: " + account1.getBalance() + "원");
            System.out.println("=====================");
        }
        
        // 계좌 입금
        System.out.println("=== 계좌 입금 ===");
        account1.deposit(50000);
        System.out.println("계좌번호: " + account1.getAccountNumber());
        System.out.println("예금주명: " + account1.getAccountHolder());
        System.out.println("잔액: " + account1.getBalance() + "원");
        System.out.println("=====================");
        
        // 계좌 출금
        System.out.println("=== 계좌 출금 ===");
        account2.withdraw(30000);
        System.out.println("계좌번호: " + account2.getAccountNumber());
        System.out.println("예금주명: " + account2.getAccountHolder());
        System.out.println("잔액: " + account2.getBalance() + "원");
        System.out.println("=====================");
    }
}