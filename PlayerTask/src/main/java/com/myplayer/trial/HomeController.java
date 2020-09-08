package com.myplayer.trial;

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

import com.myplayer.trial.dao.PlayerDao;
import com.myplayer.trial.model.Player;



@Controller
public class HomeController {
	
	@Autowired
	PlayerDao dao;
	
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		return "home";
	}
	@RequestMapping(value = "/home")
	public String homee(Model model) {
		return "home";
	}
	
	
	
	
	@RequestMapping(value = "/createPlayerPage")
	public String createPlayerPage(Model model) {
		return "createPlayerPage";
	}
	
	@RequestMapping(value = "/updatePlayerPage")
	public String updatePlayerPage(Model model) {
		return "updatePlayerPage";
	}
	
	@RequestMapping(value = "/searchDirectoryPage")
	public String searchDirectoryPage(Model model) {
		return "searchDirectoryPage";
	}
	
	@RequestMapping(value = "/deleteEntryPage")
	public String deleteEntryPage(Model model) {
		return "deleteEntryPage";
	}
	
	
	
	
	@RequestMapping(value = "/createPlayer")
	public String createPlayer(Model model,@ModelAttribute Player player) {
		String status=dao.createPlayer(player);
		return "createSuccess";
	}
	
	int playerId=0;
	
	@RequestMapping(value="/searchForUpdate")
	public String searchForUpdate(Model model,@RequestParam("playerId") String playerId) {
		int pId=Integer.parseInt(playerId);
		this.playerId=pId;
		Player player=dao.getPlayerById(pId);
		model.addAttribute(player);
		return "updatePlayerPage";
	}
	
	@RequestMapping(value="/updatePlayer")
	public String updatePlayer(@ModelAttribute Player player){
		player.setPlayerId(playerId);
		dao.updatePlayerById(player);
		return "updateSuccess";
	}
	
	
	@RequestMapping(value="/searchPlayerByIdPage")
	public String searchPlayerByIdPage(Model model) {
		return "searchPlayerByIdPage";
	}
	@RequestMapping(value="/searchPlayerByNamePage")
	public String searchPlayerByNamePage(Model model) {
		return "searchPlayerByNamePage";
	}
	@RequestMapping(value="/searchPlayerByTeamPage")
	public String searchPlayerByTeamPage(Model model) {
		return "searchPlayerByTeamPage";
	}
	@RequestMapping(value="/viewAllPlayers")
	public String viewAllPlayers(Model model) {
		ArrayList<Player> player=dao.viewAllPlayers();
		model.addAttribute("player", player);
		return "displaySearchResult";
	}
	
	
	@RequestMapping(value="/searchPlayerById")
	public String searchPlayerById(Model model,@RequestParam("playerId") String playerId) {
		ArrayList<Player> player=dao.searchPlayerById(Integer.parseInt(playerId));
		model.addAttribute("player", player);
		return "displaySearchResult";
	}
	
	@RequestMapping(value="/searchPlayerByName")
	public String searchPlayerByName(Model model,@RequestParam("playerName") String playerName) {
		ArrayList<Player> player=dao.searchPlayerByName(playerName);
		model.addAttribute("player", player);
		return "displaySearchResult";
	}
	
	@RequestMapping(value="/searchPlayerByTeam")
	public String searchPlayerByTeam(Model model,@RequestParam("playerTeam") String playerTeam) {
		ArrayList<Player> player=dao.searchPlayerByTeam(playerTeam);
		model.addAttribute("player", player);
		return "displaySearchResult";
	}
	
	@RequestMapping(value="/deletePlayerByIdPage")
	public String deletePlayerByIdPage(Model model) {
		return "deletePlayerByIdPage";
	}
	@RequestMapping(value="/deletePlayerByNamePage")
	public String deletePlayerByNamePage(Model model) {
		return "deletePlayerByNamePage";
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