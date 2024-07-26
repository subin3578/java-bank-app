package JavaBankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	public static Scanner sc =new Scanner(System.in);
	public static List<Account> accounts  = new ArrayList<>();	
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 2.계좌조회 3.입금 4.출금 5.종료");
			System.out.println("----------------------------------------");
			
			int N = sc.nextInt();
			
			if(N==1) {
				createAccount();
			}else if(N==2) {
				accountList();
			}else if(N==3) {
				deposit();
			}else if(N==4){
				withdraw();
			}else if(N==5) {
				System.out.println("종료합니다");
			break;
			}
		}
	}
	
	public static void createAccount(){
		
		System.out.println("------------");
		System.out.println(" 계좌생성");
		System.out.println("------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("계좌주 : ");
		String owner = sc.next();
		System.out.println("초기 입금액");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano,owner,balance);
		accounts.add(newAccount);
		System.out.println("결과 : 계좌가 생성되었습니다");
		
			
	}
	
	public static void accountList(){
		
		System.out.println("------------");
		System.out.println("계좌 목록");
		System.out.println("------------");
		
		for(Account account : accounts) {
			System.out.println(accounts.toString());}
		}
		
	

	public static void withdraw(){
		
		System.out.println("------------");
		System.out.println(" 출금");
		System.out.println("------------");
		
		System.out.println("계좌입력");
		String ano = sc.next();
		System.out.println("출금금액");
		int withdraw = sc.nextInt();
		
		
		Account account = findAccount(ano);
		if(account == null) { 
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance()-withdraw);
		System.out.println(withdraw+"원 출금 완료");
	}
	
	public static void deposit(){
		
		System.out.println("------------");
		System.out.println(" 입금");
		System.out.println("------------");
		
		System.out.println("계좌입력");
		String ano = sc.next();
		System.out.println("입금금액");
		int deposit = sc.nextInt();
		
		
		Account account = findAccount(ano);
		if(account == null) { 
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance()+deposit);
		System.out.println(deposit+"원 입금 완료");
		
		
		
		}
		public static Account findAccount(String ano){
			for(Account account : accounts) {
				if(account.getano().equals(ano)) {
					return account;
				}
			}
			return null;
	}
}

