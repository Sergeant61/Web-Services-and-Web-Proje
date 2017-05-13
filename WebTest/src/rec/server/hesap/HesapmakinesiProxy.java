package rec.server.hesap;

public class HesapmakinesiProxy implements rec.server.hesap.Hesapmakinesi {
  private String _endpoint = null;
  private rec.server.hesap.Hesapmakinesi hesapmakinesi = null;
  
  public HesapmakinesiProxy() {
    _initHesapmakinesiProxy();
  }
  
  public HesapmakinesiProxy(String endpoint) {
    _endpoint = endpoint;
    _initHesapmakinesiProxy();
  }
  
  private void _initHesapmakinesiProxy() {
    try {
      hesapmakinesi = (new rec.server.hesap.HesapmakinesiServiceLocator()).getHesapmakinesi();
      if (hesapmakinesi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hesapmakinesi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hesapmakinesi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hesapmakinesi != null)
      ((javax.xml.rpc.Stub)hesapmakinesi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public rec.server.hesap.Hesapmakinesi getHesapmakinesi() {
    if (hesapmakinesi == null)
      _initHesapmakinesiProxy();
    return hesapmakinesi;
  }
  
  public double topla(double sayi1, double sayi2) throws java.rmi.RemoteException{
    if (hesapmakinesi == null)
      _initHesapmakinesiProxy();
    return hesapmakinesi.topla(sayi1, sayi2);
  }
  
  public double cikar(double sayi1, double sayi2) throws java.rmi.RemoteException{
    if (hesapmakinesi == null)
      _initHesapmakinesiProxy();
    return hesapmakinesi.cikar(sayi1, sayi2);
  }
  
  public double carp(double sayi1, double sayi2) throws java.rmi.RemoteException{
    if (hesapmakinesi == null)
      _initHesapmakinesiProxy();
    return hesapmakinesi.carp(sayi1, sayi2);
  }
  
  public double bol(double sayi1, double sayi2) throws java.rmi.RemoteException{
    if (hesapmakinesi == null)
      _initHesapmakinesiProxy();
    return hesapmakinesi.bol(sayi1, sayi2);
  }
  
  
}