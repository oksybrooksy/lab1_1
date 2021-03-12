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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }
}
