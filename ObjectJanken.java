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

		// Playerクラスの一種であるYamadaクラスを生成
		Player yamada = new Player("山田さん");

		// 村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}
}
