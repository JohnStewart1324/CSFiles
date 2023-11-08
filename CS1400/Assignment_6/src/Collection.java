
public class Collection {
	
	int size;
	int count, numArray[], tempArray[]; 

	public Collection(int size) {
		this.size = size;
		this.numArray = new int[size];
	}
	
	public boolean add(int number) {
		
		int newArray[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			if (numArray[i] == number) {
				return false;
			} else if (count == size){
				doubleArray(numArray);
			} else {
				for (int j = 0; j < count; j++) {
					newArray[j+1] = numArray[j];
				}
				newArray[0] = number;
				numArray = newArray;
				return true;
			}
		}
		return false;
	}

	public boolean remove(int number) {
		int newArr[] = new int[size];
		
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == number) {
				for (int j = number; j < numArray.length - number; j++) {
					newArr[j] = numArray[j+1];
				}
				return true;
			}
		}
		return false;
		
		
	}
	
	public void doubleArray(int[] numArray) {
		int newArr[] = new int[size * 2];
		for (int i = 0; i < numArray.length; i++) {
			newArr[i] = numArray[i];
		}
		numArray = newArr;
	}
}
