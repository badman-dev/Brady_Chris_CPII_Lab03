import java.util.ArrayList;
public class ShortWordFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        if (((String)x).length() < 5) {
            return true;
        }
        return false;
    }
}
