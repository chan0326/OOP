package model;

public class SubjectDto {
    private int id;
    private double koreanScore;
    private double englishScore;
    private double mathScore;

    @Override
    public String toString() {
        return "Subject{" +
                "koreanScore=" + koreanScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }

    public double getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(double koreanScore) {
        this.koreanScore = koreanScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public SubjectDto(double koreanScore, double englishScore, double mathScore) {
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
}
