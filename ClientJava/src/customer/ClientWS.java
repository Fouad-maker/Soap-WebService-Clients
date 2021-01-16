package customer;

import java.util.List;

import webservice.Account;
import webservice.AccountList;
import webservice.BanqueService;
import webservice.CovertisseurWS;

/* jaxWS
 * proxy au lieu d'axis proxy
 */

public class ClientWS {

	public static void main(String[] args) {
	
		BanqueService stub = new CovertisseurWS().getBanqueServicePort() ;
		System.out.println(stub.conversionEuroTND(88));
		Account account = stub.getAccount(4);
		System.out.println("sold="+account.getSold());
		System.out.println("---------------------------");
		List<Account> acts = stub.accountList(); 
		for(Account ac:acts) {
			System.out.println("***********************");
			System.out.println("sold="+ac.getSold());

			
		}

	}

}
