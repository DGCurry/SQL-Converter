/*
 * generated by Xtext 2.27.0
 */
package nl.tue.gtl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import nl.tue.gtl.TQLRuntimeModule;
import nl.tue.gtl.TQLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TQLIdeSetup extends TQLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TQLRuntimeModule(), new TQLIdeModule()));
	}
	
}
