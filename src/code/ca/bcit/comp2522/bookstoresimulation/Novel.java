package ca.bcit.comp2522.bookstoresimulation;

/**
 * Models a Novel, which has a title, author name, and year published.
 *
 * @author Mischa Potter
 * @author Shivika Kapoor
 * @version 1.0
 */
class Novel
{
    final private String title;
    final private String authorName;
    final private int    yearPublished;

    /**
     * Constructs a Novel with a title, author name, and year published.
     *
     * @param title         the title of the novel
     * @param authorName    the author who wrote the novel
     * @param yearPublished the year the novel was published
     */
    Novel(final String title,
          final String authorName,
          final int yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);

        this.title         = title;
        this.authorName    = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of this Novel.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the author's name of this Novel.
     *
     * @return the author's name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Gets the year published of this Novel.
     *
     * @return the year published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Prints the instance data of this Novel.
     *
     * @return a formatted string
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append("Title: ");
        builder.append(title);
        builder.append("\nAuthor Name: ");
        builder.append(authorName);
        builder.append("\nYear Published: ");
        builder.append(yearPublished);

        return builder.toString();
    }

    /*
     * Validates the title.
     *
     * @param title the title to be validated
     */
    private static void validateTitle(final String title)
    {
        if (title == null || title.isEmpty())
        {
            throw new IllegalArgumentException("Invalid title: " + title);
        }
    }

    /*
     * Validates the author's name.
     *
     * @param authorName the author name to be validated
     */
    private static void validateAuthorName(final String authorName)
    {
        if (authorName == null || authorName.isEmpty())
        {
            throw new IllegalArgumentException("Invalid author: " + authorName);
        }
    }
}
