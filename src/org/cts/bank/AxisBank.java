package org.cts.bank;

public class AxisBank extends IcicBank
{
@Override
public void deposit() {
	System.out.println("5%");
}
public void fixed() {
	System.out.println("8%");
}
System.out.println("8%");
public static void main(String[] args) {
	AxisBank bank = new AxisBank();
	bank.saving();
	bank.deposit();
	bank.fixed();
}
}
