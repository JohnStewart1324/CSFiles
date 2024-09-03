
public abstract class Animal {
	
	String name, food, color;
	double speed;
	boolean veg;
	
	public Animal(String name, boolean veg, String food, String color) {
		this.name = name;
		this.veg = veg;
		this.food = food;
		this.color = color;
	}
	
	public Animal(String name, boolean veg, String food, String color, double speed) {
		this.name = name;
		this.veg = veg;
		this.food = food;
		this.color = color;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isVeg() {
		return veg;
	}
	
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getSpeed() {
		if (speed > 20) {
			return speed+3;
		}
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
