import java.util.Scanner;
import java.util.Random;
public class bozó2 {
	 public static void main(String[] args) {
		String decisao;
		int i=0;
		Scanner s= new Scanner(System.in);
		boolean full=false,quadradas=false;
		System.out.println(" Durante o jogo, se você digitar uma opção inválida de marcãção de pontos, você perde sua vez. Esteja avisado! :)");
		System.out.println( " Quantos jogadores jogarão esta partida ?");
		int jogadores= s.nextInt (),f,valor=0,num1,num2,num3,num4,num5,num6;
		int verifás[]= new int [jogadores];
		int veriduque[]= new int [jogadores];
		int veriterno[]= new int [jogadores];
		int veriquadra[]= new int [jogadores];
		int veriquina[]= new int [jogadores];
		int verisena[]= new int [jogadores];
		int veriseg[]= new int [jogadores];
		int verigeneras[]= new int [jogadores];
		int verifull[]= new int [jogadores];
		int veriquadrada[]= new int [jogadores];
		System.out.println(" Quantas rodadas serão? ");
		Random r= new Random ();
		int rodadas= s.nextInt ();
		int contduque=0,pontos[]= new int [jogadores];
		for (i=0;i<jogadores ;i++ ) {
			pontos[i]=0;
			verifás[i]=0;
			veriduque[i]= 0;
			veriterno[i]=0;
			veriquadra[i]=0;
			veriquina[i]=0;
			verisena[i]=0;
			veriseg[i]=0;
			veriquadrada[i]=0;
			verifull[i]=0;
		}
		
		int dados [] = new int [5],controdadas=1,chances=0,m,j=0,numjog;
		while( controdadas<=rodadas ){
		    
		    i=0;
			while ( i<jogadores) {
			    chances=0;
				num1=0;
				num2=0;
				num3=0;
				num4=0;
				num5=0;
				num6=0;
			    numjog=i+1;
			    
				System.out.println( " vamos sortear os dados do jogador " +numjog );
				System.out.print(" o valores são: ");
				chances=chances+1;
				for ( j=0;j<5 ;j++ ) {
					dados [j] = r.nextInt(6) +1; 
					System.out.print (dados[j] + " ");
					}
					System.out.println( " deseja sortear novamente algum valor ? Você já usou "+ chances + " chance(s) (sim//nao)");
					String sim = s.next();
					while (sim.equals("sim") && chances<3) {
						for (j=0;j<5 ;j++ ) {
							System.out.println( " deseja sortear novamente o número: " + dados[j] );
							String sorteia = s.next();
							if (sorteia.equals("sim")) {
								dados[j]= r.nextInt (6) +1;
							}
						}
						System.out.println( " seus valores atuais são ");
						for (j=0;j<5 ;j++ ) {
							System.out.print( dados[j] + " " );
							
						}
						chances++;
					    System.out.println( " deseja sortear algum valor novamente ?  Você já usou "+ chances + " chance(s) (sim//nao)");
						sim = s.next();
						
						}
						if(chances>2){
						    System.out.println(" Infelizmente suas chances se esgotaram ");
						}
						System.out.println( " vamos a etapa de pontos agora. Digite oq deseja marcar:  ás, duque, terno, quadra, quina, sena, full, seguida, quadrada e general ");
						decisao = s.next();
						
						for (f=0;f<5 ;f++ ) {
							if(dados[f]==1){
								num1++;
							}
							if(dados[f]==2){
								num2++;
							}
							if(dados[f]==3){
								num3++;
							}
							if(dados[f]==4){
								num4++;
							}
							if(dados[f]==5){
								num5++;
							}
							if(dados[f]==6){
								num6++;
							}
						}
						if(decisao.equals("ás") && verifás[i]==0 && num1!=0){
							for (f=0;f<5 ;f++ ) {
									if(dados[f]==1){
										valor=valor+dados[f];
							}
							}
							pontos[i]=pontos[i]+valor;
							System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
							valor=0;
							verifás[i]=1;
							}else{
							    if(decisao.equals("ás")){
								System.out.println(" Opção inválida, perdeu sua jogada");
							    }
							}

								if(decisao.equals("duque") && veriduque[i]==0 && num2!=0){
							for (f=0;f<5 ;f++ ) {
									if(dados[f]==2){
										valor=valor+dados[f];
							}
							}
							pontos[i]=pontos[i]+valor;
							System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
							valor=0;
							veriduque[i]=1;
							}else{
								if(decisao.equals("duque")){
								System.out.println(" Opção inválida, perdeu sua jogada");
								}
							}


							if(decisao.equals("terno") && veriterno[i]==0 && num3!=0){
							for (f=0;f<5 ;f++ ) {
									if(dados[f]==3){
										valor=valor+dados[f];
							}
							}
							pontos[i]=pontos[i]+valor;
							System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
							valor=0;
							veriterno[i]=1;
							}else{
							    if(decisao.equals("terno")){
								System.out.println(" Opção inválida, perdeu sua jogada");
								
							    }
							}



							if(decisao.equals("quadra") && veriquadra[i]==0 && num4!=0){
							for (f=0;f<5 ;f++ ) {
									if(dados[f]==4){
										valor=valor+dados[f];
							}
							}
							pontos[i]=pontos[i]+valor;
							System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
							valor=0;
							veriquadra[i]=1;
							}else{
							    if(decisao.equals("quadra")){
								System.out.println(" Opção inválida, perdeu sua jogada");
							    }
							}



							if(decisao.equals("quina") && veriquina[i]==0 && num5!=0){
							for (f=0;f<5 ;f++ ) {
									if(dados[f]==5){
										valor=valor+dados[f];
							}
							}
							pontos[i]=pontos[i]+valor;
							System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
							valor=0;
							veriquina[i]=1;
							}else{
							    if(decisao.equals("quina")){
								System.out.println(" Opção inválida, perdeu sua jogada");
							    }
							}




							if(decisao.equals("sena") && verisena[i]==0 && num6!=0){
							for (f=0;f<5 ;f++ ) {
									if(dados[f]==6){
										valor=valor+dados[f];
							}
							}
							pontos[i]=pontos[i]+valor;
							System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
							valor=0;
							verisena[i]=1;
							}else{
							    if(decisao.equals("sena")){
								System.out.println(" Opção inválida, perdeu sua jogada");
							    }
							}

							if (decisao.equals("seguida") && num6-num1!=0 && veriseg[i]==0 ){
								if ((num1==1 && num2==1 && num3==1 && num4==1 && num5==1)  || (num2==1 && num3==1 && num4==1 && num5==1 && num6==1)) {
										if(chances==1){
									pontos[i]=pontos[i]+ 35;
								}
									if(chances>1){
									pontos[i]=pontos[i]+ 30;
									veriseg[i]=1;
									System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
								}
							}else{
							    if(decisao.equals("seguida")){
								System.out.println(" Opção inválida, perdeu sua jogada");
							    }
							}

							f=0;
							int contfull=0,contquadrada=0;

							if (decisao.equals("general") && verigeneras[i]==0 ) {
								for(j=1;j<5;j++){
									if (dados[0]==dados[j]) {
										f=f++;
									}
								}
								if(f==4){
									if(chances==1){
									pontos[i]=pontos[i]+ 55;
								}
									if(chances>1){
									pontos[i]=pontos[i]+ 50;
								}
									System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
									verigeneras[i]=1;
								}else{
								    if(decisao.equals("general")){
									System.out.println(" Opção inválida, perdeu sua jogada");
								}
								}
							}else{
							    if(decisao.equals("general")){
								System.out.println(" Opção inválida, perdeu sua jogada");
								
							}

							for(j=0;j<4;j++){
								for(f=j+1;f<5;f++){
								if(dados[j]+dados[f]==5){
									contfull=contfull++;
								}
								}
							}
							if (decisao.equals("full") && contfull!=0 && verifull[i]==0) {
					            if((num1==3 && num2==2) ||  (num1==3 && num3==2) ||   (num1==3 && num4==2) ||   (num1==3 && num5==2) ||   (num1==3 && num6==2) || (num2==3 && num1==2) || (num2==3 && num3==2)|| (num2==3 && num4==2)|| (num2==3 && num5==2)|| (num2==3 && num6==2)|| (num3==3 && num4==2) || (num3==3 && num1==2) || (num3==3 && num2==2) || (num3==3 && num5==2) || (num3==3 && num6==2)   || (num4==3 && num1==2) || (num4==3 && num2==2) || (num4==3 && num3==2) || (num4==3 && num5==2) || (num4==3 && num6==2)   || (num5==3 && num1==2)  || (num5==3 && num2==2) || (num5==3 && num3==2) || (num5==3 && num4==2)|| (num5==3 && num6==2)|| (num6==3 && num1==2)  || (num6==3 && num2==2) || (num6==3 && num3==2)|| (num6==3 && num4==2)|| (num6==3 && num5==2) ){
					                full= true;
					            }
								if (full) {
										if(chances==1){
									pontos[i]=pontos[i]+ 25;
								}
									if(chances>1){
									pontos[i]=pontos[i]+ 20;
								}
									System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
									verifull[i]=1;
								
								}else{
									System.out.println(" Opção inválida, perdeu sua jogada");
								}
							}else{
								System.out.println(" Opção inválida, perdeu sua jogada");
							}
                            contfull=0;
                            full=false;

							if(decisao.equals("quadrada") && veriquadrada[i]==0){
								for (j=0;j<4 ;j++ ) {
									for (f=1;f<5 ;f++) {
										if(dados[j]==dados[f]){
											contquadrada++;
										}
									}
									if(contquadrada==4){
										quadradas=true;
									}
									contquadrada=0;
								}
								if (quadradas) {
										if(chances==1){
									pontos[i]=pontos[i]+ 45;
								}
									if(chances>1){
									pontos[i]=pontos[i]+ 40;
								}
									System.out.println(" Sua marcação foi executada e sua pontuação agora é " + pontos[i]);
									veriquadrada[i]=1;
								
								}else{
								    if(decisao.equals("quadrada")){
									System.out.println(" Opção inválida, perdeu sua jogada");
								    }
								}
							}else{
							    if(decisao.equals("quadrada")){
								System.out.println(" Opção inválida, perdeu sua jogada");
							    }
							}
							quadradas=false;
                            contquadrada=0;
							}

							
							i++;
			}
			controdadas++;
		}
		int testedevencedor=0,resultado=0;
		for (j=0;j<jogadores-1 ;j++ ) {
			for (f=1;f<jogadores ;f++) {
				if(pontos[j]>pontos[f]){
					testedevencedor++;
				}
				if(testedevencedor==jogadores-1){
					resultado=j;
				}
			}
			testedevencedor=0;
		}
		if(resultado!=0){
			System.out.println(" O vencedor foi o jogador " + resultado + " com " + pontos[resultado] + " pontos");
		}else{
			System.out.println(" O vencedor foi o jogador " + jogadores + " com " + pontos[jogadores] + " pontos");
		
		}
	}
	
}
}