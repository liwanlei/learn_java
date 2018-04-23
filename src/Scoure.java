public class Scoure {
  public static void main(String args[]) {
	  int score=90;
	  if (score>=85 && score <=100) {
		System.out.println("优秀");
	}else if (score>=65 && score <85) {
		System.out.println("良");
	}else if (score>=60 && score <65) {
		System.out.println("及格");
	}else if (score>=0 && score <60) {
		System.out.println("不及格");
	}else {
		System.out.println("分数不能大于100 或者小于0");
	}
}
}
//if语句的练习
