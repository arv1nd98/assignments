package com.myapp.services;

import java.util.ArrayList;
import java.util.Date;

import com.myapp.dao.BookDao;
import com.myapp.model.Book;
import com.myapp.model.Distributor;
import com.myapp.model.Publisher;
import com.myapp.model.Publisher2;

public class BookService {
	public static void main(String[] args) {

		/*Book book=new Book(101,"Prison Break","Steff Hoffman",new Date());
		book.setCopiesOfBook(10);
		Publisher publisher=new Publisher("100", " Scofield publications");
		book.setPublisher(publisher);
		Publisher2 publisher2=new Publisher2("710", "Burrows Publication");
		book.setPublisher2(publisher2);
		ArrayList<Distributor> distList=new ArrayList();
		distList.add(new Distributor(1, "Micheal Scofield", "Sona"));
		distList.add(new Distributor(2, "Lincon Burrows", "Fox River"));
		book.setDistList(distList);



		BookDao dao=new BookDao();
		System.out.println(dao.saveBook(book));
		*/
		BookDao dao=new BookDao();
		/*Book book= dao.getBook(103);
		System.out.println(book);*/

		ArrayList<Book> books=(ArrayList<Book>)dao.filterBooks();

		for(Book book:books){
		System.out.println(book);
		}
		
		/*Book book=dao.getBook("Peaky Blinders");
		System.out.println(book);
*/
		}

}

