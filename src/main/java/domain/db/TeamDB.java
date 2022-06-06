package domain.db;

import domain.model.Team;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

public class TeamDB {
    private int sequence=0;
    private final List <Team> teams = new ArrayList<Team>();


    public TeamDB(){
        this.add(new Team("Ferrari","Charles Leclerc, Carlos Sainz", "Ferrari", 16 ));
        this.add(new Team("Mercedes", "Lewis Hamilton, George Russel", "Mercedes", 8));
    }

    public void add(Team team){
        if (team == null)
            throw new IllegalArgumentException("Geen geldig team.");
        this.sequence++;
        team.setId(sequence);
        teams.add(team);
    }



    public Team find(int id){
        for (Team team : teams)
            if (team.getId() == id)
                return team;
            return null;
    }

    public Team find(String naam){
       if(naam == null || naam.isEmpty()){
           throw new IllegalArgumentException("Naam mag niet leeg zijn");
       }
       for(Team team : teams){
           if (team.getNaam().contains(naam)){
               return team;
           }
       }
       return null;
    }


    public List<Team> getAlle() {
        return teams;
    }


    public Team getMeesteKampioenschappen(){
        if (teams.size() == 0){
            return null;
        }
        Team meesteKampioenschappen = teams.get(0);
        for (Team team : teams){
            if (team.getWc() > meesteKampioenschappen.getWc()){
                meesteKampioenschappen = team;
            }
        }
        return meesteKampioenschappen;
    }


    public int getAantal(){
        return getAlle().size();
    }


}

