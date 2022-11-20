
package proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "banque", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Banque {


    /**
     * 
     * @param id
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompteById", targetNamespace = "http://ws/", className = "proxy.GetCompteById")
    @ResponseWrapper(localName = "getCompteByIdResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteByIdResponse")
    @Action(input = "http://ws/banque/getCompteByIdRequest", output = "http://ws/banque/getCompteByIdResponse")
    public Compte getCompteById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://ws/", className = "proxy.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://ws/", className = "proxy.ConversionResponse")
    @Action(input = "http://ws/banque/conversionRequest", output = "http://ws/banque/conversionResponse")
    public double conversion(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListCompte", targetNamespace = "http://ws/", className = "proxy.GetListCompte")
    @ResponseWrapper(localName = "getListCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetListCompteResponse")
    @Action(input = "http://ws/banque/getListCompteRequest", output = "http://ws/banque/getListCompteResponse")
    public List<Compte> getListCompte();

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSolde", targetNamespace = "http://ws/", className = "proxy.GetSolde")
    @ResponseWrapper(localName = "getSoldeResponse", targetNamespace = "http://ws/", className = "proxy.GetSoldeResponse")
    @Action(input = "http://ws/banque/getSoldeRequest", output = "http://ws/banque/getSoldeResponse")
    public double getSolde(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
