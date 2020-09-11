import de.gothaer.c.InterfaceC;
import de.gothaer.c.impl.AlternativServiceC;
import de.gothaer.c.impl.ServiceC;

module modulC {
	exports de.gothaer.c;
	provides InterfaceC with AlternativServiceC;
}