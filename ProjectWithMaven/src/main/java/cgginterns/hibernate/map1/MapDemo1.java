package cgginterns.hibernate.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {
	
	public static void main(String [] args) {
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	
		Question q=new Question();
		
		q.setQuestionId(1212);
		q.setQuestion("what is java");
		
		
		Answer a=new Answer();
		
		a.setAnswerId(23);
		a.setAnswer("java is a programming language");
		a.setQuestion(q);
		
		Answer a1=new Answer();
		a1.setAnswerId(24);
		a1.setAnswer("java is a palform idependent");
		a1.setQuestion(q);

		
		Answer a2=new Answer();
		
		a2.setAnswerId(45);
		a2.setAnswer("java is strongly typed language");
		a2.setQuestion(q);

		ArrayList<Answer> list=new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		q.setAnswers(list);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(a1);
		session.save(a2);
		session.save(a);
		
		session.save(q);
		
		tx.commit();
		
		//fetching......
//		
		
	  Question question =(Question)session.load(Question.class, 1212); 
	  System.out.println(question.getQuestion());
	  List<Answer> list1=question.getAnswers(); 
  
	  for (Answer answer : list1) {
		  System.out.println(answer.getAnswer());
		
	  }
	 		
		session.close();
		factory.close();
		
	}
		
		

}
