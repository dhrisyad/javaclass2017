/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookSearch;

/**
 *
 * @author dhrisyad
 * @description This class will have methods to search the Books array and get
 * back the details of the book if its present else return not present ,this
 * will be called by the book search UI
 */
public class BookSearch {

    public Object[][] bookSearch(String _bookName, Books[] booksArray) {
        Object[][] returnObj = new Object[1][4];
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] == null) {
                break;
            }
            if (booksArray[i].getBookName().equalsIgnoreCase(_bookName)) {
                returnObj[0][0] = booksArray[i].getBookName();
                returnObj[0][1] = booksArray[i].getAuthor();
                returnObj[0][2] = booksArray[i].getEdition();
                returnObj[0][3] = booksArray[i].getGenre();
                break;
            }
        }
        return returnObj;
    }

    public Object[][] bookSearch(Books[] booksArray) {
        Object[][] returnObj = new Object[100][4];
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] == null) {
                break;
            }
            returnObj[i][0] = booksArray[i].getBookName();
            returnObj[i][1] = booksArray[i].getAuthor();
            returnObj[i][2] = booksArray[i].getEdition();
            returnObj[i][3] = booksArray[i].getGenre();
        }
        
        return returnObj;
    }
}
