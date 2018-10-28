import org.bytedeco.javacpp.*;
import org.junit.Test;
import java.awt.image.BufferedImage;
import static org.bytedeco.javacpp.onnx.*;
import static org.junit.Assert.assertEquals;
import org.datavec.image.loader.NativeImageLoader;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.*;


public class TestONNXLoading{



   @Test
   public void testModelLoaded(){
      //LoadModelONNX chest_model =  new LoadModelONNX("chexnet-py.onnx");
      System.out.println("Model loaded");
      assertEquals(1, 1);

   }
   @Test
   public void testLoadImage(){
      NativeImageLoader testLoader = new NativeImageLoader(224,224,3);
      BufferedImage img = null;
      try{

          //URL url = new URL("https://healthjade.com/wp-content/uploads/2018/02/Linear_atelectasis.jpg");
          img = ImageIO.read(new File("./text.jpg"));
          //URLConnection connection = url.openConnection();
          //connection.setRequestProperty("User-Agent", "Mozilla/5.0 (iPad; U; CPU OS 3_2_1 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Mobile/7B405");
         INDArray image = testLoader.asRowVector(img);
         ImagePreProcessingScaler scaler = new ImagePreProcessingScaler(0, 1);
         scaler.transform(image);

      }
      catch(IOException e){
         System.out.println(e);
      }




   }

}


