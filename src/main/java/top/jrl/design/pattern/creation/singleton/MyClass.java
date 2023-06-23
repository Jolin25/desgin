package top.jrl.design.pattern.creation.singleton;

/**
 * @author jrl
 * @date Create in 15:49 2023/6/23
 */
public class MyClass {
	static MyClass myClassInstance;

	/**
	 * 为了使用双重检查加锁的方式来更高效的在多线程环境下创建单例
	 *
	 * @author jrl
	 * @date 2023/6/23
	 */
	static volatile MyClass myClassInstance4effective;

	private MyClass() {
	}

	/**
	 * 获取实例
	 *
	 * @date 2023/6/23
	 */
	public static MyClass getInstance() {
		return new MyClass();
	}

	/**
	 * 单线程 & 单例
	 *
	 * @date 2023/6/23
	 */
	public static MyClass getSingletonInstance() {
		if (myClassInstance == null) {
			myClassInstance = new MyClass();
		}
		return myClassInstance;
	}

	/**
	 * 单例 & 多线程
	 *
	 * @date 2023/6/23
	 */
	public static MyClass getSingletonInstanceInMul() {
		synchronized (MyClass.class) {
			if (myClassInstance == null) {
				myClassInstance = new MyClass();
			}
		}
		return myClassInstance;
	}

	/**
	 * 单例 & 多线程 & 更高效 【*】
	 *
	 * @date 2023/6/23
	 */
	public static MyClass getSingletonInstanceInMulEffective() {
		if (myClassInstance4effective == null) {
			synchronized (MyClass.class) {
				if (myClassInstance4effective == null) {
					myClassInstance4effective = new MyClass();
				}
			}
		}
		return myClassInstance4effective;
	}

	public static void main(String[] args) {
		// MyClass singletonInstance = getSingletonInstance();
		// System.out.println(singletonInstance);
		// MyClass singletonInstance1 = getSingletonInstance();
		// System.out.println(singletonInstance1);
		// MyClass instance = getInstance();
		// System.out.println(instance);


		new Thread(() -> {
			MyClass singletonInstanceInMul = getSingletonInstanceInMul();
			System.out.println(singletonInstanceInMul);
		}).start();
		new Thread(() -> {
			MyClass singletonInstanceInMul = getSingletonInstanceInMul();
			System.out.println(singletonInstanceInMul);
		}).start();
	}
}

