package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("--------집전화-------");
        phone.setCompany("금성");
        phone.setCall("제임스");
        System.out.println(phone.toString());
        System.out.println("--------휴대전화-------");
        CellPhone cp =new CellPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp.toString());
        System.out.println("-------아이폰--------");
        Iphone ip = new Iphone();
        ip.setCompany("애플");
        ip.setCall("톰");
        ip.setPortable(true);
        ip.setData("1032258");
        System.out.println(ip);
        System.out.println("-------갤럭시 노트-------");
        AndroidPhone ap = new AndroidPhone();
        ap.setCompany("삼성");
        ap.setCall("제인");
        ap.setPortable(true);
        ap.setData("23561616");
        ap.setSize("10인치");
        System.out.println(ap);
    }
}
class AndroidPhone extends Iphone{
    private String size;
    public  static  String BRAND = "갤럭시";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AndroidPhone" +'\n'+
                "{ 제조사='" + super.company + '\n' +
                ", 수신자='" + super.call + '\n' +
                "이동성=" + super.portable +
                ", 이동유무='" + super.move + '\n' +
                "브랜드 = '" + BRAND +  '\n' +
                "data='" + data + '\n' +
                "size='" + size + " } ";
    }
}

class CellPhone extends Phone{
    protected boolean portable; // 이동성, 휴대가능서
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if (portable){
            this.setMove("폰을 휴대 가능");
        }  else {
            this.setMove("폰을 휴대 불가능");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" + '\n'+
                "제조사='" + super.company + '\n' +
                ", 수신자='" + super.call + '\n' +
                "이동성=" + portable +
                ", 이동유무='" + move +
                '}';
    }
}

class Iphone extends CellPhone{
    protected String data;
    public  static  String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "iPhone" + '\n'+
                "{ 제조사='" + super.company + '\n' +
                ", 수신자='" + super.call + '\n' +
                "이동성=" + super.portable +
                ", 이동유무='" + super.move + '\n' +
                "브랜드 = '" + BRAND +  '\n' +
                "data='" + data + " } ";
    }
}

class Phone {
    protected     String company, call; //인스턴스 변수 =멤버변수 => 힙영역
    static final double TAX_RATE = 0.095; //스택틱 변수 = 전역변수 =>스태틱영역

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다";
    }

    public String getCall() {
        return call;
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사='" + company + '\n' +
                ", 수신자='" + call + '\n' +
                '}';
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다";

    }
}
