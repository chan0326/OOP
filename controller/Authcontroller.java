package controller;

import builder.MemberBuilder;
import model.MemberDto;
import service.AuthService;
import serviceimpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class Authcontroller  {
    AuthService as ;

    public Authcontroller() {
        this.as = new AuthServiceImpl();
    }

    public String addusers() {

        return as.addusers();
    }

    public String count() {
        return as.count();
    }

    public String join(Scanner sc) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return as.join(new MemberBuilder()
                        .username(sc.next())
                        .pw(sc.next())
                        .pwAgain(sc.next())
                        .phoneNumber(sc.next())
                        .adress(sc.next())
                        .job(sc.next())
                .build());
    }

    public String getUserList() {
        return as.getUserList();
    }

    public String login(Scanner sc) {
        System.out.println("ID,PW을 입력해주세요");
        return as.login(new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
                .build()
        );
    }

    public String idResarch(Scanner sc) {
        System.out.println("검색하려는 ID를 입력하세요");
        return as.idResarch(sc.next());
    }

    public String findUserById(Scanner sc) {
        System.out.println(" ID입력");
        System.out.println("수정 PW입력");
        return as.findUserById(new MemberBuilder()
                .username(sc.next())
                .pw(sc.next())
                .build());
    }

    public String deleteUser(Scanner sc) {
        System.out.println("삭제할 ID를 입력하세요");
        return as.deleteUser(sc.next());
    }
}
