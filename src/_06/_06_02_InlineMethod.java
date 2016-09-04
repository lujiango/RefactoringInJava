package _06;

/**
 * 一个函数的本体与名称同样清楚易懂。<br>
 * 在函数调用点插入函数本体，然后移除该函数。<br>
 * 找出无用的间接层，同时将那些无用的间接层去除。
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

	// 以下为合理做法
	int getRatingNew() {
		return (numberOfLateDeliveries > 5) ? 2 : 1;
	}

}
