package cat.itacademy.s04.s02.n01.fruit.services;


import cat.itacademy.s04.s02.n01.fruit.dto.FruitRequestDTO;
import cat.itacademy.s04.s02.n01.fruit.model.Fruit;
import cat.itacademy.s04.s02.n01.fruit.repository.FruitRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FruitServiceTest {

    @Mock
    private FruitRepository repository;

    @InjectMocks
    private FruitService service;

    @Test
    void createFruitShouldSaveAndReturnFruit() {
        FruitRequestDTO request = new FruitRequestDTO("Banana", 3);
        Fruit savedFruit = new Fruit("Banana", 3);
        savedFruit.setId(1L);

        when(repository.save(any(Fruit.class))).thenReturn(savedFruit);

        Fruit result = service.createFruit(request);

        assertNotNull(result.getId());
        assertEquals("Banana", result.getName());
        assertEquals(3, result.getWeightInKilos());
        verify(repository, times(1)).save(any(Fruit.class));
    }
}
