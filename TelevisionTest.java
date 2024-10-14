//**************************
//파일명:TelevisionTest.java
//작성자:조정흠
//작성일:2024년 10월 14일
//내용:Television 클래스 안에 model 변수와 price 변수를 클래스 내에서만 쓸 수 있도록 지정
//setModel, setPrice는 설정자로서 각각 클래스 외부에서 받는 값을 클래스 변수에 각각 저장
//그후 getModel, getPrice라는  접근자가 이를 반환
//생성자들은 매개변수의 차이로 구분되며, 일정한 값으로 초기화되거나 입력받은 값으로 호출
//모델명과 가격은 임의로 결정
//***************************

class Television {
	private String model;
	private int price;
	
	public String getModel() { return model;}
	public void setModel(String model) { this.model = model;}
	public int getPrice() { return price;}
	public void setPrice(int price) { this.price = price;}
	
	public Television() {
		model = "MyTV";
		price = 0;
	}
	
	public Television(String model) {
		this.model = model;
		price = 0;
	}
	
	public Television(String model, int price) {
		this.model= model;
		this.price = price;
	}
	
	public String toString() {
		return "모델명:" + model + " 가격:" + price;
    } 
}

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("hw4_2: 조정흠");
		
		Television tv1 = new Television();
		Television tv2 = new Television("LGTV");
		Television tv3 = new Television("SamSungTV", 1390000);
		
		tv1.setModel("HitmanTV");
		tv1.setPrice(790000);
		tv2.setPrice(1500000);
		
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
	}

}
