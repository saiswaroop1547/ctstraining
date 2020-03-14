package springexamples;

import java.util.Iterator;
import java.util.List;

public class QuestionBank 
{
	int qno;
	String question;
	List<String> answers;
	public QuestionBank(int qno, String question, List<String> answers) {
		super();
		this.qno = qno;
		this.question = question;
		this.answers = answers;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void showAnswers()
	{
		System.out.println("Qid number: "+qno+"Question is: "+question);
		Iterator itr=answers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
}
