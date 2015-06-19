/**
 * Created by Nirox on 6/18/2015.
 */
public class Bill {
    private long cost;
    private int[] discounts;
    private Order order;




    /**
     * This method return total cost with discounts
     * @return totalCost
     */

    public long calculateTotalCost(){
        long totalCost = getCost();
        for (int i = 0; i < getDiscounts().length; i++) {
            totalCost = getDiscounts()[i];
        }
        return totalCost;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    /**
     *
     * @return cost
     */
    public long getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public void setCost(long cost) {
        this.cost = cost;
    }

    /**
     *
     * @return discounts
     */
    public int[] getDiscounts() {
        return discounts;
    }

    /**
     *
     * @param discounts
     */
    public void setDiscounts(int[] discounts) {
        this.discounts = discounts;
    }
    /**
     *
     * @param cost
     * @param discounts
     * @param order
     */
    public Bill(long cost, int[] discounts, Order order) {
        this.cost = cost;
        this.discounts = discounts;
        this.order = order;
    }
}

