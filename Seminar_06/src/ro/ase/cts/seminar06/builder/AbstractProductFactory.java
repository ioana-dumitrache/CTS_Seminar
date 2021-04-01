package ro.ase.cts.seminar06.builder;

public abstract class AbstractProductFactory {
		public abstract Product makeProduct(int id) throws UnsupportedOperationException;
		public abstract String getCatalog();
		
		
		
		
}
