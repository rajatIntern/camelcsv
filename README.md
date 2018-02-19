### CamelCSV is the demo application to prepare output CSV from input CSV using camel bindy component (http://camel.apache.org/bindy.html) in java DSL route.

**Directory information**

```bash
├── camelcsv.iml
├── inbox (Contain the input and output sample CSV)
│   ├── inputFile 
│   │   └── inputProducts.csv
│   └── outputFile
│       └── outputProduct.csv
├── pom.xml
├── README.md
├── src
│   └── main
│       └── java
│           ├── Main.java (Starting file)
│           ├── pojo
│           │   ├── InputCSV.java (Structure of Input CSV)
│           │   └── OutputCSV.java (Structure of Output CSV)
│           └── processor
│               └── Processor.java (This file will iterate over the each record of CSV and prepare the Output CSV, here is the logic for setting up the column values of output CSV from input CSV.)
└── target (File generated after compilation)
    ├── ....
    ├── ....
                    
```

Here is the execution of the application for generating output CSV from input.

**Step 1**

The camel DSL get the file from defined directory **inbox/inputFile?fileName=inputProducts.csv** then unmarshal the given file according to given POJO model object https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/pojo/InputCSV.java.

Code in main Java file https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/Main.java
```
from("file:inbox/inputFile?fileName=inputProducts.csv&noop=true")
    .split().tokenize("\n", 10)
    .unmarshal(inputCSV)
```

We have also define the POJO model for output CSV (https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/pojo/OutputCSV.java) used by processor in step 2.

**Step 2**

Then unmarshal object passed to bean processor for processing. Here we iterate the CSV and prepare the rows of Output CSV
https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/processor/Processor.java.


Code main Java file https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/Main.java
```
.bean(Processor.class, "processCSV")
```

###### Addition information
1. This code is responsible for setting the column value for output CSV
https://github.com/rajatIntern/camelcsv/blob/cffe019f2c312fadbcc93ebb06c7df71821a4672/src/main/java/processor/Processor.java#L33
**We can put our custom logic here.**

2. generateHeaderColumns=true is responsible for generating the header in output CSV.
https://github.com/rajatIntern/camelcsv/blob/cffe019f2c312fadbcc93ebb06c7df71821a4672/src/main/java/pojo/OutputCSV.java#L8


**Step 3**

Now the output of Processor class is marshalled into outputCSV using pojo model object and save it to **inbox/outputFile?fileName=outputProduct.csv** using file component.

Code in main Java file https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/Main.java
```
.marshal(outputCSV)
.to("file:inbox/outputFile?fileName=outputProduct.csv");
```

---

**Sample Input CSV**

|Created Date|Item Number|Code|Product|Node|Brand|Product Category|Master Type|
|-------------|---------|---------|----------------|---------|---------|---------|--------------|
|23-07-2014|109655|GC051SASW|LG REF GC051SASW|FRIDGE|LG|Fridge|Products - Batches and Serial No|
|12-10-2015|127950|GCB207GAQV|LG REF GCB207GAQV ARTLINE|FRIDGE|LG|Fridge|Products - Batches and Serial No|


---

**Sample Output CSV**

|product_id|product_name|primary_product_category_id|add_to_categories|product_sku|parent_product_sku|short_description|long_description|list_price|hsh_code|start_selling_date|is_serialized|is_degital|weight|weight_uom_id|height|dept|dimension_uom_id|product_url_name|publish|sales_channel|bar_code|MPN|currency_uom_id|features|manufacturer_party_name|
|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|---------|
|null|LGREFGC051SASW|Fridge|null|109655|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|GC051SASW|null|null|LG|
|null|LGREFGCB207GAQVARTLINE|Fridge|null|127950|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|GCB207GAQV|null|null|LG|
