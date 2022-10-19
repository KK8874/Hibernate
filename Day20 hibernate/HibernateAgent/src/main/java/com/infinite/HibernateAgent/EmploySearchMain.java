package com.infinite.HibernateAgent;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class EmploySearchMain {

	public static void main(String[] args) {
		int agentid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Agent agentid");
		agentid=sc.nextInt();
		Configuration  cfg=new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from Agent where agentid="+agentid);
		List<Agent> AgentList=query.list();
		if(AgentList.size()==1){
			System.out.println(AgentList.get(0));
		}else{
			System.out.println("*** Record not Found");
		}
	}

	}


