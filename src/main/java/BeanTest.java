import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album testAlbum = new Album();
        Author testAuthor1 = new Author();
        Author testAuthor2 = new Author();
        Author testAuthor3 = new Author();
        Quote testQuote1 = new Quote();
        Quote testQuote2 = new Quote();
        Quote testQuote3 = new Quote();
        Quote testQuote4 = new Quote();
        Quote testQuote5 = new Quote();
        ArrayList<Quote> quoteArrayList = new ArrayList<>();
        testAuthor1.setId(1);
        testAuthor1.setFirstName("Douglas");
        testAuthor1.setLastName("Adams");
        testAuthor2.setId(2);
        testAuthor2.setFirstName("Mark");
        testAuthor2.setLastName("Twain");
        testAuthor3.setId(3);
        testAuthor3.setFirstName("Kurt");
        testAuthor3.setLastName("Vonnegut");
        testQuote1.setId(1);
        testQuote1.setAuthor(testAuthor1);
        testQuote1.setContent("I love deadlines. I love the whooshing noise they make as they go by.");
        testQuote2.setId(2);
        testQuote2.setAuthor(testAuthor1);
        testQuote2.setContent("Don't Panic.");
        testQuote3.setId(3);
        testQuote3.setAuthor(testAuthor1);
        testQuote3.setContent("Time is an illusion. Lunchtime doubly so.");
        testQuote4.setId(4);
        testQuote4.setAuthor(testAuthor2);
        testQuote4.setContent("Clothes make the man. Naked people have little or no influence on society.");
        testQuote5.setId(5);
        testQuote5.setAuthor(testAuthor3);
        testQuote5.setContent("The universe is a big place, perhaps the biggest.");
        quoteArrayList.add(testQuote1);
        quoteArrayList.add(testQuote2);
        quoteArrayList.add(testQuote3);
        quoteArrayList.add(testQuote4);
        quoteArrayList.add(testQuote5);
        for (Quote quote : quoteArrayList) {
            System.out.printf("\"%s\"\n\t-%s %s\n", quote.getContent(), quote.getAuthor().getFirstName(), quote.getAuthor().getLastName());
        }
    }
}