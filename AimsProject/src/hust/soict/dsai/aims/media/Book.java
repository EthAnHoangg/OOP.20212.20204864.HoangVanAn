package hust.soict.dsai.aims.media;
import java.util.*;

import static java.util.Arrays.asList;


public class Book extends Media{
    private List<String> authors =  new ArrayList<>();
    private String content;
    List<String> contentTokens;
    Map<String,Integer> wordFrequency;

//  ------------ Constructor ------------
    public Book(){};

    public Book(String title, String category, float cost){
        super(title, category, cost);
    }

    public Book(String title, String category, float cost, String content){
        super(title, category, cost);
        this.content = content;
        processContent();
    }
//  ------------ Getter and setter ------------
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        processContent();
    }

    public void processContent(){
        contentTokens = asList(getContent().split("[\\p{Punct}\\s]+"));
        wordFrequency = new TreeMap<>();
        java.util.Collections.sort(contentTokens);
        Map<String,Integer> tmpWordFrequency = new HashMap<>();
        for (String token: contentTokens){
            if (wordFrequency == null) {
                wordFrequency.put(token, 1);
            } else {
                if (wordFrequency.get(token) == null){
                    wordFrequency.put(token, 1);
                } else {
                    int value = wordFrequency.get(token);
                    wordFrequency.put(token, value + 1);
                }
            }
        }
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
                + getAuthors() + " - " +  contentTokens.size() +
                " - " + contentTokens + " - " + wordFrequency;
    }
}
