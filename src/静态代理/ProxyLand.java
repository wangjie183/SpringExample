package 静态代理;

public class ProxyLand {
	private Landlady land;
	public void proxytenement() {
		//先看是否有房源信息
		if(land==null) {
			land=new Landlady();
		}
		Intermediary.before();
		land.tenement();
		Intermediary.after();
	}
}
