package top.jrl.design.pattern.behavior.proxy.gumball.remote.demo.service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author jrl
 * @date Create in 13:46 2023/6/30
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	protected MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says,'Hey'";
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		MyRemoteImpl myRemote = new MyRemoteImpl();
		Naming.rebind("RemoteHello",myRemote);
	}
}
