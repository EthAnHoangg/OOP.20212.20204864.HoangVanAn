package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors =  new ArrayList<String>();

    public Book(){
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
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
}
