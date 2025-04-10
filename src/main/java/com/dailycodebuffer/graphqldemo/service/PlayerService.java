package com.dailycodebuffer.graphqldemo.service;

import com.dailycodebuffer.graphqldemo.model.Player;
import com.dailycodebuffer.graphqldemo.model.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PlayerService {
    private List<Player> players = new ArrayList<>();
    AtomicInteger id = new AtomicInteger(0);

    public List<Player> findAll() {
        return players;
    }

    public Optional<Player> findOne(Integer id) {
        return players.stream()
                .filter(player -> player.Id() == id).findFirst();
    }

    public Player create(String name, Team team) {
        Player player = new Player(id.incrementAndGet(), name, team);
        players.add(player);
        return player;
    }

    public Player delete(Integer id) {
        Player player = players.stream().filter(c -> c.Id() == id)
                .findFirst().orElseThrow(() -> new IllegalArgumentException());
        players.remove(player);
        return player;
    }

    public Player update(Integer id, String name, Team team) {
        Player updatedPlayer = new Player(id, name, team);
        Optional<Player> optional = players.stream()
                .filter(c -> c.Id() == id).findFirst();

        if (optional.isPresent()) {
            Player player = optional.get();
            int index = players.indexOf(player);
            players.set(index, updatedPlayer);
        } else {
            throw new IllegalArgumentException("Invalid Player");
        }
        return updatedPlayer;
    }

    @PostConstruct
    private void init() {
        players.add(new Player(id.incrementAndGet(), "MS Dhoni", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Rohit Sharma", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Jasprit Bumrah", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Rishabh Pant", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Suresh Raina", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Virat Kohli", Team.RCB));
        players.add(new Player(id.incrementAndGet(), "KL Rahul", Team.LSG));
        players.add(new Player(id.incrementAndGet(), "Shubman Gill", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Hardik Pandya", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Ravindra Jadeja", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Sanju Samson", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Prithvi Shaw", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Shreyas Iyer", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Ruturaj Gaikwad", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Mohammed Shami", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Ishan Kishan", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Axar Patel", Team.DC));
        players.add(new Player(id.incrementAndGet(), "David Warner", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Dinesh Karthik", Team.RCB));
        players.add(new Player(id.incrementAndGet(), "Faf du Plessis", Team.RCB));
        players.add(new Player(id.incrementAndGet(), "Bhuvneshwar Kumar", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Kane Williamson", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Trent Boult", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Yuzvendra Chahal", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Rahul Tripathi", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Aiden Markram", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "T Natarajan", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Umran Malik", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Deepak Chahar", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Arshdeep Singh", Team.PBKS));
        players.add(new Player(id.incrementAndGet(), "Shikhar Dhawan", Team.PBKS));
        players.add(new Player(id.incrementAndGet(), "Liam Livingstone", Team.PBKS));
        players.add(new Player(id.incrementAndGet(), "Sam Curran", Team.PBKS));
        players.add(new Player(id.incrementAndGet(), "Kagiso Rabada", Team.PBKS));
        players.add(new Player(id.incrementAndGet(), "Marcus Stoinis", Team.LSG));
        players.add(new Player(id.incrementAndGet(), "Quinton de Kock", Team.LSG));
        players.add(new Player(id.incrementAndGet(), "Krunal Pandya", Team.LSG));
        players.add(new Player(id.incrementAndGet(), "Nicholas Pooran", Team.LSG));
        players.add(new Player(id.incrementAndGet(), "Mayank Agarwal", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Jason Holder", Team.LSG));
        players.add(new Player(id.incrementAndGet(), "Mitchell Marsh", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Anrich Nortje", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Kuldeep Yadav", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Devdutt Padikkal", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Yashasvi Jaiswal", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Shimron Hetmyer", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Jos Buttler", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Pat Cummins", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Andre Russell", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Sunil Narine", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Nitish Rana", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Lockie Ferguson", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Rinku Singh", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Tim Southee", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Venkatesh Iyer", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Mohit Sharma", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Rahul Tewatia", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Wriddhiman Saha", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Matthew Wade", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Rashid Khan", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Alzarri Joseph", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Sai Sudharsan", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Abhinav Manohar", Team.GT));
        players.add(new Player(id.incrementAndGet(), "Shivam Dube", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Ben Stokes", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Ajinkya Rahane", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Ambati Rayudu", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Maheesh Theekshana", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Mukesh Choudhary", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Adam Milne", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Devon Conway", Team.CSK));
        players.add(new Player(id.incrementAndGet(), "Tilak Varma", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Dewald Brevis", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Tim David", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Jofra Archer", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Cameron Green", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Piyush Chawla", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Hrithik Shokeen", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Arjun Tendulkar", Team.MI));
        players.add(new Player(id.incrementAndGet(), "Washington Sundar", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Glenn Phillips", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Heinrich Klaasen", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Marco Jansen", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Fazalhaq Farooqi", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Harry Brook", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Kartik Tyagi", Team.SRH));
        players.add(new Player(id.incrementAndGet(), "Phil Salt", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Rilee Rossouw", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Sarfaraz Khan", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Lalit Yadav", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Mustafizur Rahman", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Chetan Sakariya", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Khaleel Ahmed", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Manish Pandey", Team.DC));
        players.add(new Player(id.incrementAndGet(), "Joe Root", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Adam Zampa", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Navdeep Saini", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Obed McCoy", Team.RR));
        players.add(new Player(id.incrementAndGet(), "Jason Roy", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Litton Das", Team.KKR));
        players.add(new Player(id.incrementAndGet(), "Vaibhav Arora", Team.KKR));

    }
}
