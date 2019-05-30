#include <iostream>
#define TAM 10
using namespace std;

class Fila{
	private:
		int filaVetor[TAM];
		int frente=0, quantos=0;
		int  traz=0;
	public:
	bool FilaVazia();
	bool FilaCheia();
	int Enfileirar(int &elemento);
	int Desenfileirar(int &elemento);
		
};
bool Fila :: FilaVazia(){
	if(frente>traz){
		return true;
	}else{
		return false;
	}
}

bool Fila ::  FilaCheia(){
	if(traz==TAM-1){
		return true;
	}else{
		return false;
	}
}
	
int Fila :: Enfileirar(int &elemento){
	if(FilaCheia()){
		return false;
	}else{
		traz++;
		FilaVetor[traz]=valor;
		return true;
	}
}

int Fila :: Desenfileirar(int &elemento){
	if(FilaVazia){
		return false;
	}else{
		FilaVetor[frente]=valor;
		frente++;
		return true;
	}
}

int main () {

system("pause");
return(0);
}
