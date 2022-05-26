class Main {

  public static void main(String args[]) {
    // 昇順にソートされた配列
    int[] sortedArray = { 1, 2, 3, 5, 12, 7890, 12345 };
    // 探索対象の番号
    int targetNumber = 7890;
    // 探索実行
    int targetIndex = new Main().serchIndex(sortedArray, targetNumber);
    // 結果出力
    System.out.println(targetIndex);
  }

  private int serchIndex(int[] sortedArray, int targetNumber) {

    // ここから記述
	  int start = 0; //探索範囲の開始インデックス
	  int end = sortedArray.length -1; //探索範囲の末尾インデックス
	  
	  //開始インデックスが末尾インデックス以上になったら終了する
	  while(start <= end) {
		  int mid = (start + end) / 2; //中間インデックスを取得
		  
		  //中間インデックスの値がtargetNumberの値と一致していたら、その値のインデックスを返す
		  if(sortedArray[mid] == targetNumber) {
			  return mid;
		  }
		  //targetNumberの値が中間インデックスの値よりも大きい時、開始インデックスをmidより1大きく設定する
		  else if(sortedArray[mid] < targetNumber){
			  start = mid + 1;
		  }
		  //targetNumberの値が中間インデックスの値よりも小さい時、末尾インデックスをmidよりも1小さくする
		  else {
			  end = mid -1;
		  }
	  }
	
    // ここまで記述

    // 探索対象が存在しない場合、-1を返却
    return -1;
  }
}