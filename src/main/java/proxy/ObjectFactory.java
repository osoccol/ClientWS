
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");
    private final static QName _Conversion_QNAME = new QName("http://ws/", "conversion");
    private final static QName _ConversionResponse_QNAME = new QName("http://ws/", "conversionResponse");
    private final static QName _GetCompteById_QNAME = new QName("http://ws/", "getCompteById");
    private final static QName _GetCompteByIdResponse_QNAME = new QName("http://ws/", "getCompteByIdResponse");
    private final static QName _GetListCompte_QNAME = new QName("http://ws/", "getListCompte");
    private final static QName _GetListCompteResponse_QNAME = new QName("http://ws/", "getListCompteResponse");
    private final static QName _GetSolde_QNAME = new QName("http://ws/", "getSolde");
    private final static QName _GetSoldeResponse_QNAME = new QName("http://ws/", "getSoldeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link GetCompteById }
     * 
     */
    public GetCompteById createGetCompteById() {
        return new GetCompteById();
    }

    /**
     * Create an instance of {@link GetCompteByIdResponse }
     * 
     */
    public GetCompteByIdResponse createGetCompteByIdResponse() {
        return new GetCompteByIdResponse();
    }

    /**
     * Create an instance of {@link GetListCompte }
     * 
     */
    public GetListCompte createGetListCompte() {
        return new GetListCompte();
    }

    /**
     * Create an instance of {@link GetListCompteResponse }
     * 
     */
    public GetListCompteResponse createGetListCompteResponse() {
        return new GetListCompteResponse();
    }

    /**
     * Create an instance of {@link GetSolde }
     * 
     */
    public GetSolde createGetSolde() {
        return new GetSolde();
    }

    /**
     * Create an instance of {@link GetSoldeResponse }
     * 
     */
    public GetSoldeResponse createGetSoldeResponse() {
        return new GetSoldeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<Conversion>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<ConversionResponse>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteById }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteById")
    public JAXBElement<GetCompteById> createGetCompteById(GetCompteById value) {
        return new JAXBElement<GetCompteById>(_GetCompteById_QNAME, GetCompteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteByIdResponse")
    public JAXBElement<GetCompteByIdResponse> createGetCompteByIdResponse(GetCompteByIdResponse value) {
        return new JAXBElement<GetCompteByIdResponse>(_GetCompteByIdResponse_QNAME, GetCompteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListCompte")
    public JAXBElement<GetListCompte> createGetListCompte(GetListCompte value) {
        return new JAXBElement<GetListCompte>(_GetListCompte_QNAME, GetListCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getListCompteResponse")
    public JAXBElement<GetListCompteResponse> createGetListCompteResponse(GetListCompteResponse value) {
        return new JAXBElement<GetListCompteResponse>(_GetListCompteResponse_QNAME, GetListCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getSolde")
    public JAXBElement<GetSolde> createGetSolde(GetSolde value) {
        return new JAXBElement<GetSolde>(_GetSolde_QNAME, GetSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getSoldeResponse")
    public JAXBElement<GetSoldeResponse> createGetSoldeResponse(GetSoldeResponse value) {
        return new JAXBElement<GetSoldeResponse>(_GetSoldeResponse_QNAME, GetSoldeResponse.class, null, value);
    }

}
