package _06;

/**
 * Extract Method(��������)<br>
 * ��һ�δ�����Ա���֯��һ�𲢶�������<br>
 * ��һ�δ���Ž�һ�����������У����ú������ƽ��͸ú�������;��<br>
 * �ô���
 * ��������С�����û���󣬸�дҲ���ף��ɶ�����ǿ��
 * 
 * @author lujiang
 *
 */
public class _06_01_ExtractMethod {
	private String name;

	void printBanner() {
		System.out.println("printBanner");
	}

	// printOwing����ʵ��
	void printOwing(double amount) {
		printBanner();
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}

	// printOwingNewΪ����ʵ��
	void printOwingNew(double amount) {
		printBanner();
		printDetails(amount);
	}

	// �����ķ���printDetails
	void printDetails(double amount) {
		System.out.println("name : " + name);
		System.out.println("amount : " + amount);
	}

}
