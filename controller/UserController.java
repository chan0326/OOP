package controller;
import builder.MemberBuilder;
import model.MemberDto;
import service.UserService;
import serviceimpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class UserController    {
    UserService userService ;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        return userService.addUsers();
    }

    public String join(Scanner sc) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return userService.join(new MemberBuilder()
                        .username(sc.next())
                        .pw(sc.next())
                        .pwAgain(sc.next())
                        .name(sc.next())
                        .phoneNumber(sc.next())
                        .adress(sc.next())
                        .adress(sc.next())
                .build());
    }

    public String login(Scanner sc) {
        System.out.println("ID를 입력하세요");
        System.out.println("PW를 입력하세요");
        return userService.login(new MemberBuilder()
                        .username(sc.next())
                        .pw(sc.next())
                .build());
    }

    public MemberDto findUserById(Scanner sc) {
        System.out.println("검색할 ID를 입력하세요");
        return userService.findUserById(sc.next());
    }

    public String updatePassword(Scanner sc) {
        System.out.println(" ID를 입력하세요");
        System.out.println("수정할 PW를 입력하세요");
        return userService.updatePassword(new MemberBuilder()
                        .username(sc.next())
                        .pw(sc.next())
                .build());
    }

    public String deleteUser(Scanner sc) {
        System.out.println("삭제할 ID를 입력하세요");
        return userService.deleteUser(sc.next());
    }

    public List<MemberDto> getUserList() {
        System.out.println("전체 목록 출력");
        return userService.getUserList();
    }

    public  List<MemberDto> findUsersByName(Scanner sc) {
        return userService.findUsersByName(sc.next());
    }

    public List<MemberDto> findUsersByJob(Scanner sc) {
        return  userService.findUsersByJob(sc.next());
    }

    public String countUsers() {
        return userService.countUsers();
    }

    public Map<String, MemberDto> getUserMap() {
        return userService.getUserMap();
    }
}


