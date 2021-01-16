package webService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import webJob.Account;
/*
 * POJO (Plain Old Java Object) classe libre
 *  
 *  */

@WebService(serviceName = "CovertisseurWS")
public class BanqueService {

	public BanqueService() {
		// TODO Auto-generated constructor stub
	}
	@WebMethod(operationName = "ConversionEuro-TND")
	public double conversion(@WebParam(name = "montant") double montant) {
		return montant*3.29;
	}
	
	@WebMethod
	public Account getAccount( @WebParam(name = "accountNumber") int accountNbr) {
		return new Account(accountNbr, Math.random()*3555, new Date());
	}
	
	@WebMethod
	public List<Account> accountList(){
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1, Math.random()*3555, new Date()));
		accounts.add(new Account(2, Math.random()*3555, new Date()));
		accounts.add(new Account(3, Math.random()*3555, new Date()));
		return accounts;
	}

}
