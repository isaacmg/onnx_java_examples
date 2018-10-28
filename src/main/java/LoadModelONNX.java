import org.bytedeco.javacpp.*;
import static org.bytedeco.javacpp.onnx.*;
import java.nio.file.*;


public class LoadModelONNX {
    LoadModelONNX(String weight_path){
        OpSchemaVector allSchemas = OpSchemaRegistry.get_all_schemas();
        System.out.println(allSchemas.size());
        try{
            byte[] bytes = Files.readAllBytes(Paths.get(weight_path));
            ModelProto model = new ModelProto();

            ParseProtoFromBytes(model, new BytePointer(bytes), bytes.length);

            System.out.println(model.graph().input_size());
        }
        catch (java.io.IOException e){
            System.out.println(e);

        }




    }

}

