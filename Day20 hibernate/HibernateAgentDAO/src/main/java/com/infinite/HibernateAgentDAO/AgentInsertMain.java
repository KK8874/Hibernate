package com.infinite.HibernateAgentDAO;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class AgentInsertMain {

	public static void main(String[] args) {
         Agent  agent =new Agent();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Agent agentId");
		agent.setAgentid(sc.nextInt());
		
		System.out.println("Enter Agent Name");
		agent.setName(sc.next());
		
		System.out.println("Enter Agent City");
		agent.setCity(sc.next());
		
		
		System.out.println("Enter Agent Gender");
		agent.setGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter Agent Maritalstatus  ");
		agent.setMaritalstatus (sc.nextInt());
		
		System.out.println("Enter Agent Premium");
		agent.setPremium(sc.nextDouble());
		
		
	
		
		Configuration  cfg=new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction trans=session.beginTransaction();
		session.save(agent);
		trans.commit();
		System.out.println("**** record inserted ");



		
		
	}
	}


