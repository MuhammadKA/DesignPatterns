package Singleton;

public class SingletonLazyInit {
	private static SingletonLazyInit uniqueInstance;
	// Other useful instance variables here

	private SingletonLazyInit() {
	}

	// No two threads can enter this method at the same time
	// Note: The only time synchronization is relevant is the first time through
	// this method. Once we have set the uniqueInstance variable to an instance of
	// Singleton, we have no further need to synchronize this method.
	// After the first time through, synchronization is totally unneeded overhead.
	public static synchronized SingletonLazyInit getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonLazyInit();
		}
		return uniqueInstance;
	}
	// Other useful methods here
}
