package com.infinite.HibernateAgent;

import java.util.Scanner;

public class AgentUpdateMain {

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
		
		
		System.out.println("Enter Agent Maritalstatus  ");
		agent.setPremium(sc.nextDouble());
		

	}

}
