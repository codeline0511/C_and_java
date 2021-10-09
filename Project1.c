#include<stdio.h>

int main(void)
{
	double present_index, highest_index, lowest_index, later_index;
	int deposit_period;
	printf("*** ������������ KOSPI200 ������� ���� ���� ***\n");

	printf("���� KOSPI200 ����:");
	scanf("%lf", &present_index);

	if(present_index < 0)
	{
		printf("���� KOSPI200 ������ �ٽ� �Է��ϼ���\n");
		printf("���� KOPSI200 ����:");
		scanf("%lf", &present_index);
	}

	printf("���� 1.5�⳻ �ְ� KOSPI200 ����:");
	scanf("%lf", &highest_index);

	printf("���� 1.5�⳻ ���� KOSPI200 ����:");
	scanf("%lf", &lowest_index);

	if(highest_index < lowest_index || highest_index < 0 || lowest_index < 0)
	{
		printf("�ְ� KOSPI 200 ������ ���� KOSPI200 ������ �ٽ� �Է��ϼ���\n");
		printf("�ְ� KOSPI 200 ����:");
		scanf("%lf", &highest_index);
		printf("���� KOSPI 200 ����:");
		scanf("%lf", &lowest_index);
	}

	printf("1.5�� �� KOSPI200 ����:");
	scanf("%lf", &later_index);

	if(later_index <0 || later_index > highest_index || later_index < lowest_index)
	{
		printf("1.5�� �� KOSPI200 ������ �ٽ� �Է��ϼ���\n");
		printf("1.5�� �� KOSPI200 ����:");
		scanf("%lf", &later_index);
	}

	printf("��ġ�Ⱓ(18���� ����):");
	scanf("%d", &deposit_period);

	if (deposit_period < 0)
	{
		printf("��ġ�Ⱓ�� �ٽ� �Է����ּ���\n");
		printf("��ġ�Ⱓ(18���� ����):");
		scanf("%d", &deposit_period);
	}

	if (deposit_period >= 0 && deposit_period < 3)
		printf("���� ������ -1.39%% �Դϴ�\n");
	else if (deposit_period >= 3 && deposit_period < 6)
		printf("���� ������ -1.23%% �Դϴ�\n");
	else if (deposit_period >= 6 && deposit_period < 9)
		printf("���� ������ -1.11%% �Դϴ�\n");
	else if (deposit_period >= 9 && deposit_period < 12)
		printf("���� ������ -0.98%% �Դϴ�\n");
	else if (deposit_period >= 12 && deposit_period < 15)
		printf("���� ������ -0.86%% �Դϴ�\n");
	else if (deposit_period >= 15 && deposit_period < 18)
		printf("���� ������ -0.73%% �Դϴ�\n");
	else
		if ((present_index / 100 * 115) < highest_index || (present_index / 100 * 85) > lowest_index)
			printf("���� ������ 1.00%% �Դϴ�\n");
		else if (later_index > present_index)
			printf("���� ������ %.2f%% �Դϴ�\n", 1.00 + (later_index / present_index * 100 - 100) * 0.41);
		else
			printf("���� ������ %.2f%% �Դϴ�\n", 1.00 + (later_index / present_index * 100 - 100) * -0.41);

	return 0;
}