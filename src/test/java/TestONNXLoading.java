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
      LoadModelONNX chest_model =  new LoadModelONNX("chexnet-py.onnx");
      System.out.println("Model loaded");
      assertEquals(1, 1);

   }
   @Test
   public void testLoadImage(){
       LoadModelONNX chestModel =  new LoadModelONNX("chexnet-py.onnx");
       chestModel.preprocessImage("./text.jpg");
       System.out.println("Image sucessfully preprocessed");




   }
   @ Test

   public void testPrediction(){
       ONNXJep theLoader = new ONNXJep("s","s");

   }

}


