package service;

import model.MemberDto;

import java.util.List;
import java.util.Map;

public interface UserService {
    String addUsers();
    String join(MemberDto user);
    String login(MemberDto user);
    MemberDto findUserById(String username);
    String updatePassword(MemberDto user);
    String deleteUser(String username);
    List<MemberDto> getUserList();
    List<MemberDto> findUsersByName(String name);
    List<MemberDto> findUsersByJob(String job);
    String countUsers();

    Map<String, MemberDto> getUserMap();

}