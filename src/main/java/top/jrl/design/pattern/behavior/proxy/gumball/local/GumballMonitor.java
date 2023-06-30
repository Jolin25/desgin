package top.jrl.design.pattern.behavior.proxy.gumball.local;

/**
 * @author jrl
 * @date Create in 16:40 2023/6/29
 */
public class GumballMonitor {
	GumballMachine gumballMachine;

	public GumballMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void report() {
		System.out.println("Gumball Machine:" + gumballMachine.getLocation());
		System.out.println("Current inventory:" + gumballMachine.getCount()+"gumballs");
		System.out.println("Current status:" + gumballMachine.getStatus());
	}
}
