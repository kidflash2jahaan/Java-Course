package com.systemerr.javacourse.classeschallenge;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1234567890, 0, "Account", "account@gmail.com", 1234567890);
        
        System.out.println("$" + account.getBalance());
        account.deposit(50);
        System.out.println("+$50");
        System.out.println("$" + account.getBalance());
        account.withdraw(49);
        System.out.println("-$49");
        System.out.println("$" + account.getBalance());
        account.withdraw(2);
        System.out.println("-$2");
        System.out.println("$" + account.getBalance());
        account.withdraw(1);
        System.out.println("-$1");
        System.out.println("$" + account.getBalance());
    }
}
