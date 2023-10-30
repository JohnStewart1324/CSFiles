
public class Geek {
	
	String name, concatString = "";
	int numberOfQuestions = 0, sum;
	
	public Geek(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	
	public String multiConcat(String text, int count) {
		for (int i = 0; i < count; i++) {
			concatString += text;
		}
		numberOfQuestions++;
		return concatString;
	}
	
	boolean isEven(int num) {
		numberOfQuestions++;
		return num%2 == 0;
	}
	
	public int sumRange(int num1, int num2) {
		if (num1 == num2) {
			numberOfQuestions++;
			return 0;
		}
		for (int i = num1+1; i < num2; i++) {
			sum += i;
		}
		numberOfQuestions++;
		return sum;
	}
	
	public boolean isSorted(int num1, int num2, int num3) {
		numberOfQuestions++;
		return (num1 < num2 && num2 < num3);
	}
	
	public int countA(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				count++;
			}
		}
		numberOfQuestions++;
		return count;
	}
	
	public int countDigits(int num) {
		String numString = String.valueOf(num);
		numberOfQuestions++;
		return numString.length();
	}
	
	boolean isPrime(int num) {
		if (num == 1) {
			numberOfQuestions++;
			return false;
		} else if (num == 2) {
			numberOfQuestions++;
			return true;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0 && num != i) {
				numberOfQuestions++;
				return false;
			}
		}
		numberOfQuestions++;
		return true;
	}

}
