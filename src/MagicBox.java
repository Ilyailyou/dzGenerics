import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public MagicBox (int size) {
        this.items = (T[]) new Object[size];
    }
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
              this.items[i] = item;
              return true;
            }
        }
        return false;
    }
    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Массив неполный, заполните его");
            }
        }
        Random random = new Random();
        int id = random.nextInt(items.length);
        return items[id];
    }

}
