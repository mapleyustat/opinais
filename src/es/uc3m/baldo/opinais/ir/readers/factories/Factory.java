package es.uc3m.baldo.opinais.ir.readers.factories;

/**
 * Factory.
 * <p>All factories must implement this interface.</p>
 * 
 * @T type of object to be generated by the factory.
 * @E type of input inserted into the factory to generate the new object.
 * 
 * @author Alejandro Baldominos
 */
public interface Factory<T,E> {
	
	/**
	 * Generates an instance of an item given a certain object.
	 * @param item the input item, which will serve to make the new object.
	 * @return a text item.
	 */
	public T make (E item);

}
