package model;

public class MemberDto {
    private int id;
    private String userId;

    private String pw;

    private String pwAgain;

    private String name;

    private String Username;

    private String phoneNumber;

    private String adress;

    private String job;
    private double height;
    private double weight;



    public String getId() {return userId;
    }

    public void setId(String id) {
        this.userId = userId;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPwAgain() {
        return pwAgain;
    }

    public void setPwAgain(String pwAgain) {
        this.pwAgain = pwAgain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "userid='" + userId + '\'' +
                ", pw='" + pw + '\'' +
                ", pwAgain='" + pwAgain + '\'' +
                ", name='" + name + '\'' +
                ", Username='" + Username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight + "\n"+
                '}';
    }

    public MemberDto(String userId, String pw, String pwAgain, String name, String Username, String phoneNumber, String adress, String job, double height, double weight) {
        this.userId = userId;
        this.pw = pw;
        this.pwAgain = pwAgain;
        this.name = name;
        this.Username = Username;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}
