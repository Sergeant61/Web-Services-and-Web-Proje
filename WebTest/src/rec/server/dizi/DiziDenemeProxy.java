package rec.server.dizi;

public class DiziDenemeProxy implements rec.server.dizi.DiziDeneme {
  private String _endpoint = null;
  private rec.server.dizi.DiziDeneme diziDeneme = null;
  
  public DiziDenemeProxy() {
    _initDiziDenemeProxy();
  }
  
  public DiziDenemeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDiziDenemeProxy();
  }
  
  private void _initDiziDenemeProxy() {
    try {
      diziDeneme = (new rec.server.dizi.DiziDenemeServiceLocator()).getDiziDeneme();
      if (diziDeneme != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)diziDeneme)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)diziDeneme)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (diziDeneme != null)
      ((javax.xml.rpc.Stub)diziDeneme)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public rec.server.dizi.DiziDeneme getDiziDeneme() {
    if (diziDeneme == null)
      _initDiziDenemeProxy();
    return diziDeneme;
  }
  
  public java.lang.String[] dizi(int[] i) throws java.rmi.RemoteException{
    if (diziDeneme == null)
      _initDiziDenemeProxy();
    return diziDeneme.dizi(i);
  }
  
  
}