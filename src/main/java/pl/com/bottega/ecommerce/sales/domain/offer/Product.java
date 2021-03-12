package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {
    private String id;
    private String name;
    private String type;
    private Date snapshotDate;

    public Product(String productId, String productName, String productType, Date productSnapshotDate) {
        this.id = productId;
        this.name = productName;
        this.type = productType;
        this.snapshotDate = productSnapshotDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }
}
