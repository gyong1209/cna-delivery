
package demo;

public class Ordered extends AbstractEvent {

    private Long id;
    private Long produectId;
    private Integer qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProduectId() {
        return produectId;
    }

    public void setProduectId(Long produectId) {
        this.produectId = produectId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
