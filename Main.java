class Main {

  public static void main(String args[]) {
    for (int i = 1; i <= 100; i++) {
      String str = "";

      // ここから記述
      if(i % 15 == 0) { //15の倍数であるかどうか
    	  str += "FizzBuzz";
      }else if(i % 3 == 0) { //3の倍数であるかどうか
    	  str += "Fizz";
      }else if(i % 5 == 0) { //5の倍数であるかどうか
    	  str += "Buzz";
      }else {
    	  str += i;
      }
      // ここまで記述

      System.out.println(str);
    }
  }
}