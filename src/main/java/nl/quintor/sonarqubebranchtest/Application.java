package nl.quintor.sonarqubebranchtest;

import java.util.logging.Logger;

public class Application {
    private static final Logger LOG = Logger.getLogger(Application.class.toString());

    public static void main(String[] args) {
        new Application().run(args);

        System.out.println("Sonar Issue, yay");
    }

    public void run(String[] args) {
        LOG.info("Starting my fancy appie!");

        System.out.println("Introduce an error please.");

        if (isArrayEmpty(args)) {
            LOG.info("Args is empty");
        }
        else {
            LOG.info("Args is not empty");
        }
    }

    public boolean isArrayEmpty(String[] args) {
        return args.length == 0;
    }
}
