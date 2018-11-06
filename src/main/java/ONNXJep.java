
import jep.Jep;

public class ONNXJep {
    ONNXJep(String weightPath, String modelName){
        try{
            // Load Jep
            Jep jep = new Jep();
            jep.eval("from test import SemanticModel");
            jep.eval("t = SemanticModel()");
            jep.set("arg", "his name is jeff");
            jep.eval("t.predict(arg)");
            Object result1 = jep.getValue("x");
            System.out.println(result1);

        }
        catch(Exception e){
            e.printStackTrace();


        }

    }
}

