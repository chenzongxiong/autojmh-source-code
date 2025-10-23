package fr.inria.autojmh.tool;

import fr.inria.autojmh.generators.AJMHGenerator;

/**
 * Entry point for the AutoJMH tool
 *
 * Created by marodrig on 27/10/2015.
 */
public class Tool {

    public static void main(String[] args) throws Exception {
        AJMHConfiguration conf = AJMHConfiguration.fromArgs(args);
        // conf.setInputProjectPath("C:\\MarcelStuff\\DATA\\PHD\\jmhrealbugs");
        // conf.setWorkingDir("C:\\MarcelStuff\\DATA\\PHD\\jmhrealbugs_work");
        // conf.setGenerationOutputPath("C:\\MarcelStuff\\DATA\\PHD\\jmhrealbugs-benchmark");

        AJMHGenerator generator = new AJMHGenerator(conf);
        generator.generate();
        System.out.println("----------In Tool-------------------");
    }

}
