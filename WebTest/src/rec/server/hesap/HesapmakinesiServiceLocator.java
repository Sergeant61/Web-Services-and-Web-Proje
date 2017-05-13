/**
 * HesapmakinesiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rec.server.hesap;

public class HesapmakinesiServiceLocator extends org.apache.axis.client.Service implements rec.server.hesap.HesapmakinesiService {

    public HesapmakinesiServiceLocator() {
    }


    public HesapmakinesiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HesapmakinesiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Hesapmakinesi
    private java.lang.String Hesapmakinesi_address = "http://localhost:8082/WebServisDeneme/services/Hesapmakinesi";

    public java.lang.String getHesapmakinesiAddress() {
        return Hesapmakinesi_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HesapmakinesiWSDDServiceName = "Hesapmakinesi";

    public java.lang.String getHesapmakinesiWSDDServiceName() {
        return HesapmakinesiWSDDServiceName;
    }

    public void setHesapmakinesiWSDDServiceName(java.lang.String name) {
        HesapmakinesiWSDDServiceName = name;
    }

    public rec.server.hesap.Hesapmakinesi getHesapmakinesi() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Hesapmakinesi_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHesapmakinesi(endpoint);
    }

    public rec.server.hesap.Hesapmakinesi getHesapmakinesi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            rec.server.hesap.HesapmakinesiSoapBindingStub _stub = new rec.server.hesap.HesapmakinesiSoapBindingStub(portAddress, this);
            _stub.setPortName(getHesapmakinesiWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHesapmakinesiEndpointAddress(java.lang.String address) {
        Hesapmakinesi_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (rec.server.hesap.Hesapmakinesi.class.isAssignableFrom(serviceEndpointInterface)) {
                rec.server.hesap.HesapmakinesiSoapBindingStub _stub = new rec.server.hesap.HesapmakinesiSoapBindingStub(new java.net.URL(Hesapmakinesi_address), this);
                _stub.setPortName(getHesapmakinesiWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Hesapmakinesi".equals(inputPortName)) {
            return getHesapmakinesi();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hesap.server.rec", "HesapmakinesiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hesap.server.rec", "Hesapmakinesi"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Hesapmakinesi".equals(portName)) {
            setHesapmakinesiEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
