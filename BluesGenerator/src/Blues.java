
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class to sing the blues (not that anyone singing the blues would have
 * access to this program).
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version 1.0
 */

public class Blues {
    
    private ArrayList<String> nouns, verbs, adjectives;
    private String author;
    private ArrayList<String> first;
    private ArrayList<String> middle;
    private ArrayList<String> last;
    private Random rand = new Random();
    
    public Blues() {
        nouns = new ArrayList(30);
        nouns.add("sun");
        nouns.add("morning");
        nouns.add("baby");
        nouns.add("woman");
        nouns.add("guy");
        nouns.add("down");
        nouns.add("highway");
        nouns.add("behind");
        nouns.add("trees");
        nouns.add("heart");
        nouns.add("someone");
        nouns.add("wind");
        nouns.add("pine");
        nouns.add("top");
        nouns.add("love");
        nouns.add("rooster");
        nouns.add("day");
        nouns.add("farm");
        nouns.add("yard");
        nouns.add("dog");
        nouns.add("hound");
        nouns.add("hobo");
        nouns.add("home");
        nouns.add("peace");
        nouns.add("crossroads");
        nouns.add("knees");
        nouns.add("ride");
        nouns.add("side");
        
        verbs = new ArrayList(20);
        verbs.add("went");
        verbs.add("fell");
        verbs.add("asked");
        verbs.add("save");
        verbs.add("saved");
        verbs.add("flag");
        verbs.add("flagged");
        verbs.add("passed");
        verbs.add("going");
        verbs.add("gonna");
        verbs.add("rollin");
        verbs.add("leavin");
        verbs.add("headin");
        verbs.add("go");
        verbs.add("crow");
        verbs.add("howl");
        verbs.add("settin");
        verbs.add("rose");
        
        adjectives = new ArrayList(20);
        adjectives.add("big");
        adjectives.add("lonesome");
        adjectives.add("miserable");
        adjectives.add("lazy");
        adjectives.add("strange");
        adjectives.add("red");
        adjectives.add("little");
        adjectives.add("dark");
        adjectives.add("small");
        adjectives.add("wet");
        adjectives.add("cold");
        adjectives.add("lonely");
        adjectives.add("crazy");
        adjectives.add("poorly");
        adjectives.add("cheap");
        adjectives.add("wasted");
        
        first = new ArrayList(10);
        first.add("Blind");
        first.add("Cripple");
        first.add("Lame");
        first.add("Maimed");
        first.add("Poor");
        first.add("Infirmed");
        first.add("Deaf");
        first.add("Dead");
        first.add("Deceased");
        
        
        middle = new ArrayList(10);
        middle.add("Lemon");
        middle.add("Lime");
        middle.add("Pear");
        middle.add("Joe");
        middle.add("Willie");
        middle.add("Sadie");
        middle.add("Big Mama");
        middle.add("Bessie");
        middle.add("Fat River Dumpling");
        middle.add("Orange");
        middle.add("Pineapple");
        
        
        last = new ArrayList(10);
        last.add("Obama");
        last.add("Clinton");
        last.add("Bush");
        last.add("Reagan");
        last.add("Carter");
        last.add("Truman");
        last.add("Kennedy");
        last.add("Roosevelt");
        last.add("Hoover");
        last.add("McKinley");
        last.add("Johnson");
        
        author = randomAuthor();
    }
    
