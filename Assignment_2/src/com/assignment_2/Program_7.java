package com.assignment_2;

import java.time.LocalDate;

/* 7) Atheltic class :- aid, aname, address, dob
Circket_player :- teamname, jersyno, totalruns, highestscore, avg, totalmatchedplayed.
Football_player :- teamname, jersyno, totalgoals, highestgoal_in_a_match,
totalmatchedplayed.
Hockey:- teamname, jersyno, totalgoals, highest_goal_in_a_match, total_matched_played*/

class Atheltic {
	int aid;
	String aname;
	String address;
	private LocalDate dob;

	public Atheltic(int aid, String aname, String address, LocalDate dob) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.address = address;
		this.dob = dob;
	}

}

class Circket_player extends Atheltic {

	public Circket_player(int aid, String aname, String address, LocalDate dob) {
		super(aid, aname, address, dob);
		// TODO Auto-generated constructor stub
	}

	String teamname;
	int jersyno;
	int totalruns;
	int highestscore;
	double avg;
	int totalmatchedplayed;

	public Circket_player(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalruns, int highestscore, double avg, int totalmatchedplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalruns = totalruns;
		this.highestscore = highestscore;
		this.avg = avg;
		this.totalmatchedplayed = totalmatchedplayed;
	}

	@Override
	public String toString() {
		return "Circket_player [teamname=" + teamname + ", jersyno=" + jersyno + ", totalruns=" + totalruns
				+ ", highestscore=" + highestscore + ", avg=" + avg + ", totalmatchedplayed=" + totalmatchedplayed
				+ ", aid=" + aid + ", aname=" + aname + ", address=" + address ;
	}

}

class Football_player extends Atheltic {

	public Football_player(int aid, String aname, String address, LocalDate dob) {
		super(aid, aname, address, dob);
		// TODO Auto-generated constructor stub
	}

	String teamname;
	int jersyno;
	int totalgoals;
	int highestgoal_in_a_match;

	public Football_player(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalgoals, int highestgoal_in_a_match) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.highestgoal_in_a_match = highestgoal_in_a_match;
	}

	@Override
	public String toString() {
		return "Football_player [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
				+ ", highestgoal_in_a_match=" + highestgoal_in_a_match + ", aid=" + aid + ", aname=" + aname
				+ ", address=" + address;
	}

}

class Hockey extends Atheltic {

	public Hockey(int aid, String aname, String address, LocalDate dob) {
		super(aid, aname, address, dob);
		// TODO Auto-generated constructor stub
	}

	String teamname;
	int jersyno;
	int totalgoals;
	int highest_goal_in_a_match;
	int total_matched_played;

	public Hockey(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno, int totalgoals,
			int highest_goal_in_a_match, int total_matched_played) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.highest_goal_in_a_match = highest_goal_in_a_match;
		this.total_matched_played = total_matched_played;
	}

	@Override
	public String toString() {
		return "Hockey [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
				+ ", highest_goal_in_a_match=" + highest_goal_in_a_match + ", total_matched_played="
				+ total_matched_played + ", aid=" + aid + ", aname=" + aname + ", address=" + address;
	}

}

public class Program_7 {

	public static void main(String[] args) {
		Circket_player cr = new Circket_player(01, "Virat kohali", "mumbai", LocalDate.of(1996, 10, 06), "RCB", 07,
				20000, 139, 73, 400);
		Football_player fb = new Football_player(02, "Ronaldo", "Pune", LocalDate.of(1990, 01, 01),
				"Indian national football team", 07, 1000, 1000);
		Hockey h = new Hockey(3, "Dhanchand", "Hyd", LocalDate.of(1960, 05, 07), "Indian Hockey", 2, 700, 11, 1000);
		System.out.println(cr);
		System.out.println(fb);
		System.out.println(h);
	}
}
