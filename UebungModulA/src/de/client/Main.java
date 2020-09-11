package de.client;



import java.lang.reflect.Method;

import de.gothaer.b.InterfaceB;
import de.gothaer.c.InterfaceC;

public class Main {

	public static void main(String[] args) throws Exception{
		InterfaceB.getInstance().print();

		//InterfaceC.getInstance().print();
		
		Class<?> clazz = Class.forName("de.gothaer.b.impl.ServiceB");
		Object o = clazz.newInstance();
		Method m = clazz.getDeclaredMethod("printPrivate");
		m.setAccessible(true);
		m.invoke(o);
	}

}
