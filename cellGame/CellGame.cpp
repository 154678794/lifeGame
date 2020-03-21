#include<iostream>
using namespace std;
#include<graphics.h>

int cellNum[50][50]={0};
IMAGE cellLive,cellDie;

//初始化窗口图片
void init()
{
	initgraph(1450, 1450);
	loadimage(&cellLive, _T("image/cellLive.png"));
	loadimage(&cellDie, _T("image/cellDie.png"));
	for(int i=0;i<50;i++)
	{
		for(int j=0;j<50;j++)
		{
			if(cellNum[i][j]==0)
			{
				putimage(j*29,i*29,&cellDie);
			}
			else
			{
				putimage(j*29,i*29,&cellLive);
			}
		}
	}
}

//判断细胞死亡还是存活
void checkLive(int Flag,int I,int J)
{
	if(Flag==3)
	{
		cellNum[I][J]=1;
		putimage(J*29,I*29,&cellLive);
	}
	else if(Flag!=2)
	{
		cellNum[I][J]=0;
		putimage(J*29,I*29,&cellDie);
	}
}
//扫描每一个
void cellLife()
{
	for(int i=0;i<50;i++)
	{
		for(int j=0;j<50;j++)
		{
			int flag=0;
			int cellFlag[8]={
				cellNum[i][j-1],
				cellNum[i][j+1],
				cellNum[i-1][j+1],
				cellNum[i-1][j],
				cellNum[i-1][j-1],
				cellNum[i+1][j+1],
				cellNum[i+1][j],
				cellNum[i+1][j-1]
			};
			for(int k=0;k<8;k++)
			{
				if(cellFlag[k]==1)
				{
					flag++;
				}
			}
			checkLive(flag,i,j);
		}
	}
}

//鼠标点击细胞存活
void OnMouse()
{
	MOUSEMSG m;
	m=GetMouseMsg();
	if(m.uMsg==WM_LBUTTONDOWN)
	{
		
		cellNum[15][15]=1;
		putimage(15*29,15*29,&cellLive);
	}
}

void main()
{
	cellNum[3][3]=1;
	cellNum[4][2]=1;
	cellNum[5][2]=1;
	cellNum[4][4]=1;
	cellNum[5][4]=1;
	cellNum[6][3]=1;
	cellNum[6][2]=1;
	cellNum[3][4]=1;
	cellNum[4][3]=1;
	cellNum[5][4]=1;
	cellNum[4][5]=1;
	cellNum[5][5]=1;
	cellNum[6][4]=1;
	cellNum[6][5]=1;
	init();
	while(1)
	{
		OnMouse();
		Sleep(1000);
		cellLife();
	}
    while(1);
}