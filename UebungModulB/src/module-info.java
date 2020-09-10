module modulB {
	requires transitive modulC;
	exports de.gothaer.b;
	opens de.gothaer.b.impl;
}