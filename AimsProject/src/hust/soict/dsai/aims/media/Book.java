package hust.soict.dsai.aims.media;
import java.util.*;

import static java.util.Arrays.asList;


public class Book extends Media{
    private List<String> authors =  new ArrayList<>();

    private String content;
    private List<String> contentTokens = asList(content.split("[\\p{Punct}\\s]+"));
    private Map<String,Integer> wordFrequency;

//  ------------ Constructor ------------
    public Book(String title, String category, float cost){
        super(title, category, cost);
    }

    public Book(String title, String category, float cost, String content){
        super(title, category, cost);
        this.content = content;
    }
//  ------------ Getter and setter ------------
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void processContent(){
        Collections.sort(contentTokens);
        Map<String,Integer> tmpWordFrequency = new HashMap<>();
        for (String token: contentTokens){
            tmpWordFrequency.merge(token, 1, Integer::sum);
        }
        TreeMap<String, Integer> wordFrequency = new TreeMap<>(tmpWordFrequency);
    }

    public boolean checkAuthor(String authorName){
        for (int i = 0; i < authors.size(); i++){
            if (authors.get(i).equalsIgnoreCase(authorName)){
                return true;
            }
        }
        return false;
    }

    public void addAuthor(String authorName){
        if (!checkAuthor(authorName)){
            authors.add(authorName);
        } else {
            System.out.println("Author has already been added before!");
        }
    }

    public void removeAuthor(String authorName){
        if (checkAuthor(authorName)){
            authors.remove(authorName);
        } else {
            System.out.println("Author hasn't been added!");
        }
    }

    public String toString(){
        return "Book - " + getTitle() + " - " +  getCategory() + " - "
                + getAuthors() + " - " + contentTokens.size() +
                " - " + contentTokens + " - " + wordFrequency;
    }
}
