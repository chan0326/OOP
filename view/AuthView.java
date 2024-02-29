package view;

import builder.MemberBuilder;
import controller.Authcontroller;
import model.MemberDto;

import java.util.Scanner;

public class AuthView {
    public static void main( Scanner sc) {
        Authcontroller ctri = new Authcontroller();
        ctri.addusers();
        while(true) {
            System.out.println("[사용자메뉴]\n" +
                    "0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n" +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("1-회원가입");
                    ctri.join(sc);

                    break;
                case "2":
                    System.out.println("2-로그인");
                    ctri.login(sc);
                    break;
                case "3":
                    System.out.println("3-ID검색");
                    ctri.idResarch(sc);
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    ctri.findUserById(sc);
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    ctri.deleteUser(sc);
                    break;
                case "6":
                    System.out.println("6-회원목록");
                    ctri.getUserList();
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    ctri.findUsersByName(sc).forEach((i))->{
                    System.out.println(i);
                };
                    break;

                case "8":
                    System.out.println("8-직업검색");
                    break;
                case "9":
                    System.out.println("9-회원수");
                    ctri.count();
                    break;

            }
        }

    }
}
