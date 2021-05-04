/**
 * KPSPublicLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

public class KPSPublicLocator extends org.apache.axis.client.Service implements tr.gov.nvi.tckimlik.WS.KPSPublic {

  
    // Use to get a proxy class for KPSPublicSoap
    private String KPSPublicSoap_address = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

    public String getKPSPublicSoapAddress() {
        return KPSPublicSoap_address;
    }

    // The WSDD service name defaults to the port name.

  
 
    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap()  {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(KPSPublicSoap_address);
        }
        catch (Exception e) {
            throw null;
        }
        return getKPSPublicSoap(endpoint);
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) {
        try {
            tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub(portAddress, this);
            
            return _stub;
        }
        catch (Exception e) {
            return null;
        }
    }

    public void setKPSPublicSoapEndpointAddress(String address) {
        KPSPublicSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) {
        try {
            if (tr.gov.nvi.tckimlik.WS.KPSPublicSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub(new java.net.URL(KPSPublicSoap_address), this);
                
                return _stub;
            }
        }
        catch (Exception t) {
            throw null;
        }
        throw null;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) {
        java.rmi.Remote _stub = getPort(serviceEndpointInterface);
        return _stub;
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublic");
    }

  
    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) {
        
if ("KPSPublicSoap".equals(portName)) {
            setKPSPublicSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
           
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address)  {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
