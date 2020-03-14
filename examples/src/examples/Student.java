package examples;

public class Student implements Comparable<Student>
{
String name;
int age;
String city;
public Student(String name, int age, String city) {
	super();
	this.name = name;
	this.age = age;
	this.city = city;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getCity() {
	return city;
}

public void setName(String name) {
	this.name = name;
}

public void setAge(int age) {
	this.age = age;
}

public void setCity(String city) {
	this.city = city;
}




@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
}

@Override
public int compareTo(Student student) {
    int compareage=((Student)student).getAge();

    return this.age-compareage;
  
}
	
}
