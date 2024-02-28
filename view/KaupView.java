package view;

import builder.MemberBuilder;
import controller.KaupController;
import model.MemberDto;
import repository.KaupRepository;
import service.KaupService;
import service.UtilService;
import serviceimpl.KaupServiceImpl;
import serviceimpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {


    public static void main(Scanner sc) {



        UtilService util =  UtilServiceImpl.getInstance();
        MemberDto member = new MemberBuilder()
                .height(util.createRandomDouble(150,50))
                .weight(util.createRandomDouble(30,79))
                .build();
        KaupService ks =  KaupServiceImpl.getInstance();
        String bmi = ks.createBmi(member);
        String bodyMass = ks.createBodymass(bmi);

        System.out.printf("===========Bmi계산기============\n" +
                "bmi : %s\n"+
                "체질량 : %s\n"+
                "===========Bmi계산기============",
                bmi,bodyMass);
    }


}
