/**
 * 「グー、チョキ、パーの順番で出す」戦略クラス
 */
public class CyclicTactics implements Tactics
{
	/** 最後に出した手(未開始：0) */
	int lasthand = 0;

	/**
	 * 戦略を読み、ジャンケンの手を得る。
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す。
	 * Player.STONE    … グー
	 * Player.SCISSORS … チョキ
	 * Player.PAPER    … パー
	 *
	 * @return ジャンケンの手
	 */
	public int readTactics()
	{
		// 最後に出した手により、次の手を決める
		lasthand += 1;

		// 次の手を出す
		return lasthand;
	}
}
