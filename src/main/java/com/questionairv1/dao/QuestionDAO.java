/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionairv1.dao;

import com.questionairv1.model.Question;
import com.questionairv1.model.Questionnaire;
import java.util.ArrayList;

/**
 *
 * @author ckcen
 */
public interface QuestionDAO {
    public ArrayList<Question> getAllTheQuestions();
    public ArrayList<Questionnaire> getAllTheQuestionnaires();
    public Questionnaire getQuestionnaireById(int IdQr);
}
