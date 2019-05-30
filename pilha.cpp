#include <iostream>
using namespace std;
const int MAXTAM=6;

class Tipopilha // Classe Fila com vetor
{
private:
	int Item [MAXTAM];
	int inicio, topo, Quantos;
	
public:
	Tipopilha ();
	int Vazia ();
	int Cheia ();
	int Tamanho ();
	void Enpilhar (int Elemento); // no fim
	void Desenpilhar(int Elemento); // do inicio
}; // fim classe TipoFila

Tipopilha :: Tipopilha () //construtor padrâ€žo
{ inicio = topo = Quantos = 0; }
//**********************************************
int Tipopilha :: Vazia ()
{ return (Quantos == 0); }
//**********************************************
int Tipopilha :: Cheia ()
{ return (Quantos == MAXTAM); }
//**********************************************
int Tipopilha :: Tamanho()
{ return (Quantos); }
//**********************************************
void Tipopilha :: Enpilhar(int Elemento)
{
	if (Cheia ( ))
		cout << "pilha cheia. \n";
	else {
		Item [topo] = Elemento;
		cout<< "Elemento " <<Item [topo] << " Na fila!!! \n";
		Quantos++;
		topo++;
	 
	}
	
    system("pause");
	
    return;
}
//**********************************************
void Tipopilha :: Desenpilhar(int Elemento)
{
	
	if (Vazia( ))
		cout<< "pilha vazia. \n";	
	else {
		--Quantos;
	    --topo;
		Elemento = Item [topo];
		cout<<"Elemento "<<Item[topo]<<" removido!!!\n";
	}
	
	system("pause");
}


int main(){
    int n, i;
    Tipopilha s;
	int x, op;
	
    
	do {
		system("cls");
		cout << "\t\t\tpilha estÃ¡tica"
		<<"\n\nDigite Opcao: "
		<<"\n\n1 - Enpilhar"
		<<"\n\n2 - Desenpilhar";
		cin>>op;
		if (op==1) {
			cout << "Digite itema ser inserido na pilha: " ;
			cin>>x;
			cout << "======================";
			s.Enpilhar(x);
		}
		if (op==2) {
			s.Desenpilhar(i);
		}
	} while (op == 1 || op ==2  );
	
    system("pause");
    return 0;
}
