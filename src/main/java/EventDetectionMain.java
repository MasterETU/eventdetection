/**
 * Created by tolga on 21.10.2016.
 */
import weka.core.Instances;
import weka.core.SystemInfo;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.core.converters.JSONLoader;


import java.io.File;

public class EventDetectionMain {
    public static void main(String [] args) throws Exception {

        ClassLoader classLoader = EventDetectionMain.class.getClassLoader();
        File bombaJson = new File(classLoader.getResource("bomba.json").getFile());

        JSONLoader jsonLoader = new JSONLoader();
        jsonLoader.setSource(bombaJson);
        jsonLoader.getStructure().numClasses();
        //jsonLoader.getDataSet();


//        // load CSV
//        CSVLoader loader = new CSVLoader();
//        loader.setSource(new File(args[0]));
//        Instances data = loader.getDataSet();
//
//        // save ARFF
//        ArffSaver saver = new ArffSaver();
//        saver.setInstances(data);
//        saver.setFile(new File(args[1]));
//        saver.setDestination(new File("bomba.arff"));
//        saver.writeBatch();
    }
}
