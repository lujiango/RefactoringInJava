package _06;

/**
 * Inline Temp(内联临时变量)<br>
 * 有一个变量，只被一个简单表达式赋值一次，而它妨碍了其它重构手法。 <br>
 * 将所有对该变量的引用动作，替换为对它赋值的那个表达式自身。
 * 
 * @author lujiang
 *
 */
public class _06_03_InlineTemp {
	class Order {
		private double price;

		public double basePrice() {
			return price;
		}
	}

	public boolean isOver1000() {
		Order anOrder = new Order();
		double basePrice = anOrder.basePrice();
		return (basePrice > 1000);
	}

	// 去除只被引用过一次的中间变量basePrice
	public boolean isOver1000New() {
		Order anOrder = new Order();
		return anOrder.basePrice() > 1000;
	}

}
