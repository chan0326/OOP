package service;

import model.MemberDto;

import java.util.List;
import java.util.Map;

public interface UserService {
    String addUsers();

    String count();
    String join(MemberDto memberDto);

    String  login(MemberDto memberDto);

    String idResarch(String username);

    String deleteUser(String username);

    Map<String, MemberDto> getUserList();

    String changePW(MemberDto memberDto);
    List<MemberDto> findUsersByName(String name);
    List<MemberDto> findUsersByJob(String job);
}