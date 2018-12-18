package com.revolut.dao;

public abstract class DAO {

	public static final int H2 = 1;

	public abstract UserDAO getUserDAO();

	public abstract AccountDAO getAccountDAO();

	public abstract void fillData();

	public static DAO getDAO(int factoryCode) {

		switch (factoryCode) {
		case H2:
			return new H2DAO();
		default:
			// by default using H2 in memory database
			return new H2DAO();
		}
	}
}
