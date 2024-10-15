import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<Dish> {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    @Override
    public Iterator<Dish> iterator() {
        return dishes.iterator();
    }
}
