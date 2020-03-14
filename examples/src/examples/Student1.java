package examples;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
class Student1 implements Comparable<Student1>
{
String name;
String age;
String city;
public Student1(String name, String age, String city) {
super();
this.name = name;
this.age = age;
this.city = city;
}
@Override
public String toString() {
return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
}
@Override
public int compareTo(Student1 student) {
// TODO Auto-generated method stub
if(age.compareTo(student.age)<0)
return 1;
else if(age.compareTo(student.age)>0)
return -1;
else
return 0;
}

}