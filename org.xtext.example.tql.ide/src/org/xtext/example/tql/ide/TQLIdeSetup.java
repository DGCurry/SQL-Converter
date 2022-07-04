/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.tql.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.tql.TQLRuntimeModule;
import org.xtext.example.tql.TQLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TQLIdeSetup extends TQLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TQLRuntimeModule(), new TQLIdeModule()));
	}
	
}