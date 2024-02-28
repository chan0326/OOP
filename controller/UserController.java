package controller;
import builder.MemberBuilder;
import model.MemberDto;
import service.UserService;
import serviceimpl.UserServiceImpl;
import java.util.Map;
import java.util.Scanner;


public class UserController   {

    UserService us ;


    public UserController() {

        this.us = new UserServiceImpl();
    }
    public String join(Scanner sc){
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호 " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return us.join(new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
                .pwAgain(sc.next())
                .name(sc.next())
                .adress(sc.next())
                .job(sc.next())
                .build());

    }
    public String addUsers() {
//        String addUsers = us.addUsers();
        return us.addUsers();
    }
    public String count() {
        return us.count();
    }
    public String login(Scanner sc) {
        System.out.println("아이디름 입력하세요");
        System.out.println("비밀번호를 입력하세요");


        return us.login(new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
                .build());
    }

    public String idResarch(Scanner sc) {
        System.out.println("검색할 id를 입력해 주세요");
        return us.idResarch(sc.next());
    }

    public String changePW(Scanner sc) {
        System.out.println(" ID를 입력하세요");
        System.out.println("변경할 pw를 입력하세요");
        return us.changePW(new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
                .build());
    }

    public Map<String, MemberDto> getUserList(){
        return us.getUserList();
    }
}


