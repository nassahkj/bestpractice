package com.nassahkj;

public class Main {

    public static void main(String[] args) {
        BankAccount bankUser1 = new BankAccount.BankBuilder(123,"nassahkj@gmail.com","Hassan","Kijjambu")
                .build();

        BankAccount bankUser2 = new BankAccount.BankBuilder(1234,"nas@gmail.com","hu","ha").balance(205000).build();

        System.out.println(bankUser1);
        System.out.println(bankUser2);
        BankAccount bankUser3 = new BankAccount.BankBuilder(001,"senjack@gmail.com","Ssenengo","Jackson")
                .city("Kawempe").County("Uganda").mobileMoneyProvider("MTN").build();
        System.out.println(bankUser3);
        BankAccount bankUser4 = new BankAccount.BankBuilder(01,"as@hn","Isaac","Okwe").County("Uganda").mobileMoneyProvider("Airtel")
                .mobileNumber(785789064).build();
        System.out.println(bankUser4);





    }
}
