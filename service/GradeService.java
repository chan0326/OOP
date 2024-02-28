package service;

import model.SubjectDto;

public interface GradeService {

    public   int sumScore(SubjectDto subjects);
    public   double avgScore(int totalScore);
}
