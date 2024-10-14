//**************************
//���ϸ�:TelevisionTest.java
//�ۼ���:������
//�ۼ���:2024�� 10�� 14��
//����:Television Ŭ���� �ȿ� model ������ price ������ Ŭ���� �������� �� �� �ֵ��� ����
//setModel, setPrice�� �����ڷμ� ���� Ŭ���� �ܺο��� �޴� ���� Ŭ���� ������ ���� ����
//���� getModel, getPrice���  �����ڰ� �̸� ��ȯ
//�����ڵ��� �Ű������� ���̷� ���еǸ�, ������ ������ �ʱ�ȭ�ǰų� �Է¹��� ������ ȣ��
//�𵨸�� ������ ���Ƿ� ����
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
		return "�𵨸�:" + model + " ����:" + price;
    } 
}

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("hw4_2: ������");
		
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
