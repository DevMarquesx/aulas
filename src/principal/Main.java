package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Cachorro: ");
	   Cachorro animal =  new Cachorro();
        animal.fazerSom();
        animal.cor();
        System.out.print("\nGato: ");
        Gato gato = new Gato();  
        gato.fazerSom();
        gato.cor();
        System.out.print("\nVaca: ");
        Vaca vaca = new Vaca();
        vaca.fazerSom();
        vaca.cor();
        
    }

	}