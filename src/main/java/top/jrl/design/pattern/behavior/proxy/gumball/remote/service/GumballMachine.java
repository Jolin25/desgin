package top.jrl.design.pattern.behavior.proxy.gumball.remote.service;

/**
 * @author jrl
 * @date Create in 16:36 2023/6/29
 */
public class GumballMachine {
	String location;
	int count;
	String status;

	public GumballMachine(String location, int count) {
		this.location = location;
		this.count = count;
	}

	public String getLocation() {
		return location;
	}

	public int getCount() {
		return count;
	}

	public String getStatus() {
		return status;
	}

}
