/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pth.services;

import com.dht.pojo.Question;
import com.pth.pojo.JdbcUtils;
import java.util.List;
import java.sql.SQLException;
import java.sql.Collection;
import java.sql.ResultSet;
import java.sql.PrepareStatement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuestionServices {
    public List<Question> getQuestions() throws SQLException{
        List<Question> results= new ArrayLit<>();
        try (Connection conn=JdbcUtils.getConn()) {
            String sql="SELECT * FROM question order by rand() LIMIT 2";
            PreparedStatement stm= conn.prepareCall(sql);
            stm.setInt(1,limit);
            ResultSet rs= stm.excuteQuery();
            
            while(rs.set()){
                Question q=new Question(rs.getString("id"),rs.getString("connect"),rs.getInt("category_id"));
                rs.getString("id");
                
                results.add(s);
            }
            return results;
        }
    }
}
