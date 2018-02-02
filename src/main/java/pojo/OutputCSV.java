package pojo;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",",generateHeaderColumns=true)
public class OutputCSV implements Serializable {

    private static final long serialVersionUID = 1L;

    @DataField(pos = 1, required = true)
    private String product_id;

    @DataField(pos = 2, required = true)
    private String product_name;               

    @DataField(pos = 3, required = true)
    private String primary_product_category_id; 

    @DataField(pos = 4, required = true)
    private String add_to_categories;

    @DataField(pos = 5, required = true)
    private String product_sku; 

    @DataField(pos = 6, required = true)
    private String parent_product_sku;

    @DataField(pos = 7, required = true)
    private String short_description;

    @DataField(pos = 8, required = true)
    private String long_description;

    @DataField(pos = 9, required = true)
    private String list_price;

    @DataField(pos = 10, required = true)
    private String hsh_code;

    @DataField(pos = 11, required = true)
    private String start_selling_date;

    @DataField(pos = 12, required = true)
    private String is_serialized;           

    @DataField(pos = 13, required = true)
    private String is_degital;

    @DataField(pos = 14, required = true)
    private String weight;

    @DataField(pos = 15, required = true)
    private String weight_uom_id;

    @DataField(pos = 16, required = true)
    private String height;

    @DataField(pos = 17, required = true)
    private String dept;

    @DataField(pos = 18, required = true)
    private String dimension_uom_id;

    @DataField(pos = 19, required = true)
    private String product_url_name;

    @DataField(pos = 20, required = true)
    private String publish;

    @DataField(pos = 21, required = true)
    private String sales_channel;       

    @DataField(pos = 22, required = true)
    private String bar_code;

    @DataField(pos = 23, required = true)
    private String MPN;                     //

    @DataField(pos = 24, required = true)
    private String currency_uom_id;         //

    @DataField(pos = 25, required = true)
    private String features;

    @DataField(pos = 26, required = true)
    private String manufacturer_party_name; //

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getProductId() {
        return product_id;
    }

    public void setProductId(String product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    public String getPrimaryProductCategoryId() {
        return primary_product_category_id;
    }

    public void setPrimaryProductCategoryId(String primary_product_category_id) {
        this.primary_product_category_id = primary_product_category_id;
    }

    public String getAddToCategories() {
        return add_to_categories;
    }

    public void setAddToCategories(String add_to_categories) {
        this.add_to_categories = add_to_categories;
    }

    public String getProductSKU() {
        return product_sku;
    }

    public void setProductSKU(String product_sku) {
        this.product_sku = product_sku;
    }

    public String getParentProductSKU() {
        return parent_product_sku;
    }

    public void setParentProductSKU(String parent_product_sku) {
        this.parent_product_sku = parent_product_sku;
    }

    public String getShortDescription() {
        return short_description;
    }

    public void setShortDescription(String short_description) {
        this.short_description = short_description;
    }

    public String getLongDescription() {
        return long_description;
    }

    public void setLongDescription(String long_description) {
        this.long_description = long_description;
    }

    public String getListPrice() {
        return list_price;
    }

    public void setListPrice(String list_price) {
        this.list_price = list_price;
    }

    public String getHashCode() {
        return hsh_code;
    }

    public void setHashCode(String hsh_code) {
        this.hsh_code = hsh_code;
    }

    public String getStartSellingDate() {
        return start_selling_date;
    }

    public void setStartSellingDate(String start_selling_date) {
        this.start_selling_date = start_selling_date;
    }

    public String getIsSerialized() {
        return is_serialized;
    }

    public void setIsSerialized(String is_serialized) {
        this.is_serialized = is_serialized;
    }

    public String getIsDegital() {
        return is_degital;
    }

    public void setIsDegital(String is_degital) {
        this.is_degital = is_degital;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUOMId() {
        return weight_uom_id;
    }

    public void setWeightUOMId(String weight_uom_id) {
        this.weight_uom_id = weight_uom_id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDimensionUOMId() {
        return dimension_uom_id;
    }

    public void setDimensionUOMId(String dimension_uom_id) {
        this.dimension_uom_id = dimension_uom_id;
    }

    public String getProductURLName() {
        return product_url_name;
    }

    public void setProductURLName(String product_url_name) {
        this.product_url_name = product_url_name;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getSales_channel() {
        return sales_channel;
    }

    public void setSalesChannel(String sales_channel) {
        this.sales_channel = sales_channel;
    }

    public String getBarCode() {
        return bar_code;
    }

    public void setBarCode(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getMPN() {
        return MPN;
    }

    public void setMPN(String mPN) {
        MPN = mPN;
    }

    public String getCurrencyUOMId() {
        return currency_uom_id;
    }

    public void setCurrencyUOMId(String currency_uom_id) {
        this.currency_uom_id = currency_uom_id;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getManufacturerPartyName() {
        return manufacturer_party_name;
    }

    public void setManufacturerPartyName(String manufacturer_party_name) {
        this.manufacturer_party_name = manufacturer_party_name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product_name == null) ? 0 : product_name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OutputCSV other = (OutputCSV) obj;
        if (product_name == null) {
            if (other.product_name!= null)
                return false;
        } else if (!product_name.equals(other.product_name))
            return false;
        return true;
    }
}