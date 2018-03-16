package lab18b;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable {
	private int myWeight;
	private int myHeight;
	private int myAge;

	// write a default Constructor
	public Monster() {
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}

	public Monster(int i) {
		// TODO Auto-generated constructor stub
		setWeight(i);
		setHeight(0);
		setAge(0);

	}

	public Monster(int i, int j) {
		// TODO Auto-generated constructor stub
		setWeight(i);
		setHeight(j);
		setAge(0);
	}

	public Monster(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		setWeight(i);
		setHeight(j);
		setAge(k);
	}

	// write an initialization constructor with an int parameter ht

	// write an initialization constructor with int parameters ht and wt

	// write an initialization constructor with int parameters ht, wt, and age

	// modifiers - write set methods for height, weight, and age
	public void setWeight(int i) {
		// TODO Auto-generated method stub
		myWeight = i;
	}

	void setHeight(int j) {
		myHeight = j;
	}

	public void setAge(int k) {
		myAge = k;
	}

	// accessors - write get methods for height, weight, and age
	public int getWeight() {
		// TODO Auto-generated method stub
		return myWeight;
	}

	public int getHeight() {
		return myHeight;
	}

	public int getAge() {
		return myAge;
	}

	// creates a new copy of this Object
	public Object clone() {
		return new Monster();
	}

	public boolean equals(Object obj) {
		if (this.getWeight() == ((Monster) obj).getWeight() && this.getHeight() == ((Monster) obj).getHeight()
				&& this.getAge() == ((Monster) obj).getAge()) {
			return true;
		}

		return false;
	}

	public int compareTo(Object obj) {
//		Monster rhs = (Monster) obj;
		if (  this.getWeight() >  ((Monster) obj).getWeight()  )
			return 1;
		else if (equals(obj))
			return 0;

		return -1;
	}

	// write a toString() method
	public String toString() {
//		return getWeight() + " " + getHeight() + " " + getAge()+"\n";
		return ""+myWeight +" "+ myHeight+" "+myAge;
	}

}