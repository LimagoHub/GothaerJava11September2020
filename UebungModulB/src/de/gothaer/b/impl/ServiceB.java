package de.gothaer.b.impl;

import de.gothaer.b.InterfaceB;
import de.gothaer.c.InterfaceC;

public class ServiceB implements InterfaceB {

	@Override
	public void print() {
		System.out.println("B" );
		InterfaceC.getInstance().print();
		
	}

	private void printPrivate() {
		System.out.println("B Privat");
	}
	
	

}
