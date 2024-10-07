//**********************************
//파일명:BookTest.java
//작성자:조정흠
//작성일:2024년 10월 7일
//내용:책의 정보를 처리해주는 Book 클래스 작성
//세 책의 정보를 더욱 읽기 쉽게 문장형으로 반환
//price1은 정액할인한 값을 반환, 그 후 다시 객체에 할인받은 값을 저장
//price2는 정액할인을 한 후 저장한 값을 다시 재고할인한 값으로 반환
//재고할인의 내옹은 발행연도가 2014년부터면 10% 할인, 2014년 전이면 50% 할인
//***********************************

class Book 
{
	String title;
	int price;
	int year;
	
	String print(String x, int y, int z) { return x + "라는 책은 " + y + "원이고 " + z + "년에 발행했습니다.\n" ; }
	int discount(int x) { return price - x;}
	int discount() 
	{ 
		 if( year >= 2014)
			 return (price / 10) * 9;
		 else
			 return price / 2;
	}
}

public class BookTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("hw4_1: 조정흠\n");
		
		Book myBook = new Book();
		Book yourBook = new Book();
		Book ourBook = new Book();
		
		myBook.title = "java";
		myBook.price = 10000;
		myBook.year = 2014;
		
		yourBook.title = "database";
		yourBook.price = 20000;
		yourBook.year = 2013;
		
		ourBook.title = "computer";
		ourBook.price = 30000;
		ourBook.year = 2009;
		
		
		System.out.print(myBook.print(myBook.title, myBook.price, myBook.year));
		System.out.print(yourBook.print(yourBook.title, yourBook.price, yourBook.year));
		System.out.println(ourBook.print(ourBook.title, ourBook.price, ourBook.year));
		
		int myBook_price1 = myBook.discount(1000);
		int yourBook_price1 = yourBook.discount(1000);
		int ourBook_price1 = ourBook.discount(1000);
		
		myBook.price = myBook_price1;
		yourBook.price = yourBook_price1;
		ourBook.price = ourBook_price1;
		
		int myBook_price2 = myBook.discount();
		int yourBook_price2 = yourBook.discount();
		int ourBook_price2 = ourBook.discount();
		
		System.out.print(myBook.print(myBook.title, myBook_price2, myBook.year));
		System.out.print(yourBook.print(yourBook.title, yourBook_price2, yourBook.year));
		System.out.print(ourBook.print(ourBook.title, ourBook_price2, ourBook.year));

	}

}
