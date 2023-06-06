package cgg.interns.hibernate.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//creating question object
	Question q1=new Question();
	
	q1.setQuestion("what is java");
	q1.setQuestionId(1212);
	
	//creating answer id
	
		Answer a1=new Answer();
		
		a1.setAnswer("java is a programming language");
		a1.setAnswerId(34);
		a1.setQuestion1(q1);
		
		q1.setAnswer(a1);
	
		
		//second question and answer
		
		//creating question object
		Question q2=new Question();
		
		q2.setQuestion("What is collection Framework");
		q2.setQuestionId(242);
		
		//creating answer id
		
			Answer a2=new Answer();
			
			a2.setAnswer("API to work group of object");
			a2.setAnswerId(344);
			a2.setQuestion1(q2);
			
			q2.setAnswer(a2);
			
			
			
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(q1);
	session.save(q2);
	
	session.save(a1);
	session.save(a2);
	
	tx.commit();
	
	
	//fetching objects
	
	Question q=(Question)session.get(Question.class,1212);
	System.out.println(q.getQuestion());
	System.out.println(q.getAnswer().getAnswer());
	
	
	//fetching based on answer
	
	Answer ans=session.get(Answer.class,34);
	System.out.println(ans.getAnswer());
	System.out.println(ans.getQuestion());
	

	session.close();
	factory.close();
	}

}
