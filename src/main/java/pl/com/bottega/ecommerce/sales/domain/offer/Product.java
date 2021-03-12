package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {
    private String productId;
    private String productName;
    private String productType;
    private Date productSnapshotDate;

    public Product(String productId, String productName, String productType, Date productSnapshotDate) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productSnapshotDate = productSnapshotDate;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }
}
