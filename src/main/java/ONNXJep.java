
import jep.Jep;

public class ONNXJep {
    ONNXJep(String weightPath, String modelName){
        try{
            Jep jep = new Jep();
            jep.eval("from test.py import TestClass");
            jep.eval("t = TestClass()");
            jep.eval("t.result()");

        }
        catch(Exception e){

        }

    }
}

