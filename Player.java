/**
 *
 * ジャンケンのプレイヤーを表すクラス。
 *
 */
public class Player {
	// ジャンケンの手を表す定数
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

	// ----------------
	// プレイヤークラスの属性
	// ----------------
	/** プレイヤーの名前 */
	private String name_;
	/** プレイヤーの勝った回数 */
	private int winCount_ = 0;

	// ----------------
	// コンストラクタ
	// ----------------
	Player(String name)
	{
		this.name_ = name;
	}

	// ----------------
	// プレイヤークラスの操作
	// ----------------
	/**
	 * ジャンケンの手を出す。
	 * @return ジャンケンの手
	 */
	public int showHand()
	{
		// ①実際の処理
		// プレイヤーの手
		int playerHand = 0;

		// 0以上3未満の少数として乱数を得る
		double randomNum = Math.random() * 3;

		if (randomNum < 1)
		{
			// randomNumが1.0未満の場合、グー
			playerHand = STONE;
			System.out.println("グー");
		}
		else if (randomNum < 2)
		{
			// randomNumが1.0以上2.0未満の場合、チョキ
			playerHand = SCISSORS;
			System.out.println("チョキ");
		}
		else if (randomNum <= 3)
		{
			// randomNumが2.0以上3.0以下の場合、パー
			playerHand = PAPER;
			System.out.println("パー");
		}
		return playerHand;
	}

	/**
	 * 審判から勝敗を聞く。
	 * @param result true:勝ち,false:負け
	 */
	public void notifyResult(boolean result)
	{
		// ②実際の処理
		if (result == true)
		{
			this.winCount_ += 1;
		}
	}

	/**
	 * 自分の勝った回数を答える。
	 * @return 勝った回数
	 */
	public int getWinCount()
	{
		// ③実際の処理
		return this.winCount_;
	}

	/**
	 * 自分の名前を答える。
	 * @return 名前
	 */
	public String getName()
	{
		return this.name_;
	}
}
