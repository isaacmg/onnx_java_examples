import org.bytedeco.javacpp.*;
import org.datavec.image.loader.NativeImageLoader;
import org.deeplearning4j.nn.api.Model;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler;

import javax.imageio.ImageIO;

import static org.bytedeco.javacpp.onnx.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class LoadModelONNX {
    private INDArray image = null;
    private ModelProto model = null;
    private INDArray result = null;

    LoadModelONNX(String weight_path){
        OpSchemaVector allSchemas = OpSchemaRegistry.get_all_schemas();
        System.out.println(allSchemas.size());
        try{
            byte[] bytes = Files.readAllBytes(Paths.get(weight_path));
            model = new ModelProto();

            ParseProtoFromBytes(model, new BytePointer(bytes), bytes.length);

            System.out.println(model.graph().input_size());
        }
        catch (java.io.IOException e){
            System.out.println(e);

        }


    }

    public void preprocessImage(String imagePath){
        NativeImageLoader testLoader = new NativeImageLoader(224,224,3);
        BufferedImage img = null;
        try{

            //URL url = new URL("https://healthjade.com/wp-content/uploads/2018/02/Linear_atelectasis.jpg");
            img= ImageIO.read(new File(imagePath));
            //URLConnection connection = url.openConnection();
            //connection.setRequestProperty("User-Agent", "Mozilla/5.0 (iPad; U; CPU OS 3_2_1 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Mobile/7B405");
            image = testLoader.asRowVector(img);
            ImagePreProcessingScaler scaler = new ImagePreProcessingScaler(0, 1);
            scaler.transform(image);


        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void predict(){
            // TODO implement

    }



}

