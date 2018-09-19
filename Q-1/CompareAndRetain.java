import java.util.*;

class Student implements Comparable {

	private int id;
	
	Student(int id) {

		this.id = id;

	}

	int getId() {

		return id;

	}

	void setId(int id) {
	
		this.id = id;

	}

	public int compareTo(Object o) {

		Student s = (Student) o;
		
		if (s.getId() == this.id)
			return 0;
		else if (s.getId() > this.id)
			return -1;
		else
			return 1;

	}

	public int hashCode() {

		return (this.id*10)+1;

	}

	public boolean equals(Object o) {

		if (o.getClass() != this.getClass() || o == null)
			return false;
		Student s = (Student)o;
		
		if (this == s)
			return true;
		else if (this.id == s.getId())
			return true;
		else
			return false;

	}

}

public class CompareAndRetain {


	public static void main(String[] args) {

		Set<Student> set1 = new TreeSet<Student>();
		Set<Student> set2 = new TreeSet<Student>();

		System.out.println("Populating set 1 with students with ids 1 to 10");

		for (int i=1;i<=10;i++)
			set1.add(new Student(i));

		System.out.println("Populating set 1 with students with ids 5 to 15");

		for (int i=5;i<=15;i++)
			set2.add(new Student(i));

		System.out.println("Comparing sets........");

		for (Student i: set1)
			for (Student j: set2)
				if (i.compareTo(j) > 0)
					System.out.println(i+" with id "+i.getId()+" in set one is greater than "+j+" with id "+j.getId()+" in set two");
				else if (i.compareTo(j) < 0)
					System.out.println(i+" with id "+i.getId()+" in set one is less than "+j+" with id "+j.getId()+" in set two");
				else
					System.out.println(i+" with id "+i.getId()+" in set one is equal to "+j+" with id "+j.getId()+" in set two");

		System.out.println();
		System.out.println("Retaining common elements in both the sets");

		set1.retainAll(set2);

		System.out.println("After retaining common elements...........");
		
		System.out.print("Set 1 : ");
		for (Student i: set1)
			System.out.print(i.getId()+" ");
		System.out.println();
	}

}	
