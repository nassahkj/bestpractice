package com.nassahkj;

//import java.util.Currency;

public class BankAccount {

        private final int NiN;//required
        private final String email;
       private final String firstName;//required
        private final String middleName;//optional
        private final String surname;//required
        private final String  StreetAddress;
        private final long postalCode;
        private final String country;//required
        private final String city;//required
        private final long mobileNumber;
        private final String mobileMoneyProvider;
        private final double balance;

    //define the getter methods to return the respective field values

    public int getNiN() {
        return NiN;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getMobileMoneyProvider() {
        return mobileMoneyProvider;
    }

    public double getBalance() {
        return balance;
    }
//define the constructor
        private BankAccount(BankBuilder builder){
            this.NiN = builder.NiN;
            this.balance = builder.balance;
            this.firstName = builder.firstName;
            this.surname = builder.surname;
            this.email = builder.email;
            this.middleName = builder.middleName;
            this.StreetAddress = builder.StreetAddress;
            this.country = builder.country;
            this.city = builder.city;
            this.mobileNumber = builder.mobileNumber;
            this.mobileMoneyProvider = builder.mobileMoneyProvider;
            this.postalCode = builder.postalCode;
        }
    @Override
    public String toString() {
        return "BankAccount: {" + this.NiN +"," +
                    this.email + ","+
                    this.firstName + "," +
                    this.middleName + "," +
                    this.surname + "," +
                    this.StreetAddress + "," +
                    this.postalCode + "," +
                    this.country + "," +
                    this.city + "," +
                    this.mobileNumber + "," +
                    this.mobileMoneyProvider + "," +
                    this.balance +
                    "}";
        }
    public static class BankBuilder{
            private final int NiN;
            private final String email;
            private final String firstName;
            private String middleName;
            private final String surname;
            private String  StreetAddress;
            private long postalCode;
            private String country;
            private String city;
            private long mobileNumber;
            private  String mobileMoneyProvider;
            private double balance;

            // Call the respective constructors to initialize object variables
            public BankBuilder(int NiN,String email, String firstName, String surname){
                this.firstName = firstName;
                this.NiN = NiN;
                //this.middleName = middleName;
                this.surname = surname;
                this.email = email;
            }
            public  BankBuilder setMiddleName( String middleName){
                this.middleName = middleName;
                return  this;
            }
            public BankBuilder balance (double balance){
                this.balance = balance;
                return this;
            }
            public BankBuilder mobileMoneyProvider (String mobileMoneyProvider){
                this.mobileMoneyProvider = mobileMoneyProvider;
                return this;
            }
            public BankBuilder mobileNumber (long mobileNumber){
                this.mobileNumber = mobileNumber;
                return this;
            }
            public BankBuilder city (String city){
                this.city = city;
                return this;
            }
            public BankBuilder County (String county){
                this.country = country;
                return this;
            }
            public BankBuilder postalCode (long postalCode){
                this.postalCode = postalCode;
                return this;
            }
            public BankBuilder StreetAddress (String StreetAddress){
                this.StreetAddress = StreetAddress;
                return this;
            }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount(this);
            return bankAccount;
        }

        }



}
