package org.bank;

public class AxisBank extends BankInfo {
	
	public void saving() {
		System.out.println("saving is 5%");
	}
	public void fixed() {
		System.out.println("fixed is 2%");
	}
		public static void main(String[] args) {
			AxisBank a = new AxisBank();
			a.fixed();
			a.saving();
			a.deposit();
			System.out.println("add the code to branch A ");
			
		}
		}
