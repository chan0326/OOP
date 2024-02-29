package serviceimpl;
import builder.MemberBuilder;
import model.MemberDto;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {

    List<MemberDto>list;



    Map<String, MemberDto> users ;

    public UserServiceImpl() {
        this.users =  new HashMap<>();
        this.list = new ArrayList<>();
    }

    @Override
    public String addUsers() {
        Map<String, MemberDto> map = new HashMap<>(); //String 유저네임
        UtilService utile = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = utile.CreatRandomUsername();
            map.put(username,
                    new MemberBuilder()
                            .username(username)
                            .name(utile.creatRadomName())
                            .build());
        }
        users = map;
        return users.size()+" 개 더미값 추가" ;
    }

    @Override
    public String count() {
//        String count = String.valueOf(users.size());
//        return count; 한줄로 간소화

        System.out.println("회원수는 :"+users.size()+"명");
        return "" + users.size();
    }



    @Override
    public String join(MemberDto memberDto) {
        users.put(memberDto.getUsername(), memberDto);
        return "회원가입 성공";
    }

    @Override
    public String login(MemberDto memberDto) {


        MemberDto meberInMap = users.get(memberDto.getUsername());
        if (meberInMap == null){
            System.out.println("아이디,혹은 비밀번호 오류입니다.");
        }else {
        if(meberInMap.getPw().equals(memberDto.getPw())){
            System.out.println("로그인 성공입니다.");
        } else {
            System.out.println("비밀번호 오류입니다.");
         }
        }

        return "";
    }

    @Override
    public String idResarch(String username) {
        MemberDto usernameInMap = users.get(username);
        if (usernameInMap == null){
            System.out.println("해당 id가 존재하지 않습니다.");
        }else {
            System.out.println("해당 id가 존재합니다.");
            System.out.println(usernameInMap);
        }


        return "";
    }

    @Override
    public String deleteUser(String username) {
        MemberDto usernameInMap = users.get(username);
        if (usernameInMap == null){
            System.out.println("ID 오류입니다");
        }else {users.remove(username);
            System.out.println(username+"계정을 삭제하였습니다.");}
        return "";
    }

    @Override
    public String changePW(MemberDto memberDto) {
        MemberDto usernameInMap = users.get(memberDto.getUsername());
        if (usernameInMap.getUsername().equals(memberDto.getUsername())){
            usernameInMap.setPw(memberDto.getPw());
            System.out.println("비밀번호가 변경되었습니다.");

        }else{
            System.out.println("해당아이디가 존재하지 않습니다.");
        }



        return "";
    }

    @Override
    public List<MemberDto> findUsersByName(String name) {
        list = (List<MemberDto>) users;
        System.out.println(list);


        return list;
    }

    @Override
    public List<MemberDto> findUsersByJob(String job) {
        list = (List<MemberDto>) users;
        System.out.println(list);
        return list;
    }

    @Override
    public Map<String, MemberDto> getUserList() {
        System.out.println("전체 목록 출력");
        users.forEach((k,v)-> {
            System.out.printf("아이디: %s, 회원정보: %s\n", k, v);
        });
        return users;

    }
}
