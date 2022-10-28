package pkg07quiz;

public class Main {

    public static void main(String[] args) {
        loginSystem log = new loginSystem();
        loginInfo info = new loginInfo();
        info.setPassword("root");
        info.setUserName("root");
        log.login(info);
    }

}
