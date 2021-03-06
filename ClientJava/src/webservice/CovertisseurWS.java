
package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CovertisseurWS", targetNamespace = "http://webService/", wsdlLocation = "http://localhost:8282/ConvertisseurWS?wsdl")
public class CovertisseurWS
    extends Service
{

    private final static URL COVERTISSEURWS_WSDL_LOCATION;
    private final static WebServiceException COVERTISSEURWS_EXCEPTION;
    private final static QName COVERTISSEURWS_QNAME = new QName("http://webService/", "CovertisseurWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/ConvertisseurWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COVERTISSEURWS_WSDL_LOCATION = url;
        COVERTISSEURWS_EXCEPTION = e;
    }

    public CovertisseurWS() {
        super(__getWsdlLocation(), COVERTISSEURWS_QNAME);
    }

    public CovertisseurWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), COVERTISSEURWS_QNAME, features);
    }

    public CovertisseurWS(URL wsdlLocation) {
        super(wsdlLocation, COVERTISSEURWS_QNAME);
    }

    public CovertisseurWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COVERTISSEURWS_QNAME, features);
    }

    public CovertisseurWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CovertisseurWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://webService/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webService/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COVERTISSEURWS_EXCEPTION!= null) {
            throw COVERTISSEURWS_EXCEPTION;
        }
        return COVERTISSEURWS_WSDL_LOCATION;
    }

}
