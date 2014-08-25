// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd.introspector;

import jodd.Jodd;

public class JoddIntrospector {

	static {
		init();
	}

	public static void init() {
		Jodd.init(JoddIntrospector.class);
	}

	/**
	 * Default {@link Introspector} implementation.
	 */
	public static Introspector introspector = new CachingIntrospector();

}