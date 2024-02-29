package service;

import model.MemberDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String addusers();

    String count();

    String getUserList();

    String join(MemberDto memberDto);

    String login(MemberDto memberDto);

    String idResarch(String username);

    String findUserById(MemberDto memberDto);

    String deleteUser(String username);

}
