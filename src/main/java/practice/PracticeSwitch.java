package practice;

public class PracticeSwitch {

	public static void main(String[] args) {

		int[] jobs = { 1, 2, 4, 1, 5, 5, 2, 1, 3, 1 }; // 選択したいジョブのインデックス
		for (int job : jobs) {

			String work = "";

			switch (job) {
			case 1:
				work = "勇者";

				break;
			case 2:
				work = "バトルマスター";

				break;
			case 3:
				work = "パラディン";

				break;
			case 4:
				work = "海賊";

				break;
			case 5:
				work = "魔法剣士";

				break;
			}
			System.out.println(job + ":" + work);
		}

	}
}
