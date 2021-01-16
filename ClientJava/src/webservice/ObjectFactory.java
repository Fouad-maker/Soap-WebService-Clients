
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccountListResponse_QNAME = new QName("http://webService/", "accountListResponse");
    private final static QName _AccountList_QNAME = new QName("http://webService/", "accountList");
    private final static QName _GetAccount_QNAME = new QName("http://webService/", "getAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://webService/", "getAccountResponse");
    private final static QName _ConversionEuroTNDResponse_QNAME = new QName("http://webService/", "ConversionEuro-TNDResponse");
    private final static QName _ConversionEuroTND_QNAME = new QName("http://webService/", "ConversionEuro-TND");
    private final static QName _Account_QNAME = new QName("http://webService/", "account");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountListResponse }
     * 
     */
    public AccountListResponse createAccountListResponse() {
        return new AccountListResponse();
    }

    /**
     * Create an instance of {@link AccountList }
     * 
     */
    public AccountList createAccountList() {
        return new AccountList();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroTND }
     * 
     */
    public ConversionEuroTND createConversionEuroTND() {
        return new ConversionEuroTND();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ConversionEuroTNDResponse }
     * 
     */
    public ConversionEuroTNDResponse createConversionEuroTNDResponse() {
        return new ConversionEuroTNDResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "accountListResponse")
    public JAXBElement<AccountListResponse> createAccountListResponse(AccountListResponse value) {
        return new JAXBElement<AccountListResponse>(_AccountListResponse_QNAME, AccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "accountList")
    public JAXBElement<AccountList> createAccountList(AccountList value) {
        return new JAXBElement<AccountList>(_AccountList_QNAME, AccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroTNDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "ConversionEuro-TNDResponse")
    public JAXBElement<ConversionEuroTNDResponse> createConversionEuroTNDResponse(ConversionEuroTNDResponse value) {
        return new JAXBElement<ConversionEuroTNDResponse>(_ConversionEuroTNDResponse_QNAME, ConversionEuroTNDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroTND }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "ConversionEuro-TND")
    public JAXBElement<ConversionEuroTND> createConversionEuroTND(ConversionEuroTND value) {
        return new JAXBElement<ConversionEuroTND>(_ConversionEuroTND_QNAME, ConversionEuroTND.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

}
