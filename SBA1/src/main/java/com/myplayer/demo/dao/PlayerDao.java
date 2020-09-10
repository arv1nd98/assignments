package com.myplayer.demo.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.myplayer.demo.model.Player;

@Transactional
public class PlayerDao {
	@Autowired
	SessionFactory factory;
	public PlayerDao() {
	}
	public PlayerDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public String createPlayer(Player player)
	{
		try 
		{
		Session session=factory.getCurrentSession();
		session.save(player);
		return "Player created";
	} 
		catch (Exception e) {
		e.printStackTrace();
	}
	return "Cannot create player";
}
	
	public Player getPlayerById(int playerId) {
		try {
			Session session=factory.getCurrentSession();
			Player player=(Player)session.get(Player.class, playerId);
			return player;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String updatePlayerById(Player player) {
		try {
			Session session=factory.getCurrentSession();
			session.update("Player", player);
			return "Player Updated";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot Update";
	}
	
	public Player searchPlayerById(int playerId){
		Session session=factory.openSession();
	
		Player player=(Player)session.get(Player.class, playerId);
		
		return player;
	}
	
	
	
	public ArrayList<Player> searchPlayerByTeam(String playerTeam){
		Session session=factory.openSession();
		Criteria ct=session.createCriteria(Player.class);
		ct.add(Restrictions.ilike("playerTeam", playerTeam));
		
		ArrayList<Player> player=(ArrayList<Player>) ct.list();
		return player;
	}
	
	public ArrayList<Player> viewAllPlayers() {
		try {
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("from Player");
			ArrayList<Player> player=(ArrayList<Player>)query.list();
			
			
			return player;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String deletePlayerById(int playerId) {
		try {
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("delete from Player p  where p.playerId=:playerId");
			query.setParameter("playerId", playerId);
			int res=query.executeUpdate();
			if(res>0)
				return "Entry Deleted";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot Delete";
	}
	
	public String deletePlayerByName(String playerName) {
		try {
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("delete from Player p  where p.playerName=:playerName");
			query.setParameter("playerName", playerName);
			int res=query.executeUpdate();
			if(res>0)
				return "Entry Deleted";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot Delete";
	}
}
