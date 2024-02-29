package serviceimpl;

import builder.MemberBuilder;
import model.MemberDto;
import service.AuthService;
import service.GradeService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private  static AuthService instance = new AuthServiceImpl();

    private AuthServiceImpl(){
        this.users =  new HashMap<>();
    }

    public static AuthService getInstance(){
        return instance;
    }

    Map<String,MemberDto> users ;



    @Override
    public String addusers() {
        Map<String ,MemberDto> map = new HashMap<>();
        UtilService utilService = UtilServiceImpl.getInstance();
        for (int i =0 ;i<5;i++){
            String username = utilService.CreatRandomUsername();
            map.put(username,new MemberBuilder()
                            .username(username)
                            .name(utilService.creatRadomName())
                    .build());
        }
        users = map;
        return users.size()+"개 더미값 추가";
    }

    @Override
    public String count() {
        System.out.println("회원수 : "+users.size()+"명");
        return "";
    }

    @Override
    public String getUserList() {
        System.out.println(users+"\n");
        return "";
    }

    @Override
    public String join(MemberDto memberDto) {
        users.put(memberDto.getUsername(), memberDto);
        System.out.println("회원가입 성공");
        return "";
    }

    @Override
    public String login(MemberDto memberDto) {
        MemberDto mapInusers = users.get(memberDto.getUsername());
        if (mapInusers== null){
            System.out.println("아이디,비번이 틀렸습니다");
        }else {
            if (memberDto.getPw().equals(mapInusers.getPw())){
                System.out.println("로그인에 성공하였습니다");
            }else {
                System.out.println("비밀번호가 틀렸습니다");
            }
        }
        return "";
    }

    @Override
    public String idResarch(String username) {
        MemberDto mapInusers = users.get(username);
        if (mapInusers == null){
            System.out.println("해당 ID가 존재하지 않습니다");
        }else {
            System.out.println("해당 ID가 존재합니다");
            System.out.println(mapInusers);
        }

        return "";
    }

    @Override
    public String findUserById(MemberDto memberDto) {
        MemberDto Mapinuser = users.get(memberDto.getUsername());
        if (Mapinuser == null){
            System.out.println("ID가 틀렸습니다");
        }else {
            System.out.println("비밀번호를 수정하였습니다");
            Mapinuser.setPw(memberDto.getPw());
        }
        return "";
    }

    @Override
    public String deleteUser(String username) {
        MemberDto Mapinuser = users.get(username);
        if (Mapinuser == null){
            System.out.println("ID가 틀렸습니다");
        }else {
            System.out.println(username+"ID를 삭제하였습니다.");
            users.remove(username);
        }
        return "";
    }
}
