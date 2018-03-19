package lab18b;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable {
	private int myHeight;
	private int myWeight;
	private int myAge;

	// write a default Constructor
	public Monster() {
		myHeight = 0;
		myWeight = 0;
		myAge = 0;
	}

	public Monster(int i) {
		// TODO Auto-generated constructor stub
		setHeight(i);
		setWeight(0);
		setAge(0);

	}

	public Monster(int i, int j) {
		// TODO Auto-generated constructor stub
		setHeight(i);
		setWeight(j);
		setAge(0);
	}

	public Monster(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		setHeight(i);
		setWeight(j);
		setAge(k);
	}

	// write an initialization constructor with an int parameter ht

	// write an initialization constructor with int parameters ht and wt

	// write an initialization constructor with int parameters ht, wt, and age

	// modifiers - write set methods for height, weight, and age
	public void setHeight(int i) {
		// TODO Auto-generated method stub
		myHeight = i;
	}

	void setWeight(int j) {
		myWeight = j;
	}

	public void setAge(int k) {
		myAge = k;
	}

	// accessors - write get methods for height, weight, and age
	public int getHeight() {
		// TODO Auto-generated method stub
		return myHeight;
	}

	public int getWeight() {
		return myWeight;
	}

	public int getAge() {
		return myAge;
	}

	// creates a new copy of this Object
	public Object clone() {
		return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals(Object obj) {
		if (this.getHeight() == ((Monster) obj).getHeight() && this.getWeight() == ((Monster) obj).getWeight()
				&& this.getAge() == ((Monster) obj).getAge()) {
			return true;
		}

		return false;
	}

	public int compareTo(Object obj) {
//		Monster rhs = (Monster) obj;
		if (  this.getHeight() >  ((Monster) obj).getHeight()  )
			return 1;
		else if (this.getHeight()<((Monster) obj).getHeight())
			return -1;
		else if(this.getHeight()==((Monster)obj).getHeight()){		//if heights are equal check weight
			if(this.getWeight()>((Monster)obj).getHeight())
				return 1;
			else if(this.getWeight()<((Monster)obj).getHeight())
				return -1;
			else{													//if heights and weights are equal check age
				if(this.getAge()>((Monster)obj).getAge())
					return 1;
				else if(this.getAge()<((Monster)obj).getAge())
					return -1;
				else
					return 0;
			}
		}
			
		return -1;
	}

	// write a toString() method
	public String toString() {
//		return getWeight() + " " + getHeight() + " " + getAge()+"\n";
		return ""+myHeight +" "+ myWeight+" "+myAge;
	}

}