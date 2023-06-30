package top.jrl.design.pattern.behavior.proxy.gumball.local;

/**
 * @author jrl
 * @date Create in 16:44 2023/6/29
 */
public class GumballMachineTestDiver {
	public static void main(String[] args) {
		int count = 0;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		count = Integer.parseInt(args[1]);
		GumballMonitor gumballMonitor = new GumballMonitor(new GumballMachine(args[0], count));
		gumballMonitor.report();
	}
}
