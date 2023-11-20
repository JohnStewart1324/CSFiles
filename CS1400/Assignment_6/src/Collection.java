
public class Collection {
	
	int size;
	int count, numArray[], tempArray[]; 

	public Collection(int size) {
		this.size = size;
		this.numArray = new int[size];
	}
	
	public boolean add(int number) {
		
		int newArray[] = new int[size*2];
		
		if (search(number) != -1) {
			return false;
		}
		if (count == size){
			doubleArray();
			System.out.println("length: " + numArray.length);
			for (int j = 0; j < count; j++) {
				newArray[j+1] = numArray[j];
			}
			newArray[0] = number;
			numArray = newArray;
			count++;
			return true;
		} else {
			for (int j = 0; j < count; j++) {
				newArray[j+1] = numArray[j];
			}
			newArray[0] = number;
			numArray = newArray;
			count++;
			return true;
		}
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
	
	public void doubleArray() {
		size *= 2;
		int newArr[] = new int[size];
		for (int i = 0; i < numArray.length; i++) {
			newArr[i] = numArray[i];
		}
		numArray = newArr;
	}
	
	public int search(int searchingNum) {
		for (int i = 0; i < size; i++) {
			if (numArray[i] == searchingNum) {
				return i;
			}
		}
		return -1;
	}
	
	public int findLargest() {
		int largest = numArray[0];
		for (int i = 1; i < numArray.length-1; i++) {
			if (numArray[i] > largest) {
				largest = numArray[i];
			}
		}
		return largest;
	}
	
	public int countPositives() {
		int numPositives = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > 0) {
				numPositives++;
			}
		}
		return numPositives;
	}
	
	public double computeAverage() {
		double average = 0;
		double length = numArray.length;
		for (int i = 0; i < length; i++) {
			average += numArray[i];
		}
		return average/numArray.length;
	}
}
