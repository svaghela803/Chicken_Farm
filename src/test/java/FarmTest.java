import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmTest {

    Farm farm;
    Chicken ginger;
    Chicken edwina;
    Chicken bunty;

    @BeforeEach
    public void setUp(){
        farm = new Farm("Tweedsdale");
        ginger = new Chicken("Ginger", 4);
        edwina = new Chicken("Edwina", 1);
        bunty = new Chicken("Bunty", 10);
        farm.addChicken(ginger);
        farm.addChicken(edwina);
        farm.addChicken(bunty);
    }

    @Test
    public void farmHasName(){
        assertThat(farm.getName()).isEqualTo("Tweedsdale");
    }

    @Test
    public void canCountChickens(){
        assertThat(farm.getChickenCount()).isEqualTo(3);
    }

    @Test
    public void canAddChickenToFarm(){
        Chicken mac = new Chicken("Mac", 2);
        farm.addChicken(mac); //note, 'mac' is added to farm only for this test
        assertThat(farm.getChickenCount()).isEqualTo(4);
    }

    @Test
    public void canCountEggsForSale(){
        assertThat(farm.getEggsForSale()).isEqualTo(0); // remains at 0 as no eggs have been collected (yet)
    }

    @Test
    public void canSetEggsForSale(){
        farm.setEggsForSale(8);
        assertThat(farm.getEggsForSale()).isEqualTo(8);
    }

    @Test
    public void canGetChickens(){
        assertThat(farm.getChickens().size()).isEqualTo(farm.getChickenCount());
    }

}
