import java.util.Date;

/**
 * Created by Nirox on 6/18/2015.
 */
public class Order {

    private int order;
    private Date creationDate;
    private String dateShipped;
    private String status;
    private Bill bill;

    public Order(int order, Date creationDate, String dateShipped, String status, Bill bill) {
        this.order = order;
        this.creationDate = creationDate;
        this.dateShipped = dateShipped;
        this.status = status;
        this.bill = bill;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
