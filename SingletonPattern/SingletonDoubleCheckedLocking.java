package Singleton;

public class SingletonDoubleCheckedLocking {
	// The volatile keyword ensures that multiple threads handle the uniqueInstance
	// variable correctly when it is being initialized to the Singleton instance
	private volatile static SingletonDoubleCheckedLocking uniqueInstance;
	// Other useful instance variables here

	private SingletonDoubleCheckedLocking() {
	}

	// We first check to see if an instance is created, and if not, THEN we
	// synchronize.
	// This way, we only synchronize the first time through, just what we what.
	public static SingletonDoubleCheckedLocking getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonDoubleCheckedLocking.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDoubleCheckedLocking();
				}
			}
		}
		return uniqueInstance;
	}
	// Other useful methods here
}
