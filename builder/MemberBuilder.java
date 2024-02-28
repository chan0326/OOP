package builder;

import model.MemberDto;

public class MemberBuilder {
    private String userId;

    private String pw;

    private String pwAgain;

    private String name;

    private String username;

    private String phoneNumber;

    private String adress;

    private String job;
    private double height;
    private double weight;

    public MemberBuilder UserId(String id){
        this.userId =userId;
        return this;
    }
    public MemberBuilder pw(String pw){
        this.pw =pw;
        return this;
    }
    public MemberBuilder pwAgain(String pwAgain){
        this.pwAgain =pwAgain;
        return this;
    }
    public MemberBuilder name(String name){
        this.name =name;
        return this;
    }
    public MemberBuilder username(String username){
        this.username =username;
        return this;
    }
    public MemberBuilder adress(String adress){
        this.adress =adress;
        return this;
    }
    public MemberBuilder job(String job){
        this.job =job;
        return this;
    }
    public MemberBuilder phoneNumber(String phoneNumber){
        this.phoneNumber =phoneNumber;
        return this;
    }
    public MemberBuilder height(double height){
        this.height =height;
        return  this;
    }
    public MemberBuilder weight(double weight){
        this.weight =weight;
        return  this;
    }

    public MemberDto build(){
        return new MemberDto(userId,pw,pwAgain,name,username,phoneNumber,adress,job,height,weight);
    }


}
