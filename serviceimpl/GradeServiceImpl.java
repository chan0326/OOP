package serviceimpl;

import model.SubjectDto;
import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {

    private  static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return instance;
    }
    @Override
    public int sumScore(SubjectDto subjects) {
      int  sumScore = (int)(subjects.getMathScore())+
                      (int)(subjects.getKoreanScore()+
                      (int)(subjects.getEnglishScore()));

        return sumScore;
    }

    @Override
    public double avgScore(int totalScore) {
        return Math.round( (float) totalScore /3);
    }
}
