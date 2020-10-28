package src;
public class MyMain {
     public static void main(String[] args) {
    	 Doutor d=new Doutor();
		 Mestre m=new Mestre();
		 Pessoa p=new Pessoa();
    	 m.setNome("monster");
		 d.setNome("batata");
		 p.setNome("Luiz");
		 Animal[] vetor= new Animal[5];
		 vetor[0]= new Cachorro();
		 vetor[1]= new Gato();
		 vetor[2]= new Lobo();
		 vetor[3]= new Leao();

    	 System.out.println(m.getNome());
		 System.out.println(d.getNome());
		 System.out.print(p.getNome());
     }
}
