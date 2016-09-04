package _06;

/**
 * Extract Method(提炼函数)<br>
 * 有一段代码可以被组织在一起并独立出来<br>
 * 将一段代码放进一个独立函数中，并让函数名称解释该函数的用途。<br>
 * 好处：
 * 函数粒度小，复用机会大，覆写也容易，可读性增强。
 * 
 * @author lujiang
 *
 */
public class _06_01_ExtractMethod {
	private String name;

	void printBanner() {
		System.out.println("printBanner");
	}

	// printOwing函数实现
	void printOwing(double amount) {
		printBanner();
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}

	// printOwingNew为合理实现
	void printOwingNew(double amount) {
		printBanner();
		printDetails(amount);
	}

	// 提炼的方法printDetails
	void printDetails(double amount) {
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}

}
