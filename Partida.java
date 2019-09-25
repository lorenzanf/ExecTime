import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class Partida implements IPartida {
private Time timeLocal;
private Time timeVisitante;
private int scoreVisitante;
private int scoreLocal;
private Date dataPartida;
public Partida() {
 
}



public void iniciarPartida(Time timeLocal, Time timeVisitante) {
 Random r = new Random();
 System.out.println("Partida Iniciando !!");
 this.timeLocal = timeLocal;
 this.timeVisitante = timeVisitante;
 this.scoreLocal = r.nextInt(11);
 this.scoreVisitante = r.nextInt(11);
}


public void mostrarResultado() {
  System.out.println(timeLocal.getNome()+" "+scoreLocal+ " X "+scoreVisitante+" "+timeVisitante.getNome());
 }
public Time getTimeLocal() {
 return timeLocal;
}
public void setTimeLocal(Time timeLocal) {
 this.timeLocal = timeLocal;
}
public Time getTimeVisitante() {
 return timeVisitante;
}
public void setTimeVisitante(Time timeVisitante) {
 this.timeVisitante = timeVisitante;
}
public int getScoreVisitante() {
 return scoreVisitante;
}
public void setScoreVisitante(int scoreVisitante) {
 this.scoreVisitante = scoreVisitante;
}
public int getScoreLocal() {
 return scoreLocal;
}
public void setScoreLocal(int scoreLocal) {
 this.scoreLocal = scoreLocal;
}
public Date getDataPartida() {
 return dataPartida;
}
public void setDataPartida(Date dataPartida) {
 this.dataPartida = dataPartida;
}

public void finalizarPartida() {
if(this.scoreLocal > this.scoreVisitante)
{
this.timeLocal.setQtdVitorias(1);
this.timeLocal.setQtdPontos(3);
this.timeVisitante.setQtdDerrotas(1);
}
else if (this.scoreLocal == this.scoreVisitante)
{
this.timeLocal.setQtdEmpates(1);
this.timeLocal.setQtdPontos(1);
this.timeVisitante.setQtdEmpates(1);
this.timeVisitante.setQtdPontos(1);
}
else
{
this.timeVisitante.setQtdVitorias(1);
this.timeVisitante.setQtdPontos(3);
this.timeLocal.setQtdDerrotas(1);
}
System.out.printf("%s \nVitorias:%d,Empates:%d,Derrotas:%d,Pontos:%d",this.timeLocal.getNome(),this.timeLocal.getQtdVitorias(),this.timeLocal.getQtdEmpates(),this.timeLocal.getQtdDerrotas(),this.timeLocal.getQtdPontos());
System.out.printf("\n%s \nVitorias:%d,Empates:%d,Derrotas:%d,Pontos:%d",this.timeVisitante.getNome(),this.timeVisitante.getQtdVitorias(),this.timeVisitante.getQtdEmpates(),this.timeVisitante.getQtdDerrotas(),this.timeVisitante.getQtdPontos());
}
public static void main(String[] args) {
 // TODO Auto-generated method stub
Time t1 = new Time();
Time t2 = new Time();
Scanner input = new Scanner(System.in);
System.out.println("Entre com o time local:");
t1.setNome(input.nextLine());
System.out.println("Entre com o time visitante:");
t2.setNome(input.nextLine());
Partida p = new Partida();
p.iniciarPartida(t1,t2);
p.mostrarResultado();
p.finalizarPartida();
t1.listar();
t2.listar();
}



@Override
public void iniciarPartida() {
	// TODO Auto-generated method stub
	
}
}