package Singleton;

public class SingletonEagerlyInit {
	private static SingletonEagerlyInit uniqueInstance = new SingletonEagerlyInit();
	// Other useful instance variables here

	private SingletonEagerlyInit() {
	}

	// To avoid overhead of synchronization which is very expensive (it can decrease
	// the performance by factor of 100), we use eagerly initialization.
	// Here, we rely on the JVM to create the unique instance of the Singleton when
	// the class is loaded. The JVM guarantees that the instance will be created
	// before any thread accesses the static uniqueInstance variable.
	public static SingletonEagerlyInit getInstance() {
		return uniqueInstance;
	}
	// Other useful methods here
}
