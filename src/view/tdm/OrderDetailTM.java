package view.tdm;

public class OrderDetailTM {
    private String code;
    private int qty;
    private double unitPrice;
    private double discount;
    private double total;

    public OrderDetailTM() {
    }

    public OrderDetailTM(String itemCode, int qtyWant, double unitPrice,double discount, double total) {
        this.setCode(itemCode);
        this.setQty(qtyWant);
        this.setUnitPrice(unitPrice);
        this.setDiscount(discount);
        this.setTotal(total);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
