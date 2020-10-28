
public class MyMain {
     public static void main(String[] args) {
    	 Doutor d=new Doutor();
		 Mestre m=new Mestre();
		 Pessoa p=new Pessoa();
    	 m.setNome("monster");
		 d.setNome("batata");
		 p.setNome("Luiz");
    	 System.out.println(m.getNome());
		 System.out.println(d.getNome());
		 System.out.print(p.getNome());
     }
}
