package processor;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.camel.Exchange;
import org.apache.commons.collections4.CollectionUtils;

import pojo.InputCSV;
import pojo.OutputCSV;

public class Processor {

    @SuppressWarnings("unchecked")
    public static Collection<OutputCSV> processCSV(Exchange exchange)throws Exception {
        
        Collection<InputCSV> inputCSV = new ArrayList<InputCSV>();
        Collection<OutputCSV> outputCSV = new ArrayList<OutputCSV>();

        if (exchange.getIn().getBody() != null) {
            inputCSV = (Collection<InputCSV>) exchange.getIn().getBody();
        }
        if (CollectionUtils.isNotEmpty(inputCSV)) {
            for (InputCSV inputRow : inputCSV) {
                OutputCSV  outputRow = new OutputCSV();
                prepareOutputCSV(inputRow, outputRow);
                outputCSV.add(outputRow);
            }
        }
        return outputCSV;
    }

    private static void prepareOutputCSV(InputCSV inputRow, OutputCSV outputRow) {
        outputRow.setProductName(inputRow.getProductName());
        outputRow.setPrimaryProductCategoryId(inputRow.getProductCategory());
        outputRow.setProductSKU(inputRow.getItemNumber());
        outputRow.setMPN(inputRow.getCode());
        outputRow.setManufacturerPartyName(inputRow.getBrand());
    }
}