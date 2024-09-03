

public Name setName(String firstName, String lastName) {
	setFirst(firstName);
	setLast(lastName);
	
	return this;
}

public static void main(String[] args) {
	Name jill = new Name();
	Name myFriend = jill.setName("Jill", "Greene");
}