import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Deck deck = ctx.getBean("deck", Deck.class);

        System.out.println(deck);
        deck.changeOrder();




    }
}
