#include<stdio.h>

int main(void)
{
	double present_index, highest_index, lowest_index, later_index;
	int deposit_period;
	printf("*** 지수연동예금 KOSPI200 양방향형 이율 계산기 ***\n");

	printf("현재 KOSPI200 지수:");
	scanf("%lf", &present_index);

	if(present_index < 0)
	{
		printf("현재 KOSPI200 지수를 다시 입력하세요\n");
		printf("현재 KOPSI200 지수:");
		scanf("%lf", &present_index);
	}

	printf("향후 1.5년내 최고 KOSPI200 지수:");
	scanf("%lf", &highest_index);

	printf("향후 1.5년내 최저 KOSPI200 지수:");
	scanf("%lf", &lowest_index);

	if(highest_index < lowest_index || highest_index < 0 || lowest_index < 0)
	{
		printf("최고 KOSPI 200 지수와 최저 KOSPI200 지수를 다시 입력하세요\n");
		printf("최고 KOSPI 200 지수:");
		scanf("%lf", &highest_index);
		printf("최저 KOSPI 200 지수:");
		scanf("%lf", &lowest_index);
	}

	printf("1.5년 후 KOSPI200 지수:");
	scanf("%lf", &later_index);

	if(later_index <0 || later_index > highest_index || later_index < lowest_index)
	{
		printf("1.5년 후 KOSPI200 지수를 다시 입력하세요\n");
		printf("1.5년 후 KOSPI200 지수:");
		scanf("%lf", &later_index);
	}

	printf("예치기간(18개월 이하):");
	scanf("%d", &deposit_period);

	if (deposit_period < 0)
	{
		printf("예치기간을 다시 입력해주세요\n");
		printf("예치기간(18개월 이하):");
		scanf("%d", &deposit_period);
	}

	if (deposit_period >= 0 && deposit_period < 3)
		printf("예상 이율은 -1.39%% 입니다\n");
	else if (deposit_period >= 3 && deposit_period < 6)
		printf("예상 이율은 -1.23%% 입니다\n");
	else if (deposit_period >= 6 && deposit_period < 9)
		printf("예상 이율은 -1.11%% 입니다\n");
	else if (deposit_period >= 9 && deposit_period < 12)
		printf("예상 이율은 -0.98%% 입니다\n");
	else if (deposit_period >= 12 && deposit_period < 15)
		printf("예상 이율은 -0.86%% 입니다\n");
	else if (deposit_period >= 15 && deposit_period < 18)
		printf("예상 이율은 -0.73%% 입니다\n");
	else
		if ((present_index / 100 * 115) < highest_index || (present_index / 100 * 85) > lowest_index)
			printf("예상 이율은 1.00%% 입니다\n");
		else if (later_index > present_index)
			printf("예상 이율은 %.2f%% 입니다\n", 1.00 + (later_index / present_index * 100 - 100) * 0.41);
		else
			printf("예상 이율은 %.2f%% 입니다\n", 1.00 + (later_index / present_index * 100 - 100) * -0.41);

	return 0;
}