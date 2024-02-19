package conta.model;

public class Conta {
  private int number, agency, type;
  private float  balance;
  private String  accountHolderName;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getAgency() {
	return agency;
}
public void setAgency(int agency) {
	this.agency = agency;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
  
}
