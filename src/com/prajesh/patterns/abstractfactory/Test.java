package com.prajesh.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
         DaoAbstractFactory createDaoFactory = DaoFactoryProducer.createDaoFactory("xml");
         Dao createDao = createDaoFactory.createDao("dept");
         createDao.save();
	}

}
