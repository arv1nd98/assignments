package com.myplayer.demo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myplayer.demo.dao.PlayerDao;
import com.myplayer.demo.model.Player;


@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value = "/home")
	public String homee(Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/EditPage")
	public String EditPage(Model model) {
		return "EditPage";
	}
	
	@RequestMapping(value = "/updatePage")
	public String updatePlayerPage(Model model) {
		return "updatePage";
	}
	
	@RequestMapping(value = "/searchPage")
	public String searchPage(Model model) {
		return "searchPage";
	}
	
	@RequestMapping(value = "/deletePage")
	public String deletePage(Model model) {
		return "deletePage";
	}
	
	@Autowired
	PlayerDao dao;
	
	@RequestMapping(value = "/createPlayer")
	public String createPlayer(Model model,@ModelAttribute Player player) {
		String status=dao.createPlayer(player);
		return "createPlayer";
	}
	
		int playerId=0;
		
		@RequestMapping(value="/searchForUpdate")
		public String searchForUpdate(Model model,@RequestParam("playerId") String playerId) {
			int pId=Integer.parseInt(playerId);
			this.playerId=pId;
			Player player=dao.getPlayerById(pId);
			model.addAttribute(player);
			return "updatePage";
		}
		
		@RequestMapping(value="/updatePlayer")
		public String updatePlayer(@ModelAttribute Player player){
			player.setPlayerId(playerId);
			dao.updatePlayerById(player);
			return "updateSuccess";
		}
		
		@RequestMapping(value="/searchPlayerById")
		public String searchPlayerById(Model model,@RequestParam("playerId") String playerId) {
			Player player=dao.searchPlayerById(Integer.parseInt(playerId));
			model.addAttribute("player", player);
			return "displaySearchResult";
		}
		
		@RequestMapping(value="/searchPlayerByTeam")
		public String searchPlayerByTeam(Model model,@RequestParam("playerTeam") String playerTeam) {
			ArrayList<Player> player=dao.searchPlayerByTeam(playerTeam);
			model.addAttribute("player", player);
			return "displaySearchResult";
		}
	
		@RequestMapping(value="/viewAllPlayers")
		public String viewAllPlayers(Model model) {
			ArrayList<Player> player=dao.viewAllPlayers();
				
			model.addAttribute("player", player);
			return "displaySearchResult";
		}
		
		@RequestMapping(value="/deletePlayerById")
		public String deletePlayerById(Model model,@RequestParam("playerId") String playerId) {
			dao.deletePlayerById(Integer.parseInt(playerId));
			return "deleteSuccess";
		}
		
		@RequestMapping(value="/deletePlayerByName")
		public String deletePlayerByName(Model model,@RequestParam("playerName") String playerName) {
			dao.deletePlayerByName(playerName);
			return "deleteSuccess";
		}
		
}
