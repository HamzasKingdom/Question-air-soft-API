/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionairv1.dao;

import com.questionairv1.model.Question;
import com.questionairv1.model.Questionnaire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ting
 */
public class QuestionDAOImpl implements QuestionDAO{
    Connection connection = ConnectionFactory.getConnection();

    //Get Questions By QrId
    @Override    
    public ArrayList<Question> getQuestionsByQrId(int IdQr) {
        
        ArrayList<Question> questionList = new ArrayList<>();
        
        ResultSet rs;
        Statement st;
        String query = "SELECT * "
                + "FROM questions,questionnaires,belong "
                + "WHERE belong.IdQ = questions.IdQ AND belong.IdQr = questionnqires.IdQr AND IdQr = ?;";
        
        try {            
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next() == true) {

                Question question = new Question();
                question.setIdQuest(rs.getLong(1));
                question.setContentQuest(rs.getString(2));
                question.setTypeQuest(rs.getString(3));                              
                question.setMin(rs.getLong(4));
                question.setMax(rs.getLong(5));
                question.setIdCat(rs.getLong(6));             
              


                questionList.add(question);
            }
            } catch (SQLException ex) {
            System.out.println(ex);
        }
        return questionList;
    }

    //Get Questionnaire By Id
    @Override
    public Questionnaire getQuestionnaireById(int IdQr) {
        Questionnaire questionnaire = new Questionnaire();
        
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM questionnaires WHERE IdQr = ?;");
            statement.setInt(1, IdQr);
            ResultSet resultSet = statement.executeQuery();
            
            //ArrayList<Questionnaire> questionnaireList = new ArrayList<>();
            while (!resultSet.wasNull()){
                
                
                questionnaire.setIdQuestnr(resultSet.getLong(1));
                questionnaire.setIdClient(resultSet.getLong(2));
                questionnaire.setNameQuestnr(resultSet.getString(3));
                
                
                //questionnaireList.add(questionnaire);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return questionnaire;
    }

    
    
    //Get All the questionnaires
    @Override
    public ArrayList<Questionnaire> getAllTheQuestionnaires() {
        ArrayList<Questionnaire> questionnaireList = new ArrayList<>();
        
        ResultSet rs;
        Statement st;
        String query = "SELECT * FROM questionnaires";
        
        try {
            
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next() == true) {

                Questionnaire questionnaire = new Questionnaire();
                questionnaire.setIdQuestnr(rs.getLong(1));
                questionnaire.setIdClient(rs.getLong(2));
                questionnaire.setNameQuestnr(rs.getString(3));             
                
                questionnaireList.add(questionnaire);
                
            }
            } catch (SQLException ex) {
            System.out.println(ex);
        }
        return questionnaireList;
    }
    
    //Get all the questions
    @Override
    public ArrayList<Question> getAllTheQuestions(){
        ArrayList<Question> questionList = new ArrayList<>();
        
        ResultSet rs;
        Statement st;
        String query = "SELECT * FROM questions";
        
        try {
            
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next() == true) {

                Question question = new Question();
                question.setIdQuest(rs.getLong(1));
                question.setContentQuest(rs.getString(2));
                question.setTypeQuest(rs.getString(3));                              
                question.setMin(rs.getLong(4));
                question.setMax(rs.getLong(5));
                question.setIdCat(rs.getLong(6));
                
                


                questionList.add(question);
                
//                st.close();
//                rs.close();
//                con.close();
            }
            } catch (SQLException ex) {
            System.out.println(ex);
        }
        return questionList;
    }
}
