#include <iostream>
using namespace std;

float fat(float num){

if((num==0) || (num==1)) {
	
return 1;
 
	} 
else {
	
	return num * fat(num-1);
	
	}
}


int main () {
int num;

cout<<"Calculo fatorial !"<<endl;
cout<<"Digite um numero: ";
cin>>num;

cout<<fat(num)<<endl;;

system("pause");
return(0);
}
