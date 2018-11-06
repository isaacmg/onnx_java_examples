
import jep.Jep;

public class ONNXJep {
    ONNXJep(String weightPath, String modelName){
        try{
            // Load Jep
            Jep jep = new Jep();
            jep.eval("import sys");
            jep.eval("sys.setrecursionlimit(1500)");
            jep.eval("sys.argv  = ['']");
            jep.eval("from allennlp.predictors.predictor import Predictor");
            jep.eval("the_pred = Predictor.from_path(\"https://s3-us-west-2.amazonaws.com/allennlp/models/srl-model-2018.05.25.tar.gz\")");
            
            jep.eval("filename = os.path.realpath('.')");
            Object result1 = jep.getValue("filename");

            System.out.println(result1);

        }
        catch(Exception e){
            e.printStackTrace();


        }

    }
}

