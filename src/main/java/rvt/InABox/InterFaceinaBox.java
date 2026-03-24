package rvt.InABox;

public class InterFaceinaBox {
    public static void main(String[] args){


    Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
    Book book2 = new Book("Robert Martin", "Clean Code", 1);
    Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

    Cd cd1 = new Cd("Pink Floyd", "Dark Side of the Moon", 1973);
    Cd cd2 = new Cd("Wigwam", "Nuclear Nightclub", 1975);
    Cd cd3 = new Cd("Rendezvous Park", "Closer to Being Here", 2012);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(cd1);
    System.out.println(cd2);
    System.out.println(cd3);

    }



}


