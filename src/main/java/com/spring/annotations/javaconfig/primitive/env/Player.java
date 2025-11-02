package com.spring.annotations.javaconfig.primitive.env;
//no source code
public class Player {
    private int playerNo;
    private String playerName;
    private String team;
    private int rank;

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNo=" + playerNo +
                ", playerName='" + playerName + '\'' +
                ", team='" + team + '\'' +
                ", rank=" + rank +
                '}';
    }
}
