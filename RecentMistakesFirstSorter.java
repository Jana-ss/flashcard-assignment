import java.util.ArrayList;
import java.util.List;

public class RecentMistakesFirstSorter {

    public List<Card> organize(List<Card> cards) {

        List<Card> incorrect = new ArrayList<>();
        List<Card> correct = new ArrayList<>();

        for (Card card : cards) {
            if (card.wasAnsweredIncorrectlyLastRound()) {
                incorrect.add(card);
            } else {
                correct.add(card);
            }
        }

        incorrect.addAll(correct);
        return incorrect;
    }
}

