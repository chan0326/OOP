package serviceimpl;

import model.MemberDto;
import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {
    private  static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){}

    public static KaupService getInstance(){
        return instance;
    }
    @Override
    public String createBmi(MemberDto meber) {
        double heightMeter = (meber.getHeight()/100)*(meber.getHeight()/100);
        double weight = meber.getWeight();
        double bmi = Math.round(weight/heightMeter);
        return String.valueOf(bmi);
    }

    @Override
    public String createBodymass(String bmi) {
        double doBmi=Double.parseDouble(bmi);
        String stbmi = String.valueOf(doBmi);
        if (  doBmi < 10 ){
            stbmi = "저체중";
        } else if ( doBmi <23.9  ) {
            stbmi = "정상";

        } else if ( doBmi <29.9) {
            stbmi = "과체중";
        } else if ( doBmi <36.9) {
            stbmi = "경도비만";
        } else if ( doBmi <38.9) {
            stbmi = "중도비만";
        }else   {
            stbmi = "고도비만";
        }


        return stbmi;
    }
}
