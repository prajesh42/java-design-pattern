package com.prajesh.patterns.abstractfactory;

public class DaoFactoryProducer {

	public static DaoAbstractFactory createDaoFactory(String factoryType) {
		DaoAbstractFactory daf=null;
		if(factoryType.equals("xml")) {
			daf=new XMLDaoFactory();
		}else if(factoryType.equals("db")) {
			daf=new DBDaoFactory();
		}
		return daf;
	}
}
