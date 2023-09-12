import java.util.ArrayList;

public class Collect {
    static ArrayList<Object> collectAll(Object[] objects, Filter filter) {
        ArrayList<Object> accepted = new ArrayList<>();
        for(Object o: objects) {
            if (filter.accept(o)) {
                accepted.add(o);
            }
        }
        return accepted;
    }
}
