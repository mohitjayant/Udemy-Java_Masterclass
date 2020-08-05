package Abstract_Class_Challange;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return this.right;
    }

    @Override
    protected ListItem setNext(ListItem item) {
        this.right=item;
        return this.right;
    }

    @Override
    protected ListItem previous() {
        return this.left;
    }

    @Override
    protected ListItem setPrevious(ListItem item) {
        this.left=item;
        return this.left;
    }

    @Override
    protected int compareTo(ListItem item) {
        if (item!=null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else {
            return -1;
        }
    }
}
