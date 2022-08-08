public class Main {

    public static void main(String[] args) {

        MagicBox<Integer> integerMagicBox = new MagicBox<>(3);
        MagicBox<String> stringMagicBox = new MagicBox<>(2);
        integerMagicBox.add(13);
        integerMagicBox.add(7);
        integerMagicBox.add(23);
        stringMagicBox.add("Я красавчик");
        stringMagicBox.add("Удалец");
        stringMagicBox.add("Я не красавчик");
        System.out.println(integerMagicBox.pick());
        System.out.println(stringMagicBox.pick());
    }

}
