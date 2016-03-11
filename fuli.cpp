#include<stdio.h>
#include<math.h>
#include<conio.h>
void tip()
{
     printf("复利计算软件\n");
     printf("    复利计算公式\n");
     printf("\tF=P*pow((1+i/m),N*m)\n");
     printf("    本金计算公式\n");
     printf("\tP=F/pow((1+i/m),N*m)\n");
     printf("    单利计算公式\n");
     printf("\tL=P*N*i\n\tH=L+P\n");
     printf("\tF:复利终值\n");
     printf("\tP:本金\n");
     printf("\ti:利率\n");
     printf("\tH:本利和\n");
     printf("\tN：利率获取时间的整数倍\n");
     printf("\tm:年复利次数(一年当中的滚利次数)\n");
}
void menu()
{
	   printf("\t\t|--------------*welcome*------------|\n");
	   printf("\t\t|           1:计算本金              |\n");
	   printf("\t\t|           2:计算年复利终值        |\n");
	   printf("\t\t|           3:单利计算              |\n");
	   printf("\t\t|           0:结束                  |\n");
	   printf("\t\t|-----------------------------------|\n");
	   printf("请输入你要选择的功能(0~3):\n");

}

void benjin()
{
     int N,m;
     double i,F,P;
     printf("复利终值:");
     scanf("%lf",&F);
     printf("年利率:");
     scanf("%lf",&i);
     printf("存入年限:");
     scanf("%d",&N);
     printf("年复利次数:");
     scanf("%d",&m);
     P=F/pow((1+i/m),N*m);
     printf("年复利终值为%.4lf需要本金为:%.4lf\n",F,P);
}
void fuli()
{
     int N,m;
     double i,F,P;
     printf("存入本金:");
     scanf("%lf",&P);
     printf("年利率:");
     scanf("%lf",&i);
     printf("存入年限:");
     scanf("%d",&N);
     printf("年复利次数:");
     scanf("%d",&m);
     F=P*pow((1+i/m),N*m);
     printf("复利终值:%.4lf\n",F);
 }
 void danli()
 {
     int N;
     double i,H,P,L;
     printf("存入本金:");
     scanf("%lf",&P);
     printf("年利率:");
     scanf("%lf",&i);
     printf("存入年限:");
     scanf("%d",&N);
     L=P*N*i;
     H=L+P;
     printf("本息和为:%.4lf\n",H);
}
 
void main()
{
     int n;
     while(1)
     {
		 tip();
		 menu();
	     scanf("%d",&n);
         if(n==0)
             break;
         switch(n)
         {
            case 1:
                benjin();break;
            case 2:
                fuli();break;
            case 3:
                 danli();break;
            case 0:n=0;break;    
         }
		  getch();
     }
}