package cat.itacademy.s04.s02.n01.fruit.exception;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(Long id) {
        super( "Fruit not found with id: " + id);
    }
}
