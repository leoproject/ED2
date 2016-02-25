package Aula4;


import java.io.IOException;
import java.util.Random;

public class TesteManipulador {

	public static void main(String[] args) throws IOException {
		//IFileOrganizer arg = new ManipuladorSimples ("/home/aluno/Desktop/aluno.db");
		IFileOrganizer arg2 = new ManipuladorSequencial("/home/aluno/Desktop/aluno.db");
		
		Aluno d = new Aluno(2,"eurique","Rua Aaa",(short)27,"F","a@a.com.br");
	    Aluno c = new Aluno(20000,"silvio","rua a",(short)24,"M","b@b.com.br");
	    Aluno e = new Aluno(5,"silva#","rua a",(short)24,"M","b@b.com.br");	
		/*arg2.addReg(a);
		arg2.addReg(d);
		arg2.addReg(c);*/
	    
	    Random gerador = new Random();
	    long ini = System.currentTimeMillis();
	    
	    for (int i=1 ; i<=10000;i++){
	    	Aluno a = new Aluno(i, "Aluno"+i, "Rua "+i, (short)19, "F", "aluno"+i+"@ufs.br");
	        arg2.addReg(a);
	    }
	     long fim = System.currentTimeMillis();
	    
	  /*  for (int j = 1 ; j <= 1000; j++) {
	    	arg2.getRegBin(gerador.nextInt(10000)+1);
	    }
	    
	    long fim = System.currentTimeMillis();
	    */
	    long total=(fim-ini);
	    System.out.println(total);
	    
	    int minutes = (int) ((total / (1000*60)) % 60);
	    System.out.println(minutes);
	    
	    System.out.println(total/1000.0);
		
		/*
		Aluno b = arg.getReg(7000);
		System.out.println(b.getMatricula());
		System.out.println(b.getNome());
		System.out.println(b.getSexo());
		System.out.println(b.getIdade());
		arg.delReg(2022);
		*/

	}

}
