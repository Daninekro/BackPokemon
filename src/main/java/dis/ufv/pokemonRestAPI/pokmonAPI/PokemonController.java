package dis.ufv.pokemonRestAPI.pokmonAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PokemonController {
    @GetMapping("/pokemons")
    public ArrayList<Pokemon> pokemons(){
        ArrayList<Pokemon> listaPokemons = new LectorJson().leeFicheroJson();
        return listaPokemons;
    }
}
