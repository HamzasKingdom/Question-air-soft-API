/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionairv1.dao;

import com.questionairv1.model.Question;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ting
 */
public class QuestionDAOImpl implements QuestionDAO{
    Connection connection = ConnectionFactory.getConnection();
    
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
                
                //dont know how to set type
                
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
