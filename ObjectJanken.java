/**
 * オブジェクト指向によるジャンケンプログラム。
 * 継承を利用してプレイヤーの手の出し方を変更したバージョン。
 */
public class ObjectJanken
{
	public static void main(String[] args)
	{
		// 審判のインスタンス生成
		judge saito = new judge();

		// Playerクラスの一種であるMurataクラスを生成。
		Player murata = new Murata("村田さん");

		// 村田さんに渡す戦略クラスを生成する
		Tactics murataTactics = new CyclicTactics();        // グー、チョキ、パーの順番
		// Tactics murataTactics = new AskTactics();           // 手動入力可
		// Tactics murataTactics = new StoneOnlyTactics();  // グーOnly
		// Tactics murataTactics = new RandomTactics();     // ランダム

		// 村田さんに戦略クラスを渡す
		murata.setTactics(murataTactics);

		// Playerクラスの一種であるYamadaクラスを生成
		Player yamada = new Player("山田さん");

		// 山田さんに渡す戦略クラスを生成する
		Tactics yamadaTactics = new RandomTactics();

		// 山田さんに戦略クラスを渡す
		yamada.setTactics(yamadaTactics);

		// 村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}
}
