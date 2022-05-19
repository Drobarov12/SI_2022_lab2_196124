import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 siLab2 = new SILab2();

    List<String> first = new ArrayList<>();
    List<String> second = List.of("#","0","#");
    List<String> third = List.of("#","0","#","0","0","#","#","0","#");
    List<String> fourth = List.of("#","2","#","2","1","#","#","2","#");


    @Test
    void EveryNodeTest(){
        assertThrows(IllegalArgumentException.class,()->siLab2.function(first));
        assertThrows(IllegalArgumentException.class,()->siLab2.function(second));
        assertEquals(fourth,siLab2.function(third));

    }

    @Test
    void EveryBranchTest(){
        assertThrows(IllegalArgumentException.class,()->siLab2.function(first));
        assertThrows(IllegalArgumentException.class,()->siLab2.function(second));
        assertEquals(fourth,siLab2.function(third));
    }

}