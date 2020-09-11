import de.gothaer.b.InterfaceB;
import de.gothaer.b.impl.ServiceB;
import de.gothaer.c.InterfaceC;

module modulB {
	requires transitive modulC;
	exports de.gothaer.b;
	opens de.gothaer.b.impl;
	
	uses InterfaceC;
	uses InterfaceB;
	
	provides InterfaceB with ServiceB;
	
}