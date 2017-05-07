/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookSearch;

/**
 *
 * @author dhrisyad
 */
//Create protected array of Users and Books ,populate these arrays with usernames and book names
public class InitiateObjects {

    Books[] booksArray = new Books[100];
    Users[] usersArray = new Users[10];
    int userIndex = 0;
    int booksIndex = 0;

    public  InitiateObjects() {
        addUsers("dhrisya", "test");
        addUsers("dhrisya1", "test1");
        addUsers("new", "test");
        addBooks("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "1", "fantasy");
        addBooks("One Hundred Years of Solitude", "Gabriel García Márquez", "2", "magical realism");
        addBooks("test", "pest", "1", "test");
    }

    public Books[] getBooksArray() {
        return booksArray;
    }

    public Users[] getUsersArray() {
        return usersArray;
    }

    private void addUsers(String _userName, String _password) {
        Users users = new Users();
        users.setUsername(_userName);
        users.setPassword(_password);
        usersArray[userIndex] = users;
        userIndex++;
    }

    private void addBooks(String _bookName, String _author, String _edition, String _genre) {
        Books books = new Books();
        books.setBookName(_bookName);
        books.setAuthor(_author);
        books.setEdition(_edition);
        books.setGenre(_genre);
        booksArray[booksIndex] = books;
        booksIndex++;
    }

}
