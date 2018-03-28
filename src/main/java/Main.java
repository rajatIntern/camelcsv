import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.DataFormat;

import pojo.InputCSV;
import pojo.OutputCSV;
import processor.Processor;

public class Main {
    public static void main(String args[]) throws Exception {
        CamelContext context = new DefaultCamelContext();
        final DataFormat inputCSV = new BindyCsvDataFormat(InputCSV.class);
        final DataFormat outputCSV = new BindyCsvDataFormat(OutputCSV.class);

        context.addRoutes(new RouteBuilder() { 
            @Override 
            public void configure() throws Exception {  
                from("file:inbox/inputFile?fileName=inputProducts.csv&noop=true")
                    .split().tokenize("\\n", 10)
                    .unmarshal(inputCSV)
                    .bean(Processor.class, "processCSV")
                    .marshal(outputCSV)
                    .to("file:inbox/outputFile?fileName=outputProduct.csv");
            } 
        }); 
        context.start();
        Thread.sleep(5000);
        context.stop();
    }
}
