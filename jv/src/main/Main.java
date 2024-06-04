package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char rep = 's';
		
		System.out.println("Bem vindo ao curso de algoritmos e logicas de programação completo!");
		
		while (rep == 's' || rep == 'S') {
		
			int respx = 0;
			System.out.println();
			
			System.out.println("Qual Capítulo deseja acessar? ");
			System.out.println("(1) = Estrutura sequencial");
			System.out.println("(2) = Estrutura condicional");
			System.out.println("(3) = Estrutura repetitivas");
			System.out.println("(4) = Vetores");
			System.out.println("(5) = Matrizes");
			System.out.println();
			
			
			System.out.print("Capítulo: ");
			int caps = sc.nextInt();
			if (caps < 1 || caps > 5) {
				System.out.println();
			}	
			
			while (caps < 1 || caps > 5) {
				System.out.print("Capítulo invalido, Tente novamente: ");
				caps = sc.nextInt();
			}
			
		    
		    
		    switch (caps) {
		    	case 1: 
		    		System.out.println("Capítulo selecionado: (1) = Estrutura sequencial" );
		    		break;
		    	case 2:
		    		System.out.println("Capítulo selecionado: (2) = Estrutura condicional" );
		    		break;
		    	case 3:
		    		System.out.println("Capítulo selecionado: (3) = Estrutura repetitivas" );
		    		break;
		    	case 4:
		    		System.out.println("Capitulo selecionado: (4) = Vetores");
		    		break;
		    	case 5:
		    		System.out.println("Capitulo selecionado: (5) = Matrizes");	
		    }
			
			System.out.println();
			System.out.println("Problemas do capítulo " + caps + ": ");
		    switch (caps) {
				case 1: 
					System.out.println("(1) = Terreno");
					System.out.println("(2) = Retangulo");
					System.out.println("(3) = Idades");
					System.out.println("(4) = Soma");
					System.out.println("(5) = Troco");
					System.out.println("(6) = Circulo");
					System.out.println("(7) = Pagamento");
					System.out.println("(8) = Consumo");
					System.out.println("(9) = Medidas");
					System.out.println("(10) = Duração");
				    break;
				case 2:
					System.out.println("(1) = Notas");
					System.out.println("(2) = Baskara");
					System.out.println("(3) = Menor de três");
					System.out.println("(4) = Operadora");
					System.out.println("(5) = Troco verificado");
					System.out.println("(6) = Glicose");
					System.out.println("(7) = Dardo");
					System.out.println("(8) = Temperatura");
					System.out.println("(9) = Lanchonete");
					System.out.println("(10) = Multiplos");
					System.out.println("(11) = Aumento");
					System.out.println("(12) = Tempo de jogo");
					System.out.println("(13) = Coordenadas");
					break;
				case 3:
					System.out.println("(1) = Crescente");
					System.out.println("(2) = Media idades");
					System.out.println("(3) = Senha fixa");
					System.out.println("(4) = Quadrante");
					System.out.println("(5) = Validação de nota");
					System.out.println("(6) = Combustivel");
					System.out.println("(7) = Pares consecutivos");
					System.out.println("(8) = Tabuada");
					System.out.println("(9) = Soma impares");	
					System.out.println("(10) = Dentro ou fora");
					System.out.println("(11) = Par ou impar");
					System.out.println("(12) = Média ponderada");
					System.out.println("(13) = Divisão");
					System.out.println("(14) = Fatorial");
					System.out.println("(15) = Experiencias");
					System.out.println("(16) = Sequencia impares");
					break;
				case 4: 
					System.out.println("(1) = Negativos");
					System.out.println("(2) = Soma vetor");
					System.out.println("(3) = Alturas");
					System.out.println("(4) = Números Pares");
					System.out.println("(5) = Maior posição");
					System.out.println("(6) = Soma vetores");
					System.out.println("(7) = Abaixo");
					System.out.println("(8) = Média pares");
					System.out.println("(9) = Mais velho");
					System.out.println("(10) = Aprovados");
					System.out.println("(11) = Dados pessoais");
					System.out.println("(12) = Comerciante");
					break;
				case 5:
					System.out.println("(1) = Diagonal negativos");
					System.out.println("(2) = Soma linhas");
					System.out.println("(3) = Negativos matriz");
					System.out.println("(4) = Cada linha");
					System.out.println("(5) = Soma matrizes");
					System.out.println("(6) = Acima diagonal");
					System.out.println("(7) = Matriz geral");
					break;
			}
			
		    System.out.println();
	
		    int pros;
		    
		    switch (caps) {
		    	case 1:
		    		System.out.print("Selecione um problema: ");
		    		pros = sc.nextInt();
		    		switch (pros) {
		    			case 1:
		    				System.out.println("Problema selecionado: Terreno");
		    				System.out.println("");
		    				
			    				System.out.print("Digite a largura do terreno: ");
			    				double largura = sc.nextDouble();
			    				System.out.print("Digite o comprimento do terreno: ");
			    				double comprimento = sc.nextDouble();
			    				System.out.print("Digite o valor do metro Quadrado: ");
			    				double metroQ = sc.nextDouble();
			    				
			    				double areaT = largura * comprimento;
			    				double preco = areaT * metroQ;
			    				
			    				System.out.println("Área do terreno = " + String.format("%.2f", areaT));
			    				System.out.println("Preço do terreno = " + String.format("%.2f", preco));
			    				respx += 1;
			    				
		    				break;
		    			case 2:	
		    				System.out.println("Problema selecionado: Retangulo");
		    				System.out.println("");
		    				
			    				System.out.print("Base do retangulo: ");
			    				double base = sc.nextDouble();
			    				System.out.print("Altura do retangulo: ");
			    				double altura = sc.nextDouble();
			    				
			    				double areart = base * altura;
			    				double perimetro = (base + altura) * 2;
			    				double diagonal = Math.sqrt(Math.pow(altura, 2.0) + Math.pow(base, 2.0));
			    				
			    				System.out.println("Area = " + String.format("%.4f", areart));
			    				System.out.println("Perimetro = " + String.format("%.4f", perimetro));
			    				System.out.println("Diagonal = " + String.format("%.4f", diagonal));
			    				respx += 1;
			    				
		    				break;
		    			case 3: 
		    				System.out.println("Problema selecionado: idades");
		    				System.out.println("");
		    				
			    				
		    					System.out.println("Dados da primeira pessoa: ");
		    					if (respx != 0) {
		    						sc.nextLine();
		    						respx = 0;
		    					}
			    				System.out.print("nome: ");
			    				String id_nome1 = sc.nextLine();
			    				System.out.print("idade: ");
			    				int id_idade1 = sc.nextInt();
			    				
			    				System.out.println("Dados da segunda pessoa: ");
			    				System.out.print("nome: ");
			    				sc.nextLine();
			    				String id_nome2 = sc.nextLine();
			    				System.out.print("idade: ");
			    				int id_idade2 = sc.nextInt();
			    				
			    				int id_media = (id_idade1 + id_idade2) / 2; 
			    				
			    				System.out.println("A idade media de " + id_nome1 + " e " + id_nome2 + 
			    						" é de " + id_media + " Anos.");
		    				
		    				break;
		    			case 4: 
		    				System.out.println("Problema selecionado: Soma");
		    				System.out.println("");
		    				
			    				System.out.print("Digite o valor de x: ");
			    				int sm_x = sc.nextInt();
			    				System.out.print("Digite o valor de y: ");
			    				int sm_y = sc.nextInt();
			    				
			    				int sm_soma = sm_x + sm_y;
			    				
			    				System.out.println("Soma = " + sm_soma);
			    				respx += 1;
			    				
		    				break;
		    			case 5:
		    				System.out.println("Problema selecionado: Troco");
		    				System.out.println("");
		    				
			    				System.out.print("Preço unitario: ");
			    				double Tr_preco = sc.nextDouble();
			    				System.out.print("Quantidade comprada: ");
			    				int Tr_quantidade = sc.nextInt();
			    				System.out.print("Dinherio recebido: ");
			    				double Tr_dinheiro = sc.nextDouble();
			    				
			    				double Tr_troco = Tr_dinheiro - (Tr_preco * Tr_quantidade);
			    				
			    				System.out.println("Troco = " + String.format("%.2f", Tr_troco));
			    				respx += 1;
			    					
		    				break;
		    			case 6: 
		    				System.out.println("Problema selecionado: Circulo");
		    				System.out.println("");
		    				
			    				System.out.print("Digite o valor do raio do circulo: ");
			    				double Cr_raio = sc.nextDouble();
			    				
			    				double Cr_area = Math.PI * Math.pow(Cr_raio, 2.0);
			    				
			    				System.out.println("Area = " + String.format("%.4f", Cr_area));
			    				respx += 1;
			    				
		    				break;
		    			case 7: 
		    				System.out.println("Problema selecionado: Pagamento");
		    				System.out.println("");
		    				
			    				if (respx != 0) {
			    					sc.nextLine();
			    					respx = 0;
			    				}
		    				
			    				System.out.print("Nome: ");
			    				String Pg_nome = sc.nextLine();
			    				System.out.print("Valor por hora: ");
			    				double Pg_valorhora = sc.nextDouble();
			    				System.out.print("Horas trabalhadas: ");
			    				int Pg_horast = sc.nextInt();
			    				
			    				double Pg_salario = Pg_valorhora * Pg_horast;
			    				
			    				System.out.println("O pagamento para " + Pg_nome + " deve ser " + 
			    				String.format("%.2f", Pg_salario) + " Reais.");
		    				
		    				break;
		    			case 8:
		    				System.out.println("Problema selecionado: Consumo");
		    				System.out.println("");
		    				
			    				System.out.print("Distancia percorrida: ");
			    				int Cs_distancia = sc.nextInt();
			    				System.out.print("Combustivel gasto: ");
			    				double Cs_CombustivelG = sc.nextDouble();
			    				
			    				double Cs_consumomedio = Cs_distancia / Cs_CombustivelG;
			    				
			    				System.out.println("Consumo medio = " + String.format("%.3f", Cs_consumomedio));
			    				respx += 1;
			    				
		    				break;
		    			case 9:
		    				System.out.println("Problema selecionado: Medidas");
		    				System.out.println("");
		    				
			    				System.out.print("Digite a medida A: ");
			    				double Medida_a = sc.nextDouble();
			    				System.out.print("Digite a medida B: ");
			    				double Medida_b = sc.nextDouble();
			    				System.out.print("Digite a medida C: ");
			    				double Medida_c = sc.nextDouble();
			    				
			    				double Md_areaQ = Math.pow(Medida_a, 2.0);
			    				double Md_areaTG = Medida_a * Medida_b /2;
			    				double Md_areaTPZ = (Medida_a + Medida_b) * Medida_c /2;
			    				
			    				System.out.println("Area do quadrado = " + String.format("%.4f", Md_areaQ));
			    				System.out.println("Area do Triangulo = " + String.format("%.4f", Md_areaTG));
			    				System.out.println("Area do Trapezio = " + String.format("%.4f", Md_areaTPZ));
			    				respx += 1;
			    				
		    				break;
		    			case 10:
		    				System.out.println("Problema selecionado: Duração");
		    				System.out.println("");
		    				
			    				System.out.print("Digite a duração em segundos: ");
			    				int Dr_duracao = sc.nextInt();
			    				
			    			
			    			    int Dr_horas = Dr_duracao / 3600;
			    			    int Dr_resto = Dr_duracao % 3600;
			    			    int Dr_minutos = Dr_resto / 60; 
			    			    int Dr_segundos = Dr_resto % 60;
			    			    
			    			    System.out.println(Dr_horas + ":" + Dr_minutos + ":" + Dr_segundos);
			    			    respx += 1;
			    			    
		    			    break;	    
		    		}
		    		
		    		break;
		    	case 2:
		    		System.out.print("Selecione um problema: ");
		    		pros = sc.nextInt();
		    		switch (pros) {
		    			case 1:
		    				System.out.println("Problema selecionado: Notas");
		    				System.out.println("");
		    		
			    				System.out.print("Digite a primeira nota: ");	
			    				double Nt_Pnotas = sc.nextDouble();
			    				System.out.print("Digite a segunda nota: ");	
			    				double Nt_Snotas = sc.nextDouble();
			    				
			    				double Nt_notaF = Nt_Pnotas + Nt_Snotas;
			    				System.out.println("Nota final = " + Nt_notaF);
			    				
			    				if (Nt_notaF < 60) {
			    					System.out.println("Reprovado!");
			    				}
			    				else if (Nt_notaF > 60) {
			    					System.out.println("Aprovado!");
			    				}
			    				respx += 1;
			    					
		    				break;
		    			case 2: 
		    				System.out.println("Problema selecionado: Baskara");
		    				System.out.println("");

			    				System.out.print("Coeficiente A: ");
			    				double Bks_coeA = sc.nextDouble();
			    				System.out.print("Coeficiente B: ");
			    				double Bks_coeB = sc.nextDouble();
			    				System.out.print("Coeficiente C: ");
			    				double Bks_coeC = sc.nextDouble();
			    				
			    				double baskara_x1 = (Bks_coeB * -1) + Math.sqrt(Math.pow(Bks_coeB, 2.0) - 4 * Bks_coeA * Bks_coeC) / 2 * Bks_coeA; 
			    				double baskara_x2 = (Bks_coeB * -1) - Math.sqrt(Math.pow(Bks_coeB, 2.0) - 4 * Bks_coeA * Bks_coeC) / 2 * Bks_coeA;
			    				
			    				System.out.println("X1 = " + baskara_x1);
			    				System.out.println("X2 = " + baskara_x2);
			    				respx += 1;
			    				
			    					
		    				break;
		    			case 3:
		    				System.out.println("Problema selecionado: Menor de tres");
		    				System.out.println("");

		    				
			    				System.out.print("Primeiro valor: ");
			    				int Mt_Pvalor = sc.nextInt();
			    				System.out.print("Segundo valor: ");
			    				int Mt_Svalor = sc.nextInt();
			    				System.out.print("Terceiro valor: ");
			    				int Mt_Tvalor = sc.nextInt();
			    				
			    				int Mt_menor = 0;
			    				
			    				if (Mt_Pvalor < Mt_Svalor && Mt_Pvalor < Mt_Tvalor) {
			    					Mt_menor = Mt_Pvalor;
			    				}
			    				else if (Mt_Svalor < Mt_Pvalor && Mt_Svalor < Mt_Tvalor) {
			    					Mt_menor = Mt_Svalor;
			    				}
			    				else if (Mt_Tvalor < Mt_Pvalor && Mt_Tvalor < Mt_Svalor) {
			    					Mt_menor = Mt_Tvalor;
			    				}
			    				
			    				System.out.println("Menor = " + Mt_menor);
			    				respx += 1;
			    				
		    				break;
		    			case 4:	
		    				System.out.println("Problema selecionado: Operadora");
		    				System.out.println("");

			    				System.out.print("Digite a quantidade de minutos: ");
			    				int Op_Qminutos = sc.nextInt();
			    				
			    				int Op_valorpg = 0;
			    				
			    				if (Op_Qminutos <= 100) {
			    					Op_valorpg = 50;
			    				}
			    				else if (Op_Qminutos > 100) {
			    					Op_valorpg = 50;
			    				    Op_valorpg = Op_valorpg + (Op_Qminutos -100) * 2;
			    					
			    				}
			    				
			    				System.out.println("Valor a pagar: " + Op_valorpg);
			    				respx += 1;
			    				
		    				break;
		    			case 5:
		    				System.out.println("Problema selecionado: Troco verificado");
		    				System.out.println("");
		    				
			    				System.out.print("Preço unitario do produto: ");
			    				double Tv_preco = sc.nextDouble();
			    				System.out.print("Quantidade comprada: ");
			    				int Tv_quantidade = sc.nextInt();
			    				System.out.print("Dinheiro recebido: ");
			    				double Tv_dinheiro = sc.nextInt();
			    				
			    				double Tv_produtos = Tv_preco * Tv_quantidade;
			    				
			    				if (Tv_dinheiro < Tv_produtos) {
			    					System.out.println("dinheiro insuficiente. faltam " + (Tv_produtos - Tv_dinheiro) + " Reais.");	
			    				}
	
			    				if (Tv_dinheiro > Tv_produtos) {
			    					System.out.println("Troco = " + (Tv_dinheiro - Tv_produtos) );
		    				}	
		    						
			    				respx += 1;
			    				
		    				break;
		    			case 6:
		    				System.out.println("Problema selecionado: Menor de tres");
		    				System.out.println("");
		    				
			    				System.out.print("Digite a medida da glicose: ");
			    				double Gc_medida = sc.nextDouble();
			    				
			    				if (Gc_medida < 70 ) {
			    					System.out.println("Classificação: Glicose baixa");
			    				}
			    				else if (Gc_medida >= 70 && Gc_medida <= 100){
			    					System.out.println("Classificação: Normal");
			    				}
			    				else if (Gc_medida > 100 && Gc_medida <= 140) {
			    					System.out.println("Classificação: Elevado");
			    				}
			    				else if (Gc_medida > 140 ) {
			    					System.out.println("Classificação: Diabetes");
		    				}
			    				respx += 1;
			    				
		    				break;
		    			case 7:	
		    				System.out.println("Problema selecionado: Dardo");
		    				System.out.println("");
		    				
			    				System.out.println("Digite as tres distancias: ");
			    				double dd_x = sc.nextDouble();
			    				double dd_y = sc.nextDouble();
			    				double dd_z = sc.nextDouble();
			    				
			    				double dd_maior = 0; 
			    				
			    				if (dd_x > dd_y && dd_x > dd_z) {
			    					dd_maior = dd_x;
			    				}
			    				else if (dd_y > dd_x && dd_y > dd_z) {
			    					dd_maior = dd_y;
			    				}
			    				else if (dd_z > dd_x && dd_z > dd_y) {
			    					dd_maior = dd_z;
			    				}
			    				
			    				System.out.println("Maior distancia = " + dd_maior);
			    				respx += 1;
		    				
		    				break;
		    			case 8:
		    				System.out.println("Problema selecionado: Temperatura");
		    				System.out.println("");
		    				
			    				System.out.print("voce vai digitar a temperatura em qual escala (C/F): ");
			    				char tmp_escala = sc.next().charAt(0);
			    				
			    				double tmp_cell, tmp_fah; 
			    				
			    				if (tmp_escala == 'F' || tmp_escala == 'f') {
			    					System.out.print("Digite a temperatura em fahrenheit: ");
			    					tmp_fah = sc.nextDouble();
			    					tmp_cell = 5/9 * (tmp_fah - 32);
			    					System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", tmp_cell));
			    				}
			    				else if (tmp_escala == 'C' || tmp_escala == 'c') {
			    					System.out.print("Digite a temperatura em Celsius: ");
			    					tmp_cell = sc.nextDouble();
			    					tmp_fah =  (9 * tmp_cell + (5 * 32)) / 5;
			    					System.out.println("Temperatura equivalente em fahrenheit: " + String.format("%.2f", tmp_fah));
			    				}
			    				respx += 1;
		    				
		    				break;
		    			case 9:
		    				System.out.println("Problema selecionado: Lanchonete");
		    				System.out.println("");
		    				
			    				System.out.print("Codigo do produto comprado: ");
			    				int lc_codigo = sc.nextInt();
			    				
			    				double lc_precoP = 0;
			    				
			    				switch (lc_codigo) {
			    					case 1: 
			    						lc_precoP = 5.0;
			    						break;
			    					case 2: 
			    						lc_precoP = 3.5;
			    						break;
			    					case 3: 
			    						lc_precoP = 4.8;
			    						break;
			    					case 4: 
			    						lc_precoP = 8.9;
			    						break;
			    					case 5: 
			    						lc_precoP = 7.32;
			    						break;
			    				}
			    				
			    				System.out.print("Quantidade comprada: ");
			    				int lc_quantcomp = sc.nextInt();
			    				
			    				double lc_ValorAPagar = lc_precoP * lc_quantcomp;
			    				
			    				System.out.println("Valor a pagar: " + String.format("%.2f", lc_ValorAPagar));
			    				respx += 1;
		    				
		    				break;
		    			case 10:
		    				System.out.println("Problema selecionado: Multiplos");
		    				System.out.println("");
		    				
			    				System.out.println("Digite dois números inteiros:");
			    				int mtp_x = sc.nextInt();
			    				int mtp_y = sc.nextInt();
			    				
			    				if (mtp_x > mtp_y) {
			    					if (mtp_x % mtp_y == 0) {
			    						System.out.println("São multiplos");
			    					}
			    					else {
			    						System.out.println("Não são multiplos");
			    					}
			    				}
			    				
			    				if (mtp_x < mtp_y) {
			    					if (mtp_y % mtp_x == 0) {
			    						System.out.println("São multiplos");
			    					}
			    					else {
			    						System.out.println("Não são multiplos");
			    					}
			    				}
		    						    				
		    				break;
		    			case 11:
		    				System.out.println("Problema selecionado: Aumento");
		    				System.out.println("");
		    				
			    				System.out.print("Digite o salario da pessoa: ");
			    				double am_salario = sc.nextDouble();
			    				
			    				double am_aumento;
			    				int am_porcentagem;
			    				
			    				if (am_salario <= 1000) {
			    					am_aumento = am_salario / 10 * 2;
			    					am_porcentagem = 20;
			    				}
			    				else if (am_salario > 1000 && am_salario <= 3000) {
			    					am_aumento = am_salario / 100 * 15;
			    					am_porcentagem = 15;
			    				}
			    				else if (am_salario > 3000 && am_salario <= 8000) {
			    					am_aumento = am_salario / 10;
			    					am_porcentagem = 10;
			    				}
			    				else {
			    					am_aumento = am_salario / 100 * 5;
			    					am_porcentagem = 5;
			    				}
			    				
			    				System.out.println("Novo salario = " +  String.format("%.2f",(am_salario + am_aumento)));
			    				System.out.println("Aumento = " + String.format("%.2f",am_aumento));
			    				System.out.println("Porcentagem = " + am_porcentagem + "%");
			    				respx += 1;
			    				
		    				break;
		    			case 12: 
		    				System.out.println("Problema selecionado: Tempo de jogo");
		    				System.out.println("");
		    				
			    				System.out.print("Hora inicial: ");		
			    				int tj_hinicial = sc.nextInt();
			    				System.out.print("Hora final: ");		
			    				int tj_hfinal = sc.nextInt();
			    			
			    				
			    				if (tj_hinicial < tj_hfinal) {
			    			    	System.out.println("O JOGO DUROU " + (tj_hfinal - tj_hinicial) + " HORA(S).");
			    			    }
			    			    else {
			    					System.out.println("O JOGO DUROU " + (24 - (tj_hinicial - tj_hfinal)) + " HORA(S).");
			    			    }
			    				respx += 1;
			    				
		    				break;
		    			case 13: 
		    				System.out.println("Problema selecionado: Coordenadas");
		    				System.out.println("");
		    				
			    				System.out.print("Valor de X: ");
			    				double coor_x = sc.nextDouble();
			    				System.out.print("Valor de y: ");
			    				double coor_y = sc.nextDouble();
			    				
			    				
			    				if (coor_x == 0 && coor_y == 0) {
			    					System.out.println("Origem");
			    				}
			    				else if (coor_x != 0 && coor_y == 0) {
			    					System.out.println("Eixo X");
			    				}
			    				else if (coor_x == 0 && coor_y != 0) {
			    					System.out.println("Eixo Y");
			    				}
			    				else if (coor_x > 0 && coor_y > 0) {
			    					System.out.println("Quadrante 1");
			    				}
			    				else if (coor_x < 0 && coor_y > 0) {
			    					System.out.println("Quadrante 2");
			    				}
			    				else if (coor_x < 0 && coor_y < 0) {
			    					System.out.println("Quadrante 3");
			    				}
			    				else if (coor_x > 0 && coor_y < 0) {
			    					System.out.println("Quadrante 4");
			    				}
			    				respx += 1;
		    				
		    				break;
		    		}
		    		
		    		break; //break do case do caps 
		    	case 3:
		    		System.out.print("Selecione um problema: ");
		    		pros = sc.nextInt();
		    		switch (pros) {
		    			case 1:
		    				System.out.println("Problema selecionado: Crescente ");
		    				System.out.println("");
		    				
			    				System.out.println("Digite dois números inteiros:");
			    				int cst_x = sc.nextInt();
			    				int cst_y = sc.nextInt();
	
			    				while (cst_x != cst_y) {
			    					
			    					if (cst_x > cst_y) {
			    						System.out.println("Decrescente!");
			    					} 
			    					else {
			    						System.out.println("Crescente!");
			    					} 
			    						
			    					System.out.println("Digite outros dois numeros: ");
			    					 cst_x = sc.nextInt();
			    					 cst_y = sc.nextInt();
			    					
			    				}
			    				respx += 1;
		    				
		    				break;
		    			case 2:
		    				System.out.println("Problema selecionado: Média idades");
		    				System.out.println("");
		    				
			    				System.out.println("Digite as idades: ");
			    				
			    				int mi_reserva = 0, mi_idade = 0;
			    				double mi_media = 0;
			    				
			    				while (mi_idade > -1) {
			    					mi_media = mi_media + mi_idade;
			    					
			    					mi_idade = sc.nextInt();
			    					if (mi_idade > 0) {
			    						mi_reserva = mi_reserva + 1;
			    					}
			    				}
			    				
			    				if (mi_media == 0) {
			    					System.out.println("Impossivel calcular!");
			    				}
			    				else if (mi_media > 0) {
			    					mi_media = mi_media / mi_reserva;
			    					System.out.println("Media = " + String.format("%.2f",mi_media));
			    				}
			    				respx += 1;
			    				
		    				break;
		    			case 3: 
		    				System.out.println("Problema selecionado: Senha fixa");
		    				System.out.println("");
		    				
			    				int senha;
	
			    			    System.out.print("Digite a senha: ");
			    			    senha = sc.nextInt();
	
			    			    while (senha != 2002) {
			    			    	System.out.print("Senha Invalida! Tente novamente: ");
			    			        senha = sc.nextInt();
			    			    }
	
			    			    System.out.println("Acesso permitido!\n");
			    			    respx += 1;
			    			    
		    				break;
		    			case 4:
		    				System.out.println("Problema selecionado: Quadrante");
		    				System.out.println("");
		    				
			    				int QD_x, QD_y;
	
			    			    System.out.println("Digite os valores das coordenadas X e Y:");
			    			    QD_x = sc.nextInt();
			    			    QD_y = sc.nextInt();
	
			    			    while (QD_x != 0 && QD_y != 0) {
			    			        if (QD_x > 0 && QD_y > 0) {
			    			        	System.out.println("QUADRANTE Q1");
			    			        }
			    			        else if (QD_x < 0 && QD_y > 0) {
			    			        	System.out.println("QUADRANTE Q2");
			    			        }
			    			        else if (QD_x < 0 && QD_y < 0) {
			    			        	System.out.println("QUADRANTE Q3");
			    			        }
			    			        else {
			    			        	System.out.println("QUADRANTE Q4");
			    			        }
	
			    			        System.out.println("Digite os valores das coordenadas X e Y:");
			    				    QD_x = sc.nextInt();
			    				    QD_y = sc.nextInt();
			    			    }
			    			    respx += 1;
			    			    
		    				break;
		    			case 5:
		    				System.out.println("Problema selecionado: Validação de nota");
		    				System.out.println("");
		    				
	
			    				System.out.print("Digite a primeira nota: ");
			    			    double Vn_nota1 = sc.nextDouble();
	
			    			    while (Vn_nota1 < 0 || Vn_nota1 > 10) {
			    			    	System.out.print("Valor invalido! Tente novamente: ");
			    					Vn_nota1 = sc.nextDouble();
			    			    }
	
			    			    System.out.print("Digite a segunda nota: ");
			    			    double VN_nota2 = sc.nextDouble();
	
			    			    while (VN_nota2 < 0 || VN_nota2 > 10) {
			    			    	System.out.print("Valor invalido! Tente novamente: ");
			    			        VN_nota2 = sc.nextDouble();
			    			    }
	
			    			    double VN_media = (Vn_nota1 + VN_nota2) / 2;
	
			    				System.out.printf("MEDIA = %.2f\n", VN_media);
			    				respx += 1;
		    				
		    				break;
		    			case 6:
		    				System.out.println("Problema selecionado: Combustivel");
		    				System.out.println("");
		    				
			    				System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			    			    int cb_codigo = sc.nextInt();
	
			    				int cb_alcool = 0;
			    				int cb_gasolina = 0;
			    				int cb_diesel = 0;
	
			    			    while (cb_codigo != 4) {
			    			        if (cb_codigo == 1) {
			    			            cb_alcool++;
			    			        }
			    			        else if (cb_codigo == 2) {
			    			            cb_gasolina++;
			    			        }
			    			        else if (cb_codigo == 3) {
			    			            cb_diesel++;
			    			        }
			    			        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			    			        cb_codigo = sc.nextInt();
			    			    }
	
			    			    System.out.println("MUITO OBRIGADO");
			    			    System.out.printf("Alcool: %d\n", cb_alcool);
			    			    System.out.printf("Gasolina: %d\n", cb_gasolina);
			    			    System.out.printf("Diesel: %d\n", cb_diesel);
			    			    respx += 1;
			    			    
			    			 break;
		    			case 7: 
		    				System.out.println("Problema selecionado: Pares consecutivos");
		    				System.out.println("");
		    				
			    				System.out.print("Digite um numero inteiro: ");
			    			    int pc_x = sc.nextInt();
	
			    			    while (pc_x != 0) {
			    			        if (pc_x % 2 != 0) {
			    			            pc_x++;
			    			        }
	
			    			        int pc_soma = 5 * pc_x + 20;
			    			        System.out.printf("SOMA = %d\n", pc_soma);
	
			    			        System.out.print("Digite um numero inteiro: ");
			    					pc_x = sc.nextInt();
			    			    }
			    			    respx += 1;
			    			    
		    				break;
		    			case 8:
		    				System.out.println("Problema selecionado: Tabuada");
		    				System.out.println("");
		    				
			    				System.out.print("Deseja a tabuada para qual valor? ");
			    			    int tb_n = sc.nextInt();
	
			    			    for (int i=1;i<=10;i++) {
			    			        int tb_produto = tb_n * i;
			    					System.out.printf("%d x %d = %d\n", tb_n, i, tb_produto);
			    			    }
		    				
			    			    respx += 1;
			    			    
		    				break;
		    			case 9:
		    				System.out.println("Problema selecionado: Soma ímpares");
		    				System.out.println("");
		    				
			    				int si_troca;
	
			    			    System.out.println("Digite dois numeros:");
			    			    int si_x = sc.nextInt();
			    			    int si_y = sc.nextInt();
	
			    			    if (si_x > si_y) {
			    			        si_troca = si_x;
			    			        si_x = si_y;
			    			        si_y = si_troca;
			    			    }
	
			    				int si_soma = 0;
			    			    for (int i=si_x+1; i<si_y; i++) {
			    			        if (i % 2 != 0) {
			    			            si_soma = si_soma + i;
			    			        }
			    			    }
	
			    			    System.out.printf("SOMA DOS IMPARES = %d\n", si_soma);
		    				
			    			    respx += 1;
		    				
		    				break;
		    			case 10:
		    				System.out.println("Problema selecionado: Sequências ímpares");
		    				System.out.println("");
		    				
			    				System.out.print("Digite o valor de X: ");
			    			    int sqi_x = sc.nextInt();
	
			    			    for (int i=1; i<=sqi_x; i++) {
			    			        if (i % 2 != 0) {
			    			        	System.out.printf("%d\n", i);
			    			        }
			    			    }
			    			    respx += 1;
			    			    
		    				break;
		    			case 11: 
		    				System.out.println("Problema selecionado: Dentro ou fora");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos numeros voce vai digitar? ");
			    			    int DF_n = sc.nextInt();
			    				
			    				int DF_fora = 0;
			    				int DF_dentro = 0;
	
			    			    for (int i=0; i<DF_n; i++) {
			    			    	System.out.print("Digite um numero: ");
			    			        int DF_x = sc.nextInt();
	
			    			        if (DF_x < 10 || DF_x > 20) {
			    			            DF_fora++;
			    			        }
			    			        else {
			    			            DF_dentro++;
			    			        }
			    			    }
			    				
			    			    System.out.printf("%d DENTRO\n", DF_dentro);
			    			    System.out.printf("%d FORA\n", DF_fora);
			    			    respx += 1;
			    			    
		    				break;
		    			case 12:
		    				System.out.println("Problema selecionado: Par ou impar");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos numeros voce vai digitar? ");
			    			    int pir_n = sc.nextInt();
	
			    			    for (int i=0; i<pir_n; i++) {
			    			        System.out.print("Digite um numero: ");
			    			        int pir_valor = sc.nextInt();
	
			    			        if (pir_valor == 0) {
			    			            System.out.println("NULO");
			    			        }
			    			        else {
			    			            if (pir_valor % 2 == 0) {
			    			            	System.out.print("PAR");
			    			            }
			    			            else {
			    			            	System.out.print("IMPAR");
			    			            }
	
			    			            if(pir_valor > 0) {
			    			            	System.out.println(" POSITIVO");
			    			            }
			    			            else {
			    			            	System.out.println(" NEGATIVO");
			    			            }
			    			        }
			    			    }
			    			    respx += 1;
			    			    
		    				break;
		    			case 13:
		    				System.out.println("Problema selecionado: Média ponderada");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos casos voce vai digitar? ");
			    			    int mdp_n = sc.nextInt();
	
			    			    for (int i=0; i<mdp_n; i++) {
			    			    	System.out.println("Digite tres numeros:");
			    			        double mdp_valor = sc.nextDouble();
			    			        double mdp_valor1 = sc.nextDouble();
			    			        double mdp_valor2 = sc.nextDouble();
	
			    			        double mdp_media = (mdp_valor * 2.0 + mdp_valor1 * 3.0 + mdp_valor2 * 5.0) / 10.0;
			    					
			    			        System.out.printf("MEDIA = %.1f\n", mdp_media);
			    			    }
		    				
			    			    respx += 1;
		    				
		    				break;
		    			case 14:
		    				System.out.println("Problema selecionado: Divisão");
		    				System.out.println("");
		    				
			    				 System.out.print("Quantos casos voce vai digitar? ");
			    				    int dv_ncasos = sc.nextInt();
	
			    				    for (int i=0; i<dv_ncasos; i++) {
			    				    	System.out.print("Entre com o numerador: ");
			    				        int dv_numerador = sc.nextInt();
	
			    				        System.out.print("Entre com o denominador: ");
			    				        int dv_denominador = sc.nextInt();
	
			    				        if (dv_denominador == 0) {
			    				        	System.out.println("DIVISAO IMPOSSIVEL");
			    				        }
			    				        else {
			    				            double dv_divisao = (double) dv_numerador / dv_denominador;
			    				            System.out.printf("DIVISAO = %.2f\n", dv_divisao);
			    				        }
			    				    }
			    				    respx += 1;
			    				    
		    				break;
		    			case 15: 
		    				System.out.println("Problema selecionado: Fatorial");
		    				System.out.println("");
		    				
			    				System.out.print("Digite o valor de N: ");
			    			    int ft_n = sc.nextInt();
	
			    			    int ft_fatorial = 1;
			    			    for (int i=ft_n; i>0; i--) {
			    			        ft_fatorial = ft_fatorial * i;
			    			    }
	
			    			    System.out.printf("FATORIAL = %d\n", ft_fatorial);
			    			    respx += 1;
			    			    
		    				break;
		    			case 16:
		    				System.out.println("Problema selecionado: Experiências");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos casos de teste serao digitados? ");
			    			    int exp_n = sc.nextInt();
	
			    				int exp_ratos = 0;
			    				int exp_sapos = 0;
			    				int exp_coelhos = 0;
	
			    			    for (int i=0; i<exp_n; i++) {
			    			    	System.out.print("Quantidade de cobaias: ");
			    			        int exp_qtdcobaias = sc.nextInt();
			    			        System.out.print("Tipo de cobaia: ");
			    			        char exp_tipo = sc.next().charAt(0);
	
			    			        if (exp_tipo == 'R') {
			    			            exp_ratos = exp_ratos + exp_qtdcobaias;
			    			        }
			    			        else if (exp_tipo == 'S') {
			    			            exp_sapos = exp_sapos + exp_qtdcobaias;
			    			        }
			    			        else {
			    			            exp_coelhos = exp_coelhos + exp_qtdcobaias;
			    			        }
			    			    }
	
			    			    int exp_total = exp_ratos + exp_sapos + exp_coelhos;
			    			    double exp_pcoelhos = ((double)exp_coelhos / exp_total) * 100.0;
			    			    double exp_pratos = ((double)exp_ratos / exp_total) * 100.0;
			    			    double exp_psapos = ((double)exp_sapos / exp_total) * 100.0;
	
			    			    System.out.println("\nRELATORIO FINAL:");
			    			    System.out.printf("Total: %d cobaias\n", exp_total);
			    			    System.out.printf("Total de coelhos: %d\n", exp_coelhos);
			    			    System.out.printf("Total de ratos: %d\n", exp_ratos);
			    			    System.out.printf("Total de sapos: %d\n", exp_sapos);
			    			    System.out.printf("Percentual de coelhos: %.2f\n", exp_pcoelhos);
			    			    System.out.printf("Percentual de ratos: %.2f\n", exp_pratos);
			    			    System.out.printf("Percentual de sapos: %.2f\n", exp_psapos);
		    				
			    			    respx += 1;
		    				break;
		    		
		    		}
		    		
		    		break; // case do caps
		    	case 4:
		    		System.out.print("Selecione um problema: ");
		    		pros = sc.nextInt();
		    		switch (pros) {
		    			case 1:
		    				System.out.println("Problema selecionado: negativos");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos numeros voce vai digitar? ");
			    			    int neg_n = sc.nextInt();
	
			    			    int[] neg_vetor = new int[neg_n];
	
			    			    for (int i=0; i<neg_n; i++) {
			    			    	System.out.print("Digite um numero: ");
			    			        neg_vetor[i] = sc.nextInt();
			    			    }
	
			    			    System.out.println("NUMEROS NEGATIVOS:");
	
			    			    for (int i=0; i<neg_n; i++) {
			    			        if (neg_vetor[i] < 0) {
			    			        	System.out.printf("%d\n", neg_vetor[i]);
			    			        }
			    			    }
			    			    respx += 1;
			    			    
		    				break;
		    			case 2: 
		    				System.out.println("Problema selecionado: Soma vetor");
		    				System.out.println("");	
		    				
			    				System.out.print("Quantos numeros voce vai digitar? ");
			    			    int smv_n = sc.nextInt();
	
			    			    double[] smv_vetor = new double[smv_n];
	
			    			    for (int i=0; i<smv_n; i++) {
			    			    	System.out.print("Digite um numero: ");
			    			        smv_vetor[i] = sc.nextDouble();
			    			    }
	
			    				double smv_soma = 0;
			    			    for (int i=0; i<smv_n; i++) {
			    			        smv_soma = smv_soma + smv_vetor[i];
			    			    }
	
			    			    double smv_media = smv_soma / smv_n;
	
			    				System.out.print("VALORES = ");
	
			    			    for (int i=0; i<smv_n; i++) {
			    			    	System.out.printf("%.1f  ", smv_vetor[i]);
			    			    }
	
			    			    System.out.printf("\nSOMA = %.2f\n", smv_soma);
			    			    System.out.printf("MEDIA = %.2f\n", smv_media);
			    			    respx += 1;
			    			    
		    				break;
		    			case 3: 
		    				System.out.println("Problema selecionado: Alturas");
		    				System.out.println("");
		    				
			    				System.out.print("Quantas pessoas serao digitadas? ");
			    			    int alt_n = sc.nextInt();
	
			    			    String[] alt_nomes = new String[alt_n];
			    			    int[] alt_idades = new int[alt_n];
			    			    Double[] alt_alturas = new Double[alt_n];
			    			    
	
			    			    for (int i=0; i<alt_n; i++) {
			    			    	System.out.printf("Dados da %da pessoa:\n", i + 1);
			    			    	System.out.print("Nome: ");
			    			        alt_nomes[i] = sc.next();
			    			        System.out.print("Idade: ");
			    			        alt_idades[i] = sc.nextInt();
			    			        System.out.print("Altura: ");
			    			        alt_alturas[i] = sc.nextDouble();
			    			    }
	
			    				int alt_nmenores = 0;
			    				double alt_alturatotal = 0;
			    			    for (int i=0; i<alt_n; i++) {
			    			        if (alt_idades[i] < 16) {
			    			            alt_nmenores++;
			    			        }
			    			        alt_alturatotal = alt_alturatotal + alt_alturas[i];
			    			    }
	
			    			    double alt_alturamedia = alt_alturatotal / alt_n;
			    			    double alt_percentualMenores = ((double)alt_nmenores / alt_n) * 100.0;
	
			    			    System.out.printf("\nAltura media = %.2f\n", alt_alturamedia);
			    			    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", alt_percentualMenores);
	
			    			    for(int i=0; i<alt_n; i++) {
			    			        if (alt_idades[i] < 16) {
			    			        	System.out.printf("%s\n", alt_nomes[i]);
			    			        }
			    			    }
			    			    respx += 1;
		    				
		    				break;
		    			case 4:
		    				System.out.println("Problema selecionado: Números pares");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos numeros voce vai digitar? ");
			    			    int nmp_n = sc.nextInt();
	
			    			    int[] nmp_vetor = new int[nmp_n];
	
			    			    for (int i=0; i<nmp_n; i++) {
			    			    	System.out.print("Digite um numero: ");
			    			        nmp_vetor[i] = sc.nextInt();
			    			    }
	
			    			    System.out.println("\nNUMEROS PARES:");
	
			    				int nmp_qtdpares = 0;
			    			    for (int i=0; i<nmp_n; i++) {
			    			        if (nmp_vetor[i] % 2 == 0) {
			    			        	System.out.printf("%d  ", nmp_vetor[i]);
			    			            nmp_qtdpares++;
			    			        }
			    			    }
	
			    			    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", nmp_qtdpares);
			    			    respx += 1;
		    				
		    				break;
		    			case 5: 
		    				System.out.println("Problema selecionado: Maior posição");
		    				System.out.println("");	
		    				
			    				System.out.print("Quantos numeros voce vai digitar? ");
			    			    int mps_n = sc.nextInt();
	
			    			    double[] mps_vetor = new double[mps_n];
	
			    			    for (int i=0; i<mps_n; i++) {
			    			    	System.out.print("Digite um numero: ");
			    			        mps_vetor[i] = sc.nextDouble();
			    			    }
	
			    			    double mps_maior = mps_vetor[0];
			    			    int mps_posmaior = 0;
	
			    			    for (int i=1; i<mps_n; i++) {
			    			        if (mps_vetor[i] > mps_maior) {
			    			            mps_maior = mps_vetor[i];
			    			            mps_posmaior = i;
			    			        }
			    			    }
			    				
			    			    System.out.printf("MAIOR VALOR = %.1f\n", mps_maior);
			    			    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", mps_posmaior);
			    			    respx += 1;
		    				break;
		    			case 6: 
		    				System.out.println("Problema selecionado: Soma vetores");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos valores vai ter cada vetor? ");
			    			    int smvt_n = sc.nextInt();
	
			    			    int[] smvt_a = new int[smvt_n];
			    			    int[] smvt_b = new int[smvt_n];
			    			    int[] smvt_c = new int[smvt_n];
	
			    			    System.out.println("Digite os valores do vetor A:");
	
			    			    for (int i=0; i<smvt_n; i++) {
			    					smvt_a[i] = sc.nextInt();
			    			    }
	
			    			    System.out.println("Digite os valores do vetor B:");
	
			    			    for (int i=0; i<smvt_n; i++) {
			    			        smvt_b[i] = sc.nextInt();
			    			    }
	
			    			    for (int i=0; i<smvt_n; i++) {
			    			        smvt_c[i] = smvt_a[i] + smvt_b[i];
			    			    }
	
			    			    System.out.println("VETOR RESULTANTE:");
	
			    			    for (int i=0; i<smvt_n; i++) {
			    			    	System.out.printf("%d\n", smvt_c[i]);
			    			    }
			    			    respx += 1;
		    				break;
		    			case 7:
		    				System.out.println("Problema selecionado: Abaixo");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos elementos vai ter o vetor? ");
			    			    int abm_n = sc.nextInt();
	
			    			    double[] abm_vetor = new double[abm_n];
	
			    			    for (int i=0; i<abm_n; i++) {
			    			    	System.out.print("Digite um numero: ");
			    					abm_vetor[i] = sc.nextDouble();
			    			    }
	
			    				double abm_soma = 0;
			    			    for (int i=0; i<abm_n; i++) {
			    			        abm_soma = abm_soma + abm_vetor[i];
			    			    }
	
			    			    double abm_media = abm_soma / abm_n;
	
			    			    System.out.printf("\nMEDIA DO VETOR = %.3f\n", abm_media);
			    			    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
	
			    			    for (int i=0; i<abm_n; i++) {
			    			        if (abm_vetor[i] < abm_media) {
			    			        	System.out.printf("%.1f\n", abm_vetor[i]);
			    			        }
			    			    }
			    			    respx += 1;
			    			    
		    				break;
		    			case 8: 
		    				System.out.println("Problema selecionado: Média pares");
		    				System.out.println("");	
		    				
		    				int mdp_somapares = 0, mdp_npares = 0;
		    			    double mdp_mediapares;

		    			    System.out.print("Quantos elementos vai ter o vetor? ");
		    			    int mdp_n = sc.nextInt();

		    			    int[] mdp_vetor = new int[mdp_n];

		    			    for (int i=0; i<mdp_n; i++) {
		    			    	System.out.print("Digite um numero: ");
		    			        mdp_vetor[i] = sc.nextInt();
		    			    }

		    			    for (int i=0; i<mdp_n; i++) {
		    			        if (mdp_vetor[i] % 2 == 0) {
		    			            mdp_somapares = mdp_somapares + mdp_vetor[i];
		    			            mdp_npares++;
		    			        }
		    			    }

		    			    if (mdp_npares == 0) {
		    			    	System.out.println("NENHUM NUMERO PAR");
		    			    }
		    			    else {
		    			        mdp_mediapares = (double)mdp_somapares / mdp_npares;

		    			        System.out.printf("MEDIA DOS PARES = %.1f\n", mdp_mediapares);
		    			    }
		    			    respx += 1;
		    			    
		    				break;
		    			case 9: 
		    				System.out.println("Problema selecionado: Mais velho");
		    				System.out.println("");
		    				
			    				System.out.print("Quantas pessoas voce vai digitar? ");
			    			    int msv_n = sc.nextInt();
	
			    			    String[] msv_nomes = new String[msv_n];
			    			    int[] msv_idades = new int[msv_n];
	
			    			    for (int i=0; i<msv_n; i++) {
			    			    	System.out.printf("Dados da %da pessoa:\n", i + 1);
			    					System.out.print("Nome: ");
			    					msv_nomes[i] = sc.next();
			    					System.out.print("Idade: ");
			    					msv_idades[i] = sc.nextInt();
			    			    }
	
			    			    int msv_maioridade = msv_idades[0];
			    			    int msv_posicaomaior = 0;
	
			    			    for (int i=1; i<msv_n; i++) {
			    			        if (msv_idades[i] > msv_maioridade) {
			    			            msv_maioridade = msv_idades[i];
			    			            msv_posicaomaior = i;
			    			        }
			    			    }
	
			    			    System.out.printf("PESSOA MAIS VELHA: %s\n", msv_nomes[msv_posicaomaior]);
			    			    respx += 1;
			    			    
		    				break;
		    			case 10:
		    				System.out.println("Problema selecionado: Aprovados");
		    				System.out.println("");
		    				
			    				System.out.print("Quantos alunos serao digitados? ");
			    			    int apv_n = sc.nextInt();
	
			    			    String[] nomes = new String[apv_n];
			    			    double[] notas1 = new double[apv_n];
			    			    double[] notas2 = new double[apv_n];
	
			    			    for (int i=0; i<apv_n; i++) {
			    			    	System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			    			        sc.nextLine();
			    			        nomes[i] = sc.nextLine();
			    					notas1[i] = sc.nextDouble();
			    					notas2[i] = sc.nextDouble();
			    			    }
	
			    			    System.out.println("Alunos aprovados:");
	
			    			    for (int i=0; i<apv_n; i++) {
			    			        double apv_media = (notas1[i] + notas2[i]) / 2;
	
			    			        if(apv_media >= 6.0) {
			    			            System.out.printf("%s\n", nomes[i]);
			    			        }
			    			    }

			    			    respx += 1;
		    				break;
		    			case 11: 
		    				System.out.println("Problema selecionado: Dados pessoais");
		    				System.out.println("");	
		    				
			    				System.out.print("Quantas pessoas serao digitadas? ");
			    			    int dps_n = sc.nextInt();
	
			    			    double[] dps_alturas = new double[dps_n];
			    			    char[] dps_generos = new char[dps_n];
	
			    			    for (int i=0; i<dps_n; i++) {
			    			    	System.out.printf("Altura da %da pessoa: ", i + 1);
			    			        dps_alturas[i] = sc.nextDouble();
			    			        System.out.printf("Genero da %da pessoa: ", i + 1);
			    			        dps_generos[i] = sc.next().charAt(0);
			    			    }
	
			    			    double dps_menoraltura = dps_alturas[0];
			    			    double dps_maioraltura = dps_alturas[0];
	
			    			    for (int i=1; i<dps_n; i++) {
			    			        if (dps_alturas[i] > dps_maioraltura) {
			    			            dps_maioraltura = dps_alturas[i];
			    			        }
			    			        if (dps_alturas[i] < dps_menoraltura) {
			    			            dps_menoraltura = dps_alturas[i];
			    			        }
			    			    }
	
			    				int dps_qtdhomens = 0;
			    				int dps_qtdmulheres = 0;
			    				double dps_alturafemtotal = 0;
			    			    for (int i=0; i<dps_n; i++) {
			    			        if (dps_generos[i]=='M') {
			    			            dps_qtdhomens++;
			    			        }
			    			        else {
			    			            dps_qtdmulheres++;
			    			            dps_alturafemtotal = dps_alturafemtotal + dps_alturas[i];
			    			        }
			    			    }
	
			    			    double dps_alturafemMedia = dps_alturafemtotal / dps_qtdmulheres;
	
			    			    System.out.printf("Menor altura = %.2f\n", dps_menoraltura);
			    			    System.out.printf("Maior altura = %.2f\n", dps_maioraltura);
			    			    System.out.printf("Media das alturas das mulheres = %.2f\n", dps_alturafemMedia);
			    			    System.out.printf("Numero de homens = %d\n", dps_qtdhomens);
			    			    respx += 1;
		    				break;
		    			case 12: 
		    				System.out.println("Problema selecionado: Comerciante");
		    				System.out.println("");
		    				
			    				 System.out.print("Serão digitados dados de quantos produtos: ");
			    				    int cmt_n = sc.nextInt();
			    				    
			    				    
			    				    String [] cmt_nomep = new String[cmt_n];
			    				    double [] cmt_precoc = new double[cmt_n];
			    				    double [] cmt_precov = new double[cmt_n];
			    				    double[] cmt_porcentagemlucros = new double[cmt_n];
			    				    
			    				    for (int i = 0; i < cmt_n; i++) {
			    				    	System.out.println("Produto " + i+1 + ": " );
			    				    	System.out.print("Nome: ");
			    				    	cmt_nomep[i] = sc.nextLine();
			    				    	System.out.print("Preço de compra: ");
			    				    	cmt_precoc[i] = sc.nextDouble();
			    				    	System.out.print("Preço de venda: "); 
			    				    	cmt_precov[i] = sc.nextDouble();
			    				    	
			    				    }
			    				    
			    				    for (int i = 0; i < cmt_n; i++) {
			    				    	 cmt_porcentagemlucros[i] = (cmt_precov[i] - cmt_precoc[i]) / cmt_precoc[i] * 100.0;
			    				    }
			    				    
			    				    int cmt_abaixo = 0;
			    				    int cmt_entre = 0;
			    				    int cmt_acima = 0;
	
			    				    for (int i=0; i<cmt_n; i++) {
			    				        if (cmt_porcentagemlucros[i] < 10.0) {
			    				            cmt_abaixo++;
			    				        }
			    				        else if (cmt_porcentagemlucros[i] < 20.0) {
			    				            cmt_entre++;
			    				        }
			    				        else {
			    				            cmt_acima++;
			    				        }
			    				    }
	
			    				    double cmt_vtotalcompra = 0;
			    				    double cmt_vtotalvenda = 0;
	
			    				    for (int i=0; i<cmt_n; i++) {
			    				        cmt_vtotalcompra = cmt_vtotalcompra + cmt_precoc[i];
			    				        cmt_vtotalvenda = cmt_vtotalvenda + cmt_precov[i];
			    				    }
	
			    				    double cmt_lucrototal = cmt_vtotalvenda - cmt_vtotalcompra;
	
			    				    System.out.println("\nRELATORIO:");
			    				    System.out.printf("Lucro abaixo de 10%%: %d\n", cmt_abaixo);
			    				    System.out.printf("Lucro entre 10%% e 20%%: %d\n", cmt_entre);
			    				    System.out.printf("Lucro acima de 20%%: %d\n", cmt_acima);
			    				    System.out.printf("Valor total de compra: %.2f\n", cmt_vtotalcompra);
			    				    System.out.printf("Valor total de venda: %.2f\n", cmt_vtotalvenda);
			    				    System.out.printf("Lucro total: %.2f\n", cmt_lucrototal);
			    				    respx += 1;
		    				break;
		    		}
		    		
		    		break;
		    	case 5:
		    		System.out.print("Selecione um problema: ");
		    		pros = sc.nextInt();
		    		switch (pros) {
		    			case 1: 
		    				System.out.println("Problema selecionado: Diagonal negativos");
		    				System.out.println("");
	    				
			    				System.out.print("Qual a ordem da matriz? ");
			    			    int dgn_n = sc.nextInt();
	
			    			    int[][] dgn_matriz = new int[dgn_n][dgn_n];
	
			    			    for (int i=0; i<dgn_n; i++) {
			    			        for (int j=0; j<dgn_n; j++) {
			    			        	System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            dgn_matriz[i][j] = sc.nextInt();
			    			        }
			    			    }
	
			    			    System.out.println("DIAGONAL PRINCIPAL:");
	
			    			    for (int i=0; i<dgn_n; i++) {
			    			    	System.out.printf("%d ", dgn_matriz[i][i]);
			    			    }
	
			    			    int dgn_qtdnegativos = 0;
			    			    for (int i=0; i<dgn_n; i++) {
			    			        for (int j=0; j<dgn_n; j++) {
			    			            if (dgn_matriz[i][j] < 0) {
			    			                dgn_qtdnegativos++;
			    			            }
			    			        }
			    			    }
	
			    			    System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", dgn_qtdnegativos);
			    			    respx += 1;
		    				break;
		    			case 2: 
		    				System.out.println("Problema selecionado: Soma linhas");
		    				System.out.println("");
		    				
			    				System.out.print("Qual a quantidade de linhas da matriz? ");
			    			    int sml_m = sc.nextInt();
			    			    System.out.print("Qual a quantidade de colunas da matriz? ");
			    			    int sml_n = sc.nextInt();
	
			    			    double[][] sml_matriz = new double[sml_m][sml_n];
			    			    double[] sml_vetor = new double[sml_m];
	
			    			    for (int i=0; i<sml_m; i++) {
			    			    	System.out.printf("Digite os elementos da %d a. linha\n", i + 1);
	
			    			        for (int j=0; j<sml_n; j++) {
			    			            sml_matriz[i][j] = sc.nextDouble();
			    			        }
			    			    }
	
			    			    for (int i=0; i<sml_m; i++) {
			    			        double sml_somalinha = 0;
	
			    			        for (int j=0; j<sml_n; j++) {
			    			            sml_somalinha = sml_somalinha + sml_matriz[i][j];
			    			        }
			    			        sml_vetor[i] = sml_somalinha;
			    			    }
	
			    			    System.out.println("VETOR GERADO:");
	
			    			    for (int i=0; i<sml_m; i++) {
			    			    	System.out.printf("%.1f\n", sml_vetor[i]);
			    			    }

			    			    respx += 1;
		    				break;
		    			case 3: 
		    				System.out.println("Problema selecionado: Negativos matriz");
		    				System.out.println("");
		    				
			    				int ngt_m, ngt_n;
	
			    			    System.out.print("Qual a quantidade de linhas da matriz? ");
			    			    ngt_m = sc.nextInt();
			    			    System.out.print("Qual a quantidade de colunas da matriz? ");
			    			    ngt_n = sc.nextInt();
	
			    			    int[][] matriz = new int[ngt_m][ngt_n];
	
			    			    for (int i=0; i<ngt_m; i++) {
			    			        for (int j=0; j<ngt_n; j++) {
			    			        	System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            matriz[i][j] = sc.nextInt();
			    			        }
			    			    }
			    				
			    			    System.out.println("VALORES NEGATIVOS:");
	
			    			    for (int i=0; i<ngt_m; i++) {
			    			        for (int j=0; j<ngt_n; j++) {
			    			            if (matriz[i][j] < 0) {
			    			            	System.out.printf("%d\n", matriz[i][j]);
			    			            }
			    			        }
			    			    }
			    			    respx += 1;
		    				break;
		    			case 4: 
		    				System.out.println("Problema selecionado: Cada linha");
		    				System.out.println("");
	    				
			    				System.out.print("Qual a ordem da matriz? ");
			    			    int cdl_n = sc.nextInt();
			    			
			    			    int[][] cdl_matriz = new int[cdl_n][cdl_n];
			    			    int[] cdl_maiorlinha = new int[cdl_n];
			    			
			    			    for (int i=0; i<cdl_n; i++) {
			    			        for (int j=0; j<cdl_n; j++) {
			    						System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            cdl_matriz[i][j] = sc.nextInt();
			    			        }
			    			    }
			    			
			    			    for (int i=0; i<cdl_n; i++) {
			    			        int cdl_maior = cdl_matriz[i][0];
			    			        for (int j=1; j<cdl_n; j++) {
			    			            if (cdl_maior < cdl_matriz[i][j]) {
			    			                cdl_maior = cdl_matriz[i][j];
			    			            }
			    			        }
			    			        cdl_maiorlinha[i] = cdl_maior;
			    			    }
			    			
			    			    System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
			    			
			    			    for (int i=0; i<cdl_n; i++) {
			    					System.out.printf("%d\n", cdl_maiorlinha[i]);
			    			    }
			    			    respx += 1;
		    				break;
		    			case 5: 
		    				System.out.println("Problema selecionado: Soma matrizes");
		    				System.out.println("");
		    				
			    				System.out.print("Quantas linhas vai ter cada matriz? ");
			    			    int smmt_m = sc.nextInt();
			    			    System.out.print("Quantas colunas vai ter cada matriz? ");
			    			    int smmt_n = sc.nextInt();
	
			    			    int[][] smmt_a = new int[smmt_m][smmt_n];
			    			    int[][] smmt_b = new int[smmt_m][smmt_n];
			    			    int[][] smmt_c = new int[smmt_m][smmt_n];
	
			    			    System.out.println("Digite os valores da matriz A:");
	
			    			    for (int i=0; i<smmt_m; i++) {
			    			        for (int j=0; j<smmt_n; j++) {
			    			        	System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            smmt_a[i][j] = sc.nextInt();
			    			        }
			    			    }
	
			    			    System.out.println("Digite os valores da matriz B:");
	
			    			    for (int i=0; i<smmt_m; i++) {
			    			        for (int j=0; j<smmt_n; j++) {
			    			        	System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            smmt_b[i][j] = sc.nextInt();
			    			        }
			    			    }
	
			    			    for (int i=0; i<smmt_m; i++) {
			    			        for (int j=0; j<smmt_n; j++) {
			    			            smmt_c[i][j] = smmt_a[i][j] + smmt_b[i][j];
			    			        }
			    			    }
	
			    			    System.out.println("MATRIZ SOMA:");
	
			    			    for (int i=0; i<smmt_m; i++) {
			    			        for (int j=0; j<smmt_n; j++) {
			    			        	System.out.printf("%d ", smmt_c[i][j]);
			    			        }
			    			        System.out.println();
			    			    }
			    			    respx += 1;
		    				break;
		    			case 6: 
		    				System.out.println("Problema selecionado: Acima diagonal");
		    				System.out.println("");
		    				
			    				System.out.print("Qual a ordem da matriz? ");
			    			    int acmd_n = sc.nextInt();
	
			    			    int[][] acmd_matriz = new int[acmd_n][acmd_n];
	
			    			    for (int i=0; i<acmd_n; i++) {
			    			        for (int j=0; j<acmd_n; j++) {
			    			        	System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            acmd_matriz[i][j] = sc.nextInt();
			    			        }
			    			    }
	
			    				int acmd_somaAcima = 0;
			    			    for (int i=0; i<acmd_n; i++) {
			    			        for (int j=0; j<acmd_n; j++) {
			    			            if (i < j) {
			    			                acmd_somaAcima = acmd_somaAcima + acmd_matriz[i][j];
			    			            }
			    			        }
			    			    }
	
			    			    System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", acmd_somaAcima);
			    			    respx += 1;
		    				break;
		    			case 7: 
		    				System.out.println("Problema selecionado: Matriz geral");
		    				System.out.println("");
		    				
			    				System.out.print("Qual a ordem da matriz? ");
			    			    int mtg_n = sc.nextInt();
	
			    			    double[][] mtg_matriz = new double[mtg_n][mtg_n];
	
			    			    for (int i=0; i<mtg_n; i++) {
			    			        for (int j=0; j<mtg_n; j++) {
			    			        	System.out.printf("Elemento [%d,%d]: ", i, j);
			    			            mtg_matriz[i][j] = sc.nextDouble();
			    			        }
			    			    }
	
			    			    double mtg_somapositivos = 0;
			    			    for (int i=0; i<mtg_n; i++) {
			    			        for (int j=0; j<mtg_n; j++) {
			    			            if (mtg_matriz[i][j] > 0) {
			    			                mtg_somapositivos = mtg_somapositivos + mtg_matriz[i][j];
			    			            }
			    			        }
			    			    }
	
			    			    System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n\n", mtg_somapositivos);
	
			    			    System.out.print("Escolha uma linha: ");
			    				int mtg_indlinha = sc.nextInt();
	
			    				System.out.print("LINHA ESCOLHIDA: ");
	
			    			    for (int i=0; i<mtg_n; i++) {
			    			    	System.out.printf("%.1f ", mtg_matriz[mtg_indlinha][i]);
			    			    }
	
			    			    System.out.printf("\n\nEscolha uma coluna: ");
			    				int mtg_indcoluna = sc.nextInt();
	
			    				System.out.print("COLUNA ESCOLHIDA: ");
	
			    			    for (int i=0; i<mtg_n; i++) {
			    			    	System.out.printf("%.1f ", mtg_matriz[i][mtg_indcoluna]);
			    			    }
	
			    			    System.out.printf("\n\nDIAGONAL PRINCIPAL: ");
	
			    			    for (int i=0; i<mtg_n; i++) {
			    			    	System.out.printf("%.1f ", mtg_matriz[i][i]);
			    			    }
	
			    			    for (int i=0; i<mtg_n; i++) {
			    			        for (int j=0; j<mtg_n; j++) {
			    			            if (mtg_matriz[i][j] < 0) {
			    			                mtg_matriz[i][j] = Math.pow(mtg_matriz[i][j], 2);
			    			            }
			    			        }
			    			    }
	
			    				System.out.println("\n\nMATRIZ ALTERADA:");
	
			    			    for (int i=0; i<mtg_n; i++) {
			    			        for (int j=0; j<mtg_n; j++) {
			    			        	System.out.printf("%.1f ", mtg_matriz[i][j]);
			    			        }
			    					System.out.println();
			    			    }
			    			    respx += 1;
		    				break;
		    		}
		    	break;	
		    		
		    
		    }
		    
		    System.out.println();
		    System.out.println("Obrigado pela participação!");
		    System.out.print("Gostaria de participar novamente (s/n): ");
		    rep = sc.next().charAt(0);
		    respx += 1;
		}

        sc.close();	
	}
}