#include<stdio.h>
#include<math.h>
#include<conio.h>
void tip()//计算公式和一些变量的介绍
{
    printf("复利计算软件\n");
    printf("    复利计算公式:F=P*pow((1+i/m),N*m)\n");
    printf("    单利计算公式:F=P+P*N*i\n");
	printf("    等额投资公式:F=P*12*(1+i)*(pow(1+i,N)-1)/i\n");
    printf("\tF:复利终值|年金终值\n");
    printf("\tP:本金\n");
    printf("\ti:利率\n");
    printf("\tN：利率获取时间的整数倍\n");
    printf("\tm:年复利次数(一年当中的滚利次数)\n");
}
void menu()//菜单
{
    printf("\t\t|-----------------------------------|\n");
    printf("\t\t|             welcome               |\n");
    printf("\t\t|-----------------------------------|\n");
    printf("\t\t|           1:计算本金              |\n");
    printf("\t\t|           2:计算年复利终值        |\n");
    printf("\t\t|           3:单利计算              |\n");
    printf("\t\t|           4:计算年份              |\n");
    printf("\t\t|           5:计算年利率            |\n");
    printf("\t\t|           6:等额定投(年|月)       |\n");
    printf("\t\t|           7:等额还款              |\n");
    printf("\t\t|           0:结束                  |\n");
    printf("\t\t|-----------------------------------|\n");
    printf("请输入你要选择的功能(0~7):");
    
}
void benjin()//计算本金
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
void fuli()//计算复利终值
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
void danli()//单利计算
{
    int N;
    double i,F,P;
    printf("存入本金:");
    scanf("%lf",&P);
    printf("年利率:");
    scanf("%lf",&i);
    printf("存入年限:");
    scanf("%d",&N);
    F=P+P*N*i;
    printf("本息和为:%.4lf\n",F);
}
void years()//求年份
{
    int N,m;
    double i,F,P;
    printf("复利终值:");
    scanf("%lf",&F);
    printf("存入本金:");
    scanf("%lf",&P);
    printf("年利率:");
    scanf("%lf",&i);
    printf("年复利次数:");
    scanf("%d",&m);
    N=(int)(log(F/P)/log(1+i/m)/m);
    printf("从%.4lf到%.4lf需要%d年\n",P,F,N);
}
void annual_int_rate()//计算年利率
{
    int N,m;
    double i,F,P;
    printf("复利终值:");
    scanf("%lf",&F);
    printf("存入本金:");
    scanf("%lf",&P);
    printf("存入年限:");
    scanf("%d",&N);
    printf("年复利次数:");
    scanf("%d",&m);
    i=m*(pow(F/P,1.0/(N*m))-1);
    printf("从%.4lf到%.4lf需要%.4lf\n",P,F,i);
}
void YM_Equal_cast_final()//计算等额投资
{
    int N,n;
    double i,F,P;
    printf("存入本金:");
    scanf("%lf",&P);
    printf("存入年限:");
    scanf("%d",&N);
    printf("年利率:");
    scanf("%lf",&i);
    printf("\t\t1:按年投资\n\t\t2:按月投资\n");
A:printf("请选择你要的功能<1|2>:");
  scanf("%d",&n);
  if(n==1)
  {
      F=P*(pow(1+i,N)-1)/i;
      
  }
  else if(n==2)
  {
      F=P*12*(1+i)*(pow(1+i,N)-1)/i;
  }
  else
  {
      printf("输入有误!请重新输入\n");
      goto A;
  }
  printf("%d年后的总产值:%.4lf\n",N,F);
  
}
void Average_capital_plus_interest()//等额还款
{
    int N;
    double i,F,P;
    printf("贷款金额:");
    scanf("%lf",&F);
    printf("存入年限:");
    scanf("%d",&N);
    printf("年利率:");
    scanf("%lf",&i);
    P=F*i/(12*(1+i)*(pow(1+i,N)-1));
    printf("贷款%.4lf每月需要还款%.4lf\n",F,P);
}
void main()
{
    int n;
    while(1)
    {
        tip();
        menu();
B:scanf("%d",&n);
  if(n>=0&&n<=7)
  {
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
      case 4:
          years();break;
      case 5:
          annual_int_rate();break;
      case 6:
          YM_Equal_cast_final();break;
      case 7:
          Average_capital_plus_interest();break;
      case 0:n=0;break;    
          
      }
  }
  else
  {
      printf("输入超出范围，请重新输入:");
      goto B;
  }
  getch();
    }
}