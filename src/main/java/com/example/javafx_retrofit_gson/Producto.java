package com.example.javafx_retrofit_gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

public class Producto {
    public String id;
    public String productName;
    public String productLine;
    public String productScale;
    public String productVendor;
    public String productDescription;
    public int quantityInStock;
    public double buyPrice;
    public double mSRP;

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", productLine='" + productLine + '\'' +
                ", productScale='" + productScale + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", buyPrice=" + buyPrice +
                ", mSRP=" + mSRP +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getmSRP() {
        return mSRP;
    }

    public void setmSRP(double mSRP) {
        this.mSRP = mSRP;
    }
}
