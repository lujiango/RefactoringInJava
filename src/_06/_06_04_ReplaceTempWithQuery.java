package _06;

/**
 * Replace Temp with Query(以查询取代临时变量)<br>
 * 程序以一个临时变量保存某一个表达式的运算结果<br>
 * 将这个表达式提炼到一个独立函数中，将这个临时变量的所有引用点替换为对新函数的调用，此后，新函数可被其它函数使用。 <br>
 * 局部变量会使代码难以被提炼，所以你应该尽可能把它们替换为查询。
 * 
 * @author lujiang
 *
 */
public class _06_04_ReplaceTempWithQuery {
	class Order {
		private int quantity;

		private double itemPrice;

		public double discount() {
			double basePrice = quantity * itemPrice;
			if (basePrice > 1000) {
				return basePrice * 0.95;
			} else {
				return basePrice * 0.98;
			}
		}

		// 新的方式。
		public double discountNew() {
			if (basePrice() > 1000) {
				return basePrice() * 0.95;
			} else {
				return basePrice() * 0.98;
			}
		}

		public double basePrice() {
			return quantity * itemPrice;
		}

	}
}
