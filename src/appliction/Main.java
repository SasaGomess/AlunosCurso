package appliction;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


import entities.Curso;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Curso> aluno1 = new HashSet<>();
		Set<Curso> aluno2 = new HashSet<>();
		Set<Curso> aluno3 = new HashSet<>();

		System.out.println("--Welcome to teacher Alex courses path---");
		System.out.println("------------------------------------------");
		System.out.print("How many students for Database course?");
		Integer nA = sc.nextInt();
		
		for(int i = 0; i < nA;i++) {
			System.out.print("Nome do aluno: ");
			String nome = sc.next();
			System.out.print("Código Único: ");
			Integer result = sc.nextInt();
			aluno1.add(new Curso(result, nome));
		}
		
		System.out.print("How many students for IA course?");
		Integer nB = sc.nextInt();
		
		for(int i = 0; i < nB;i++) {
			System.out.print("Nome do aluno: ");
			String nome = sc.next();
			System.out.print("Código Único: ");
			Integer result = sc.nextInt();
			aluno2.add(new Curso(result, nome));
		}
		
		System.out.print("How many students for Programming course?");
		Integer nC = sc.nextInt();
		
		for(int i = 0; i < nC;i++) {
			System.out.print("Nome do aluno: ");
			String nome = sc.next();
			System.out.print("Código Único: ");
			Integer result = sc.nextInt();
			aluno3.add(new Curso(result, nome));
		}
		
		Set<Curso> total = new HashSet<>(aluno1);
		
		total.addAll(aluno2);
		total.addAll(aluno3);
		
		System.out.println("Total Students: " + total.size());
		sc.close();
	}

}
