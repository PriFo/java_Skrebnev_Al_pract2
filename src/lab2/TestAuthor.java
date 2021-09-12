package lab2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Author author = new Author(in.nextLine(), in.next(), in.next().charAt(0));
        System.out.println("Author's name: "+author.getName());
        System.out.println("Author's email: "+author.getEmail());
        System.out.println("Author's gender: "+author.getGender());
        System.out.println(author.toString());
        author.setEmail(in.next());
        System.out.println(author.toString());
        in.close();
    }
}
