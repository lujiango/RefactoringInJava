package _06;

/**
 * һ�������ı���������ͬ������׶���<br>
 * �ں������õ���뺯�����壬Ȼ���Ƴ��ú�����<br>
 * �ҳ����õļ�Ӳ㣬ͬʱ����Щ���õļ�Ӳ�ȥ����
 * @author lujiang
 *
 */
public class _06_02_InlineMethod {
	private int numberOfLateDeliveries;

	boolean moreThanFiveLateDeliveries() {
		return numberOfLateDeliveries > 5;
	}

	int getRating() {
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}

	// ����Ϊ��������
	int getRatingNew() {
		return (numberOfLateDeliveries > 5) ? 2 : 1;
	}

}
