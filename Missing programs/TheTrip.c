/*
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1078
*/
#include<stdio.h>
int main(){
	int n,i;
	
	while(1){
		double total=0,difference=0,positiveDifference=0,negativeDifference=0,equilizedAmount,amount[100],exchange;
		scanf("%d",&n);
		if(n==0){
			break;
		}
		for(i=0;i<n;i++){
			scanf("%lf",&amount[i]);
			total+=amount[i];
		}
		equilizedAmount=total/(double)n;
		printf("\n%lf\n",equilizedAmount);
		for(i=0;i<n;i++){
			difference=((equilizedAmount-amount[i])*100)/100;
			if(difference<0){
				negativeDifference+=difference;
			}else{
				positiveDifference+=difference;
			}
		}
		if(-negativeDifference>positiveDifference){
			exchange=-negativeDifference;
		}else{
			exchange=positiveDifference;
		}
		printf("%lf\n",exchange);
	}
	
}
