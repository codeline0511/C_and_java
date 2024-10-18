import java.util.Scanner;

//************************************************************
//파일명: season.java
//작성자: 조정흠
//작성일: 2024년 9월 30일
//내용:우선 입력받는 숫자는 개월을 나타내므로 month라는 이름을 쓰고 int형으로 지정
//출력해야하는 계절은 season이라는 변수 이름을 썼으며 단어이기에 String형으로 지정
//계절이 있는 달은 1월부터 12월이므로 0 이하이거나 13 이상인 정수를 입력받으면 
//다시 입력할 수 있도록 do-while문 사용,
//그리고 각 개월에 맞춰 계절을 출력할 수 있도록 switch문 사용
//*************************************************************

public class season {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw3_1: 조정흠");
		
		Scanner sc = new Scanner(System.in);
		int month;
		String season = "";
		
		do{
			System.out.print("12개월 중 원하는 달을 입력하시오 [1-12]:");
			month = sc.nextInt();
		}while(month < 1 || month > 12);
		
		switch(month) {
		case 1: season = "겨울"; break;
		case 2: season = "겨울"; break;
		case 3: season = "봄"; break;
		case 4: season = "봄"; break;
		case 5: season = "봄"; break;
		case 6: season = "여름"; break;
		case 7: season = "여름"; break;
		case 8: season = "여름"; break;
		case 9: season = "가을"; break;
		case 10: season = "가을"; break;
		case 11: season = "가을"; break;
		case 12: season = "겨울"; break;
		}
		
		System.out.print(month + "월은 " + season + "입니다.");

	}

}
