package nyc.c4q.operations.group1;

import nyc.c4q.operations.instructor.Customer;
import nyc.c4q.operations.instructor.GroceryItem;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Rafael on 9/13/16.
 */
public class JohnsonsBakery implements Bakery<BakedGood> {

    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public List<String> getSectionOfferings() {
        return null;
    }

    @Override
    public GroceryItem getItemFromSection(String name) {
        return null;
    }

    @Override
    public Map<BakedGood, String> getMenu() {
        return null;
    }

    @Override
    public Stack<BakedGood> getCurrentSelection() {
        return null;
    }
}
