package collections;

import java.util.Objects;

public class Student {
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	int id;

public Student(int id) {
	this.id=id;
	
	
	}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}