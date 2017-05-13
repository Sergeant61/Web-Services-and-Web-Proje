/**
 * DaoDecoderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rec.server.decoder;

public class DaoDecoderServiceLocator extends org.apache.axis.client.Service implements rec.server.decoder.DaoDecoderService {

    public DaoDecoderServiceLocator() {
    }


    public DaoDecoderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DaoDecoderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DaoDecoder
    private java.lang.String DaoDecoder_address = "http://localhost:8082/WebServisDeneme/services/DaoDecoder";

    public java.lang.String getDaoDecoderAddress() {
        return DaoDecoder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DaoDecoderWSDDServiceName = "DaoDecoder";

    public java.lang.String getDaoDecoderWSDDServiceName() {
        return DaoDecoderWSDDServiceName;
    }

    public void setDaoDecoderWSDDServiceName(java.lang.String name) {
        DaoDecoderWSDDServiceName = name;
    }

    public rec.server.decoder.DaoDecoder getDaoDecoder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DaoDecoder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDaoDecoder(endpoint);
    }

    public rec.server.decoder.DaoDecoder getDaoDecoder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            rec.server.decoder.DaoDecoderSoapBindingStub _stub = new rec.server.decoder.DaoDecoderSoapBindingStub(portAddress, this);
            _stub.setPortName(getDaoDecoderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDaoDecoderEndpointAddress(java.lang.String address) {
        DaoDecoder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (rec.server.decoder.DaoDecoder.class.isAssignableFrom(serviceEndpointInterface)) {
                rec.server.decoder.DaoDecoderSoapBindingStub _stub = new rec.server.decoder.DaoDecoderSoapBindingStub(new java.net.URL(DaoDecoder_address), this);
                _stub.setPortName(getDaoDecoderWSDDServiceName());
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
        if ("DaoDecoder".equals(inputPortName)) {
            return getDaoDecoder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://decoder.server.rec", "DaoDecoderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://decoder.server.rec", "DaoDecoder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DaoDecoder".equals(portName)) {
            setDaoDecoderEndpointAddress(address);
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
