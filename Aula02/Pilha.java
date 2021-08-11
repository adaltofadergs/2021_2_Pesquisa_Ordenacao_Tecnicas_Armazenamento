package Aula02;
public class Pilha {

	No topo;
	int tamanho;

	public Pilha( ){
		topo = null;
		tamanho = 0;
	}

	public void adicionar(String valor){
		No no = new No( valor );
		if( this.topo == null ){
			this.topo = no;
		}else{
			no.proximo = this.topo;
			this.topo = no;
		}
		this.tamanho++; 
	}

	public void imprimir(){
		if( this.topo == null ){
			System.out.println("Pilha está vazia");
		}else{
			No aux = this.topo;
			while( aux != null ){
				System.out.println( aux.dado );
				aux = aux.proximo;
			}
			System.out.println("-----------\nTotal: " + this.tamanho +"\n-----------\n\n");
		}
	}

	public void remover(){
		if( this.tamanho == 0){
			System.out.println("Pilha está vazia");
		}else if( this.tamanho == 1 ){
			this.topo = null;
			this.tamanho = 0;
		}else{
			this.topo = this.topo.proximo;
			this.tamanho--;
		}
		this.imprimir();
	}

	
	
}
