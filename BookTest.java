//**********************************
//���ϸ�:BookTest.java
//�ۼ���:������
//�ۼ���:2024�� 10�� 7��
//����:å�� ������ ó�����ִ� Book Ŭ���� �ۼ�
//�� å�� ������ ���� �б� ���� ���������� ��ȯ
//price1�� ���������� ���� ��ȯ, �� �� �ٽ� ��ü�� ���ι��� ���� ����
//price2�� ���������� �� �� ������ ���� �ٽ� ��������� ������ ��ȯ
//��������� ������ ���࿬���� 2014����͸� 10% ����, 2014�� ���̸� 50% ����
//***********************************

class Book 
{
	String title;
	int price;
	int year;
	
	String print(String x, int y, int z) { return x + "��� å�� " + y + "���̰� " + z + "�⿡ �����߽��ϴ�.\n" ; }
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
		System.out.println("hw4_1: ������\n");
		
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
