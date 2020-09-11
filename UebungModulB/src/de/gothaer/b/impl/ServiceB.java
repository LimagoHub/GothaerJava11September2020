package de.gothaer.b.impl;

import java.util.ServiceLoader;

import de.gothaer.b.InterfaceB;
import de.gothaer.c.InterfaceC;

public class ServiceB implements InterfaceB {

	@Override
	public void print() {
		System.out.println("B" );
		ServiceLoader<InterfaceC> loader = ServiceLoader.load(InterfaceC.class);
		InterfaceC ic1 = loader.findFirst().get();
		
		loader = ServiceLoader.load(InterfaceC.class);
		InterfaceC ic2 = loader.findFirst().get();
		
		
		System.out.println(ic1 == ic2);
		
	}

	private void printPrivate() {
		System.out.println("B Privat");
	}
	
	

}