    public Blues(String author) {
        nouns = new ArrayList(30);
        nouns.add("sun");
        nouns.add("morning");
        nouns.add("baby");
        nouns.add("woman");
        nouns.add("guy");
        nouns.add("down");
        nouns.add("highway");
        nouns.add("behind");
        nouns.add("trees");
        nouns.add("heart");
        nouns.add("someone");
        nouns.add("wind");
        nouns.add("pine");
        nouns.add("top");
        nouns.add("love");
        nouns.add("rooster");
        nouns.add("day");
        nouns.add("farm");
        nouns.add("yard");
        nouns.add("dog");
        nouns.add("hound");
        nouns.add("hobo");
        nouns.add("home");
        nouns.add("peace");
        nouns.add("crossroads");
        nouns.add("knees");
        nouns.add("ride");
        nouns.add("side");
        
        verbs = new ArrayList(20);
        verbs.add("went");
        verbs.add("fell");
        verbs.add("asked");
        verbs.add("save");
        verbs.add("saved");
        verbs.add("flag");
        verbs.add("flagged");
        verbs.add("passed");
        verbs.add("going");
        verbs.add("gonna");
        verbs.add("rollin");
        verbs.add("leavin");
        verbs.add("headin");
        verbs.add("go");
        verbs.add("crow");
        verbs.add("howl");
        verbs.add("settin");
        verbs.add("rose");
        
        adjectives = new ArrayList(20);
        adjectives.add("big");
        adjectives.add("lonesome");
        adjectives.add("miserable");
        adjectives.add("lazy");
        adjectives.add("strange");
        adjectives.add("red");
        adjectives.add("little");
        adjectives.add("dark");
        adjectives.add("small");
        adjectives.add("wet");
        adjectives.add("cold");
        adjectives.add("lonely");
        adjectives.add("crazy");
        adjectives.add("poorly");
        adjectives.add("cheap");
        adjectives.add("wasted");
        
        first = new ArrayList(10);
        first.add("Blind");
        first.add("Cripple");
        first.add("Lame");
        first.add("Maimed");
        first.add("Poor");
        first.add("Infirmed");
        first.add("Deaf");
        first.add("Dead");
        first.add("Deceased");
        
        
        middle = new ArrayList(10);
        middle.add("Lemon");
        middle.add("Lime");
        middle.add("Pear");
        middle.add("Joe");
        middle.add("Willie");
        middle.add("Sadie");
        middle.add("Big Mama");
        middle.add("Bessie");
        middle.add("Fat River Dumpling");
        middle.add("Orange");
        middle.add("Pineapple");
        
        
        last = new ArrayList(10);
        last.add("Obama");
        last.add("Clinton");
        last.add("Bush");
        last.add("Reagan");
        last.add("Carter");
        last.add("Truman");
        last.add("Kennedy");
        last.add("Roosevelt");
        last.add("Hoover");
        last.add("McKinley");
        last.add("Johnson");
        
        this.author = author;
    }

    private String randomAuthor() {
        
        String name = new String();
        
        name += first.get((int) (rand.nextFloat()*first.size()));
        name += " ";
        name += middle.get((int) (rand.nextFloat()*middle.size()));
        name += " ";
        name += last.get((int) (rand.nextFloat()*last.size()));
        
        return name;
        
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String generateSong() {
        String song = new String();
        
//        if(rand.nextInt(5) == 0) {
            song += "Well I " + verbs.get(rand.nextInt(verbs.size())) + " a " +
                    nouns.get(rand.nextInt(nouns.size())) + " in Boston";
            
            song += "\n" + song + "\n";
            
            song += "I " + verbs.get(rand.nextInt(verbs.size())) + " to " +
                    verbs.get(rand.nextInt(verbs.size())) + " a " +
                    adjectives.get(rand.nextInt(adjectives.size())) + " " +
                    nouns.get(rand.nextInt(nouns.size()));
//        }
        return song;
    }
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Have you shot a man in Memphis? (Y/N)");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();
        
        if(answer.equalsIgnoreCase("y")) {
            System.out.println("Have a burbon on me." + "\n");
        }
        else if(answer.equalsIgnoreCase("n")) {
            System.out.println("You do not have the blues.");
            System.exit(0);
        }
        else {
            System.out.println("Well you can't read, you may have the blues yet...");
        }

         
        
        if(args.length == 0) {
            Blues song = new Blues();
            System.out.println("Name: " + song.getAuthor() + "\n");
            System.out.println(song.generateSong());
        }
        else {
            String name = args[0].toLowerCase();
            
            if(name.contains("sierra") || name.contains("sequoia") || 
                name.contains("auburn") || name.contains("rainbow")) {
            System.out.println("You cannot sing the Blues.");
            }
            else {
            Blues song = new Blues(args[0]);
            song.generateSong();
            }
        }
    }
}
