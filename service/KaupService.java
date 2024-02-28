package service;

import model.MemberDto;

public interface KaupService {
    public String createBmi(MemberDto meber);

    public  String createBodymass(String bmi);
}
