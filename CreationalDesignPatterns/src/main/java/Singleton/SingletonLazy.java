package Singleton;
//A class of which only a single instance can exist. Ensure that it creates only one instance of the object.
//Make the constructor private so that this class cannot be instantiated
public class SingletonLazy {
		private static SingletonLazy sz;
		
		private SingletonLazy( ) {}
		
		public static SingletonLazy getConnection() {
			if (sz == null) {
				synchronized (SingletonLazy.class) {
					if(sz == null)
						//Lazy loading
						sz = new SingletonLazy();
				}
			}
			return sz;
		}
		
		
}
