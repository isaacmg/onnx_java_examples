import org.bytedeco.javacpp.*;
import org.junit.Test;

import static org.bytedeco.javacpp.onnx.*;
import static org.junit.Assert.assertEquals;

import java.nio.file.*;


public class TestONNXLoading{



   @Test
   public void testModelLoaded(){
      LoadModelONNX chest_model =  new LoadModelONNX("chexnet-py.onnx");
      System.out.println("Model loaded");
      assertEquals(1, 1);

   }

}


