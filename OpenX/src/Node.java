public class Node {

    public Node left, right;
    private final Integer value;
    private Boolean checked;

    public Node(Integer value, Boolean checked) {
        this.value = value;
        this.checked = checked;
    }

    public Integer getValue() {
        return value;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
