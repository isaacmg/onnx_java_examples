import org.bytedeco.javacpp.*;
import org.junit.Test;

import static org.bytedeco.javacpp.onnx.*;
import static org.junit.Assert.assertEquals;

import java.nio.file.*;


public class TestONNXLoading{
   LoadModelONNX chest_model =  new LoadModelONNX("chexnet-py.onnx");

   @Test
   public void testModelLoaded(){
      assertEquals(1, 1);

   }

}


