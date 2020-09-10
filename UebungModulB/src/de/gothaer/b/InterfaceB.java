package de.gothaer.b;

import de.gothaer.b.impl.ServiceB;

public interface InterfaceB {
	
	void print();
	static InterfaceB getInstance() {
		return new ServiceB();
	}

}
