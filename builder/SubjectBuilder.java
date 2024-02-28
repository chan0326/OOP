package builder;

import model.SubjectDto;

public class SubjectBuilder {

    private double koreanScore;
    private double englishScore;
    private double mathScore;

    public SubjectBuilder koreanScore(double koreanScore){
        this.koreanScore =koreanScore;
        return this;
    }
    public SubjectBuilder englishScore(double englishScore){
        this.englishScore =englishScore;
        return this;
    }
    public SubjectBuilder mathScore(double mathScore){
        this.mathScore = mathScore;
        return this;
    }
    public SubjectDto bulid(){return new SubjectDto(koreanScore,englishScore,mathScore);}
}
