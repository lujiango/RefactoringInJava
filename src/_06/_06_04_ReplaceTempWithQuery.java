package _06;

/**
 * Replace Temp with Query(�Բ�ѯȡ����ʱ����)<br>
 * ������һ����ʱ��������ĳһ�����ʽ��������<br>
 * ��������ʽ������һ�����������У��������ʱ�������������õ��滻Ϊ���º����ĵ��ã��˺��º����ɱ���������ʹ�á� <br>
 * �ֲ�������ʹ�������Ա�������������Ӧ�þ����ܰ������滻Ϊ��ѯ��
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

		// �µķ�ʽ��
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
