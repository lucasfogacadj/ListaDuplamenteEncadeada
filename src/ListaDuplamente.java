
public class ListaDuplamente {
	
	Elemento inicio;
	Elemento fim;
	int qtd;
	
	
	public boolean addInicio(Elemento e){
		if(this.inicio == null){
			this.inicio = e;
			this.fim = e;
			qtd++;
			return true;
		}else{
			inicio.anterior = e;
			e.proximo = inicio;
			inicio = e;
			this.qtd++;
			return true;
		}
	}
	
	public boolean addFim(Elemento e){
		if(this.inicio == null){
			System.out.println("Lista vazia");
			return this.addInicio(e);
		}else{
			fim.proximo = e;
			e.anterior = fim;
			fim = e;
			this.qtd++;
			return true;
		}

	}
	

	
	public boolean addemX(Elemento E, int p){
		Elemento novo = E;
		Elemento aux = this.inicio;
		
		if(p==0){
			this.addInicio(E);
		}
		else if(p==(qtd-1)){
			this.addFim(E);
		}
		else if(p<qtd){
			this.addInicio(E);
			System.out.println("Posição não existente, foi adicionado no inicio");
		}else{
			for (int i=0; i<p; i++){
				aux = aux.proximo;
			}
			novo.anterior = aux.anterior;
			novo.proximo = aux;
			aux.anterior = novo;
		}
		return false;
	}
	
	public boolean removeInicio(){
		if(this.inicio == null){
			System.out.println("Lista Vazia");
		}else{
			this.inicio = this.inicio.proximo;
			qtd--;
		}
		
		return false;
	}
	
	public boolean removeFim(){
		if(this.inicio == null){
			System.out.println("Lista Vazia");
		}if (this.inicio==this.fim){
			this.inicio=null;
			this.fim=null;
			qtd--;
		}else{
			Elemento aux, pen;
			aux=this.inicio;
			pen=aux;
			while(aux!=null){
				pen = aux;
				aux = pen.proximo;
			}
			pen.proximo=null;
			this.fim = pen;
			qtd--;
		}
		
		return false;
	}
	
	public boolean listaAsc(){
		
		return false;
	}
	
	public boolean listaDesc(){
		return false;
	}
	
	public boolean removerEmX(int p){
		Elemento aux = this.inicio;
		Elemento anterior = null;
		
		if(p==0){
			this.removeInicio();
			}
		else if(p==(qtd-1)){
			this.removeFim();
		}else{
			for(int i=0; i<p; i ++){
				anterior = aux;
				aux = aux.proximo;
			}
			qtd--;
		}
		
		return false;
	}


}
