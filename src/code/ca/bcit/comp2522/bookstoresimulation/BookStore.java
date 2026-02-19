package ca.bcit.comp2522.bookstoresimulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Class description.
 *
 * @author Mischa Potter
 * @author Shivika Kapoor
 * @version 1.0
 */
class BookStore
{
    final private static int DECADE_YEARS = 10;

    final private String      bookStoreName;
    final private List<Novel> inventory;

    BookStore(final String bookStoreName)
    {
        validateBookStoreName(bookStoreName);

        this.bookStoreName = bookStoreName;
        inventory          = new ArrayList<>();

        inventory.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        inventory.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        inventory.add(new Novel("American Pastoral", "Philip Roth", 1997));
        inventory.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        inventory.add(new Novel("Animal Farm", "George Orwell", 1946));
        inventory.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        inventory.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        inventory.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        inventory.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        inventory.add(new Novel("Atonement", "Ian McEwan", 2002));
        inventory.add(new Novel("Beloved", "Toni Morrison", 1987));
        inventory.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        inventory.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        inventory.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        inventory.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        inventory.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        inventory.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        inventory.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        inventory.add(new Novel("Catch-22", "Joseph Heller", 1961));
        inventory.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        inventory.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        inventory.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        inventory.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        inventory.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        inventory.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        inventory.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        inventory.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        inventory.add(new Novel("A Death in the Family", "James Agee", 1958));
        inventory.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        inventory.add(new Novel("Deliverance", "James Dickey", 1970));
        inventory.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        inventory.add(new Novel("Falconer", "John Cheever", 1977));
        inventory.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        inventory.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        inventory.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        inventory.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        inventory.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        inventory.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        inventory.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        inventory.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        inventory.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        inventory.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        inventory.add(new Novel("Herzog", "Saul Bellow", 1964));
        inventory.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        inventory.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        inventory.add(new Novel("I, Claudius", "Robert Graves", 1934));
        inventory.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        inventory.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        inventory.add(new Novel("Light in August", "William Faulkner", 1932));
        inventory.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        inventory.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        inventory.add(new Novel("Lord of the Flies", "William Golding", 1954));
        inventory.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        inventory.add(new Novel("Loving", "Henry Green", 1945));
        inventory.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        inventory.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        inventory.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        inventory.add(new Novel("Money", "Martin Amis", 1984));
        inventory.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        inventory.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        inventory.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        inventory.add(new Novel("Native Son", "Richard Wright", 1940));
        inventory.add(new Novel("Neuromancer", "William Gibson", 1984));
        inventory.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        inventory.add(new Novel("1984", "George Orwell", 1948));
        inventory.add(new Novel("On the Road", "Jack Kerouac", 1957));
        inventory.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        inventory.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        inventory.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        inventory.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        inventory.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        inventory.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        inventory.add(new Novel("Possession", "A.S. Byatt", 1990));
        inventory.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        inventory.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        inventory.add(new Novel("Rabbit, Run", "John Updike", 1960));
        inventory.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        inventory.add(new Novel("The Recognitions", "William Gaddis", 1955));
        inventory.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        inventory.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        inventory.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        inventory.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        inventory.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        inventory.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        inventory.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        inventory.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        inventory.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        inventory.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        inventory.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        inventory.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        inventory.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        inventory.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        inventory.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        inventory.add(new Novel("Ubik", "Philip K. Dick", 1969));
        inventory.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        inventory.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        inventory.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        inventory.add(new Novel("White Noise", "Don DeLillo", 1985));
        inventory.add(new Novel("White Teeth", "Zadie Smith", 2000));
        inventory.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }

    /**
     * Prints all the titles in uppercase.
     */
    public void printAllTitles()
    {
        for (final Novel book : inventory)
        {
            if (book != null)
            {
                System.out.println(book.getTitle().toUpperCase());
            }
        }
    }

    /**
     * Prints all titles that contain the specified parameter.
     *
     * @param title the specified parameter
     */
    public void printBookTitle(final String title)
    {
        for (final Novel book : inventory)
        {
            if (book != null && book.getTitle().toLowerCase().contains(title))
            {
                System.out.println(book);
            }
        }
    }

    /**
     * Prints all titles in alphabetical order (A-Z).
     */
    public void printTitlesInAlphaOrder()
    {
//        Collections.sort(inventory);
    }

    /**
     * Prints all books for the inputted decade IE 2000s -> print all book
     * titles from 2000 to 2009.
     *
     * @param decade the decade the books should be in
     */
    public void printGroupByDecade(final int decade)
    {
        // find decade. if input = 2000
        // in between 2000 to 20009
        // what if they give 1885?
        // remainder of 1000? = 885
        for (final Novel book : inventory)
        {
            if (book != null && (book.getYearPublished() >= decade && book.getYearPublished() < decade + DECADE_YEARS))
            {
                System.out.println(book);
            }
        }
    }

    /**
     * Finds the longest title of a Novel in the BookStore.
     */
    public void getLongest()
    {
        String longestTitle;
        longestTitle = inventory.getFirst().getTitle();

        for (final Novel book : inventory)
        {
            if (book != null && book.getTitle().length() > longestTitle.length())
            {
                longestTitle = book.getTitle();
            }
        }
        System.out.println(longestTitle);
    }

    /**
     * Checks if there is a Novel written in a specific year.
     *
     * @param year the year
     * @return true if there is a Novel written in the year
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        for (final Novel book : inventory)
        {
            if (book != null && book.getYearPublished() == year)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks how many Novels contain a word.
     *
     * @param word the word to check for
     * @return the number of Novels that contain this word
     */
    public int howManyBooksContain(final String word)
    {
        int foundBooks;
        foundBooks = 0;

        for (final Novel book : inventory)
        {
            if (book != null && book.getTitle().toLowerCase().contains(word))
            {
                foundBooks++;
            }
        }
        return foundBooks;
    }

    public double whichPercentWrittenBetween(final int first,
                                             final int last)
    {
        return 0.0;
    }

    /**
     * Finds the oldest Novel.
     *
     * @return the oldest Novel
     */
    public Novel getOldestBook()
    {
        Novel oldestBook;
        oldestBook = inventory.getFirst();
        for (final Novel book : inventory)
        {
            if (book != null && oldestBook.getYearPublished() > book.getYearPublished())
            {
                oldestBook = book;
            }
        }
        return oldestBook;
    }

    /**
     * Returns a List of all books whose title is a specific length.
     *
     * @param titleLength the length of the title of the books to be found
     * @return a list of books
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        final List<Novel> bookList;
        bookList = new ArrayList<>();

        for (final Novel book : inventory)
        {
            if (book != null && book.getTitle().length() == titleLength)
            {
                bookList.add(book);
            }
        }

        return bookList;
    }

    /**
     * Tests some of the BookStore and Novel methods.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args)
    {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;
        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " + oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }

    /*
     * Validates the book store's name.
     *
     * @param bookStoreName the book store name to be validated
     */
    private static void validateBookStoreName(final String bookStoreName)
    {
        if (bookStoreName == null || bookStoreName.isEmpty())
        {
            throw new IllegalArgumentException("Invalid book store name: " + bookStoreName);
        }
    }
}
