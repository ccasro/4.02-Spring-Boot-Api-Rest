package cat.itacademy.s04.s02.n01.fruit.services;

import cat.itacademy.s04.s02.n01.fruit.dto.FruitRequestDTO;
import cat.itacademy.s04.s02.n01.fruit.model.Fruit;
import cat.itacademy.s04.s02.n01.fruit.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository repository;

    public Fruit createFruit(FruitRequestDTO dto) {
        Fruit fruit = new Fruit(dto.name(), dto.weightInKilos());
        return repository.save(fruit);
    }
}
