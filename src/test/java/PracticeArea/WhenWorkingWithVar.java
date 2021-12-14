package PracticeArea;


import lombok.var;
import org.junit.Test;


public class WhenWorkingWithVar {

    //var cant be used as class member
    String test = "alphabet";

    @Test
    public void canBeUsedToReplaceStringIntList(){
        var exam = "google";
        var centreNumber = 542 ;

        System.out.println(exam );
        System.out.println(centreNumber );

    }
}
