import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;
import java.time.ZoneId;
import java.time.zone.*;


class Main {
  public static void main(String[] args) {
    String[] dadosLogin = {"Nathália", "123mudar"};
    String nomeUser, password;
    
    Scanner scann = new Scanner(System.in);

    System.out.println("Entre com as credenciais:");
    
    System.out.println("Entre com seu usuário:");
    nomeUser = scann.nextLine();
    
    System.out.println("Entre com sua senha:");
    password = scann.nextLine();

    
    if(nomeUser.equals(dadosLogin[0]) && password.equals(dadosLogin[1])){

        Calendar now = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("America/Sao_Paulo")));
        
 
        int hora_atual = now.get(Calendar.HOUR_OF_DAY);
      
        if(hora_atual == 6 && hora_atual < 12){
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        }else if(hora_atual == 12 && hora_atual < 18){
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        }else if(hora_atual == 18 && hora_atual < 00 ){
        	System.out.println("Boa noite, você se logou ao nosso sistema.");
        }else if(hora_atual >= 00 && hora_atual < 6){
        	System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
        else{
          System.out.println("Usuário e/ou senha incorretos.");
          
        }             
    
  }
}
}