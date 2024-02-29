package service;

import model.MemberDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String addusers();

    String getUserList();

    String join(MemberDto memberDto);

    String login(MemberDto memberDto);

    String idResarch(String username);

    String findUserById(MemberDto memberDto);

    String deleteUser(String username);

    String count();


    List<MemberDto> findUsersByName(String name);
}
