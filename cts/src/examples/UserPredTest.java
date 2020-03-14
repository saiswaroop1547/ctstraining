package examples;
import java.util.function.Function;
import java.util.function.Predicate;
class User
{
	String uid,pwd;
	public User(String uid,String pwd)
	{
		super();
		this.uid=uid;
		this.pwd=pwd;
	}
}
public class UserPredTest {
	public static void main(String[] args) {

		User user1=new User("admin","1234");
		User user2=new User("Sam","Sam143");
		Predicate<User> p1=
				u-> u.uid.equals("admin")&&u.pwd.equals("1234");
				if(p1.test(user1))
					System.out.println("valid user");
				else
					System.out.println("not a valid user");
		
				Function<User,String> u1=i->{
					if(i.uid.equals("admin")&&i.pwd.equals("1234"))
						return "valid user";
					else
						return"invalid user";
				};
				System.out.println(u1.apply(user1));
	}
	}
