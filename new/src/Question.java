import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answer,User> answers;
	public Question() {
		
	}
	public Question(int id,String name,Map<Answer,User> answers) {
		super();
		this.id=id;
		this.name=name;
		this.answers=answers;
		}
	public void displayInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println("answers...");
		Set<Entry<Answer,User>> set=answers.entrySet();
		Iterator<Entry<Answer,User>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<Answer,User> entry=itr.next();
			Answer ans=entry.getKey();
			User user=entry.getValue();
			System.out.println("Answer Info....");
			System.out.println(ans);
			System.out.println("Posted By");
			System.out.println(user);
		}
	}

}
