package java_chap05;

public class ArrayCreateEx1 {

	public static void main(String[] args) {
		int[] scores1 = {83,90, 87}; // int[] scores1 = new int[] {83,90, 87};와 같음 // 크기를 지정 안해줘도 되는 이유는 값이 3개가 정해져 있어서
		int[] scores2 = new int[3]; // 자바의 배열생성의 기본 방식
		int[] scores3;
		scores3 = new int[3];
		int[] scores4 = null;
		scores4 = new int[3];
		
		System.out.println("배열 scores1의 길이 : " + scores1.length);
		System.out.println("배열 scores2의 길이 : " + scores2.length);
		System.out.println("배열 scores3의 길이 : " + scores3.length);
		System.out.println("배열 scores4의 길이 : " + scores4.length);

	}

}
