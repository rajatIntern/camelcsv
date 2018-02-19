CamelCSV is the demo application to prepare output CSV from input CSV using camel bindy component in java DSL route.

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

The camel DSL get the file from defined route directory **inbox/inputFile?fileName=inputProducts.csv** then unmarshal the given file according to given pojo model object https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/pojo/InputCSV.java.

We have also define the POJO model for output CSV (https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/pojo/OutputCSV.java) used by process in step 2.

**Step 2**

Then unmarshal object send it to bean processor for processing. Here we iterate the CSV and prepare the rows of Output CSV
https://github.com/rajatIntern/camelcsv/blob/master/src/main/java/processor/Processor.java.

**Step 3**

After that we created outputcsv pojo model object and also use csvRecord annotation(This annotation is actual mapping of outputcsv file header this annotation tell camel bindy to where you want to place data field in header).

**Step 4**

Then we marshal processor class output into outputCSV pojo model object and save it to **inbox/outputFile?fileName=outputProduct.csv** using file component.


**Sample Input CSV**

Header: 

`Created Date|Item Number|Code|Product|Node|Brand|Product Category|Master Type`

Values: 

`23-07-2014|109655|GC051SASW|LG REF GC051SASW|FRIDGE|LG|Fridge|Products - Batches and Serial No`
`12-10-2015|127950|GCB207GAQV|LG REF GCB207GAQV ARTLINE|FRIDGE|LG|Fridge|Products - Batches and Serial No`

In this output CSV we only fetch the require field for output CSV file

**Sample Output CSV**

Header:

`product_id|product_name|primary_product_category_id|add_to_categories|product_sku|parent_product_sku|short_description|long_description|list_price|hsh_code|start_selling_date|is_serialized|is_degital|weight|weight_uom_id|height|dept|dimension_uom_id|product_url_name|publish|sales_channel|bar_code|MPN|currency_uom_id|features|manufacturer_party_name`

Value:

`null|LGREFGC051SASW|Fridge|null|109655|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|GC051SASW|null|null|LG`

`null|LGREFGCB207GAQVARTLINE|Fridge|null|127950|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|null|GCB207GAQV|null|null|LG`
