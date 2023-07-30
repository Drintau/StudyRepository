package drintau.designpattern.pattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    public final List<Filter> filters = new ArrayList<>(16);

    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index >= filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }

}
