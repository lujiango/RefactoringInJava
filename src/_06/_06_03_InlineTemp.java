package _06;

/**
 * Inline Temp(������ʱ����)<br>
 * ��һ��������ֻ��һ���򵥱��ʽ��ֵһ�Σ����������������ع��ַ��� <br>
 * �����жԸñ��������ö������滻Ϊ������ֵ���Ǹ����ʽ����
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

	// ȥ��ֻ�����ù�һ�ε��м����basePrice
	public boolean isOver1000New() {
		Order anOrder = new Order();
		return anOrder.basePrice() > 1000;
	}

}
