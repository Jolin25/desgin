package top.jrl.design.pattern.behavior.proxy.gumball.remote.demo.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author jrl
 * @date Create in 13:36 2023/6/30
 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
