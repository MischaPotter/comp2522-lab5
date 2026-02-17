package ca.bcit.comp2522.bookstoresimulation;

import java.util.List;

/**
 * Class description.
 *
 * @author Mischa Potter
 * @author Shivika Kapoor
 * @version 1.0
 */
class Main
{
    public static void main(final String [] args)
    {
        final Bookshop bookshop;

        bookshop = new Bookshop();

        bookshop.print_TITLES_W_IT();
        bookshop.removeTITLES_THE();
        bookshop.printSorted();
    }
}
