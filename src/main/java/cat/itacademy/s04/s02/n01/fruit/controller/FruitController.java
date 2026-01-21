package cat.itacademy.s04.s02.n01.fruit.controller;


import cat.itacademy.s04.s02.n01.fruit.dto.FruitRequestDTO;
import cat.itacademy.s04.s02.n01.fruit.dto.FruitResponseDTO;
import cat.itacademy.s04.s02.n01.fruit.model.Fruit;
import cat.itacademy.s04.s02.n01.fruit.services.FruitService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruits")
@RequiredArgsConstructor
public class FruitController {

    private final FruitService service;

    @PostMapping
    public ResponseEntity<FruitResponseDTO> createFruit(@Valid @RequestBody FruitRequestDTO request) {
        Fruit saved = service.createFruit(request);
        FruitResponseDTO response = new FruitResponseDTO(saved.getId(), saved.getName(), saved.getWeightInKilos());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FruitResponseDTO> getFruitById(@PathVariable Long id) {
        return ResponseEntity.notFound().build();
    }
}
