package com.sistema.oficina.mecanica;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory session = buidSessionFactory();

	private static SessionFactory buidSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (Exception erro1) {
			System.out.println("Erro HibernateUtil, erro: " + erro1);
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getSession() {
		return session;
	}
}
