import java.util.Scanner;

//************************************************************
//���ϸ�: season.java
//�ۼ���: ������
//�ۼ���: 2024�� 9�� 30��
//����:�켱 �Է¹޴� ���ڴ� ������ ��Ÿ���Ƿ� month��� �̸��� ���� int������ ����
//����ؾ��ϴ� ������ season�̶�� ���� �̸��� ������ �ܾ��̱⿡ String������ ����
//������ �ִ� ���� 1������ 12���̹Ƿ� 0 �����̰ų� 13 �̻��� ������ �Է¹����� 
//�ٽ� �Է��� �� �ֵ��� do-while�� ���,
//�׸��� �� ������ ���� ������ ����� �� �ֵ��� switch�� ���
//*************************************************************

public class season {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw3_1: ������");
		
		Scanner sc = new Scanner(System.in);
		int month;
		String season = "";
		
		do{
			System.out.print("12���� �� ���ϴ� ���� �Է��Ͻÿ� [1-12]:");
			month = sc.nextInt();
		}while(month < 1 || month > 12);
		
		switch(month) {
		case 1: season = "�ܿ�"; break;
		case 2: season = "�ܿ�"; break;
		case 3: season = "��"; break;
		case 4: season = "��"; break;
		case 5: season = "��"; break;
		case 6: season = "����"; break;
		case 7: season = "����"; break;
		case 8: season = "����"; break;
		case 9: season = "����"; break;
		case 10: season = "����"; break;
		case 11: season = "����"; break;
		case 12: season = "�ܿ�"; break;
		}
		
		System.out.print(month + "���� " + season + "�Դϴ�.");

	}

}
