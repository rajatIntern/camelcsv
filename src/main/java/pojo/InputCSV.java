package pojo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

    @CsvRecord(separator = ",",skipFirstLine=true)
    public class InputCSV {

        @DataField(pos = 1, required =true)
        private String createdDate;

        @DataField(pos = 2, required = true)
        private String itemNumber;

        @DataField(pos = 3, required = true)
        private String code;

        @DataField(pos = 4, required = true)
        private String productName;

        @DataField(pos = 5, required = true)
        private String node;

        @DataField(pos = 6, required = true)
        private String brand;

        @DataField(pos = 7, required = true)
        private String productCategory;

        @DataField(pos = 8, required = true)
        private String masterType;

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public String getItemNumber() {
            return itemNumber;
        }

        public void setItemNumber(String itemNumber) {
            this.itemNumber = itemNumber;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(String productCategory) {
            this.productCategory = productCategory;
        }

        public String getMasterType() {
            return masterType;
        }

        public void setMasterType(String masterType) {
            this.masterType = masterType;
        }
    }