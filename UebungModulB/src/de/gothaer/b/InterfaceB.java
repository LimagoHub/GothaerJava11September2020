package de.gothaer.b;

import java.util.ServiceLoader;

public interface InterfaceB {
	
	void print();
	static InterfaceB getInstance() {
		return ServiceLoader.load(InterfaceB.class).findFirst().get();
	}

}
