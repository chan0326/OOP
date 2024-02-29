package serviceimpl;
import builder.MemberBuilder;
import model.MemberDto;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, MemberDto> users;
    private UserServiceImpl(){
        this.users = new HashMap<>();
    }
    public static UserService getInstance(){return instance;}


    @Override
    public String addUsers() {
        Map<String,MemberDto> map= new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i=0;i<5;i++){
            String username = util.CreatRandomUsername();
            map.put(username,
                    new MemberBuilder()
                            .username(username)
                            .pw("1")
                            .pwAgain("1")
                            .name(util.creatRadomName())
                            .build());
        }
        users =map;

        return users.size()+"더미값 추가";
    }

    @Override
    public String join(MemberDto user) {
        users.put(user.getUsername(),user);
        return "회원가입 성공";
    }

    @Override
    public String login(MemberDto user) {
        if (users.get(user.getUsername())!= null && users.get(user.getUsername()).getPw().equals(user.getPw())){
            System.out.println("로그인에 성공하였습니다");
        }else {
            System.out.println("아이디,비번이 오류입니다.");
        }
        return "";
    }

    @Override
    public MemberDto findUserById(String username) {
        if (users.get(username) != null){
            System.out.println(username+"의 정보입니다."+users);
        }else {
            System.out.println("존재하지 않는 ID입니다.");
        }
        return null;
    }

    @Override
    public String updatePassword(MemberDto user) {
        if (users.get(user.getUsername()) !=null){
            users.get(user.getUsername()).setPw(user.getPw());
        }else {
            System.out.println("존재하지 않는 ID입니다.");
        }
        return "성공";
    }

    @Override
    public String deleteUser(String username) {
        if (users.get(username) !=null){
            users.remove(username);
        }else {
            System.out.println("존재하지 않는 ID입니다.");
        }
        return "성공";
    }

    @Override
    public List<MemberDto> getUserList() {

        return new ArrayList<>(users.values());
    }

    @Override
    public List<MemberDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<MemberDto> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return users.size()+"명";
    }

    @Override
    public Map<String, MemberDto> getUserMap() {

        return users;
    }
}
