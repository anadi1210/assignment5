package org.meritamerica.assignments;

/**
 * This class provides methods for working with an array that expands to include
 * any positive index value supplied by the caller.
 */
public class ExpandableArray {
	/**
	 * Creates a new expandable array with no elements.
	 */
	Object[] expArray;
	public ExpandableArray() {
		expArray = new Object[0];
	}

	/**
	 * Sets the element at the given index position to the specified. value. If the
	 * internal array is not large enough to contain that element, the
	 * implementation expands the array to make room.
	 */
	public void set(int index, Object value) {

		
		if(index >= expArray.length) {
			Object[] temp = new Object[index + 1];
			for(int i = 0; i < expArray.length; i++)
				temp[i] = expArray[i];

			temp[temp.length - 1] = value;
			expArray = temp;
		}
		else {
			expArray[index] = value;
		}
	}

	/**
	 * Returns the element at the specified index position, or null if no such
	 * element exists. Note that this method never throws an out-of-bounds
	 * exception; if the index is outside the bounds of the array, the return value
	 * is simply null.
	 */
	public Object get(int index) {
		if(index >= expArray.length)
			return null;
		return expArray[index];
	}
	
	public int getSize() {
		return expArray.length;
	}
}