package de.gothaer.c;

import de.gothaer.c.impl.ServiceC;

public interface InterfaceC {
	
	void print();
	
	static InterfaceC getInstance() {
		return new ServiceC();
	}

}
