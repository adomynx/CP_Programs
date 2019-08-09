#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<dos.h>
int main()
{
  int gd=DETECT,gm;
  int x=0,y=0,ch;
  initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
  gotoxy(50,50);
  while(ch!=27)
   {
     ch=getch();
     switch(ch)
	{
	   case 77:
		   x=x+1;
		   putpixel(x,y,RED);
		   break;
	   case 80: y=y+1;
		    putpixel(x,y,YELLOW);
		    break;
	   case 75: x=x-1;
		    putpixel(x,y,GREEN);
		    break;
	   case 72: y=y-1;
		    putpixel(x,y,BLUE);
		    break;

	}
  }
  getch();
  return 0;
}
