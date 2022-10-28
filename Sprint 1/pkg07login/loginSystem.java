package pkg07quiz;

import java.util.Scanner;

public class loginSystem {

    loginInfo lInfo = new loginInfo();
    Scanner sc = new Scanner(System.in);
    String askUser = "Usuário: ";
    String askPass = "Senha: ";
    String loginError = "Usuário e/ou senha incorretos";
    String newPass = "Nova senha: ";
    String newUser = "Novo Usuário: ";
    timeSystem clock = new timeSystem();

    public boolean login(loginInfo info) {
        System.out.println(askUser);
        String tempUser = sc.nextLine();
        System.out.println(askPass);
        String tempPass = sc.nextLine();
        if(tempUser.equals(info.getUserName()) & tempPass.equals(info.getPassword()) ){
           clock.checkTime();
            return true;
        } else{
            System.out.println(loginError);
          return false;
        }
   
     
    }
    
   
    
}
