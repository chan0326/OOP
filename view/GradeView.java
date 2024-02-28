package view;

import builder.MemberBuilder;
import builder.SubjectBuilder;
import model.MemberDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceimpl.GradeServiceImpl;
import serviceimpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름을 입력하세요");

        UtilService util =  UtilServiceImpl.getInstance();
        GradeService grade =  GradeServiceImpl.getInstance();
        MemberDto student =new MemberBuilder()
                .name(sc.next())
                .build();
        SubjectDto subjects = new  SubjectBuilder()
                .koreanScore(util.createRandomDouble(0,100))
                .englishScore(util.createRandomDouble(0,100))
                .mathScore(util.createRandomDouble(0,100))
                .bulid();




         int totalScore = grade.sumScore(subjects);
         double averScore = grade.avgScore(totalScore);




        System.out.printf("""
                         ============= 성적표 ==============
                        이름 : %s\s
                        국어점수 : %s
                        영어점수 : %s
                        수학점수 : %s
                        점수합계 : %s
                        평균점수 : %s
                        """,
        student.getName(),
        (subjects.getKoreanScore()),
        (subjects.getEnglishScore()),
        (subjects.getMathScore()),
        (totalScore),
        (averScore));


    }

}
