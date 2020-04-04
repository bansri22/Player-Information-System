/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Player;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bansri
 */
public class PlayerDAO extends GenericDAO<Player> {
    
    public PlayerDAO() 
      {
        super(Player.class);
  
      }
    
    public List<Player> findAll(){
        return findResults( "Player.findAll", null);
    }
    
    public Player findByID( int id){
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return findResult( "Player.findByid", map);
    }
     public List<Player> findByFirstName( String firstName){
        Map<String, Object> map = new HashMap<>();
        map.put("firstname", firstName);
        return findResults( "Player.findByFirstNmae", map);
    }
      public List<Player> findByLastName(String lastName){
        Map<String, Object> map = new HashMap<>();
        map.put("lastname", lastName);
        return findResults( "Player.findByLastNmae", map);
    }
    public List<Player> findByJoined(Date date){
        Map<String, Object> map = new HashMap<>();
        map.put("date", date);
        return findResults( "Player.findByJoined", map);
    }
    
    public Player findByEmail( String email){
        Map<String, Object> map = new HashMap<>();
        map.put("email", email);
        return findResult( "player.findByEmail", map);
    }
    
}
