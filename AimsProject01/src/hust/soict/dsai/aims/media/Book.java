package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors =  new ArrayList<String>();

    public Book(String title, String category, float cost){
        super(title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
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
