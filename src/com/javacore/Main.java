package com.javacore;


public class Main {

    public static void main(String[] args) {
	// write your code here

      Bank bank = new Bank("Bank of America");

     if (bank.addBranch("Wells Fargo")){
        System.out.println("Wells Fargo branch has already been created");
      }

      bank.addCustomer("Wells Fargo","Joshua", 50.05);
      bank.addCustomer("Wells Fargo", "Christopher", 125.08);
      bank.addCustomer("Wells Fargo", "Thomas" , 229.08);

      bank.addBranch("Citi");
      bank.addCustomer("Citi", "Bob", 150.53);

      bank.addCustomerTransaction("Wells Fargo", "Thomas", 44.22);
      bank.addCustomerTransaction("Wells Fargo", "Joshua", 12.44);
      bank.addCustomerTransaction("Wells Fargo", "Christopher", 1.65);

      bank.listCustomers("Wells Fargo", true);
      bank.listCustomers("Citi", true);

      bank.addBranch("Melbourne");

      if (!bank.addCustomer("Melbourne", "Brian", 5.53)){
        System.out.println("Error Melbourne does not exist");
      }

      if (!bank.addBranch("Wells Fargo")){
        System.out.println("Wells Fargo branch already exists");
      }

      if (!bank.addCustomerTransaction("Wells Fargo", "Henry", 50.01)){
        System.out.println("Customer does not exist at branch");
      }

      if (!bank.addCustomer("Wells fargo", "Joshua", 10.08)){
        System.out.println("Customer Joshua already exists");
      }
    }
}
