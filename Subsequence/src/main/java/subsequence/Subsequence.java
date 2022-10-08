package subsequence;

import java.util.List;

public class Subsequence {

    public boolean find(List x, List y) {
        int xElem = 0;
        int yElem = 0;
        if (x == null || y == null) {
            throw new IllegalArgumentException();
        }
        if (x.size() > y.size()) {
            return false;
        }
        while (xElem < x.size()) {
            Object Xitem = x.get(xElem);
            Object Yitem = y.get(yElem);
            while (!Xitem.equals(Yitem)) {
                if (++yElem > y.size() - 1) {
                    return false;
                }
                Yitem = y.get(yElem);
            }
            xElem++;
        }
        return true;
    }
}