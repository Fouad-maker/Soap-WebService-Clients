import javax.xml.ws.Endpoint;

import webService.BanqueService;

public class JaxWSServer {

	public JaxWSServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String url="http://0.0.0.0:8282/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("deployed web service success:"+url);

	}

}
