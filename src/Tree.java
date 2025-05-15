import javax.lang.model.type.NullType;
import java.util.ArrayList;
public class Tree {
    private ArrayList<Tree> subtrees;
    private Object value;
    public Tree(){
        this.value = null;
        this.subtrees = new ArrayList<>();
    }
    public Tree(Object value){
        this.value = value;
        this.subtrees = new ArrayList<>();
    }
    public Tree(Object value, ArrayList<Tree> subtrees){
        this.value = value;
        this.subtrees = subtrees;
    }

    public void insert(Object value){
        // TODO: Finish method
    }
    public void remove(Object value){
        // TODO: Finish method
    }
    public boolean contains(Object value){
        // TODO: Finish method
    }
    public boolean isEmpty(Object value){
        // TODO: Finish method
    }

    public int count(Object value){
        // TODO: Finish method
    }

    public void size(Object value){
        // TODO: Finish method
    }

    public String toString(){
        // TODO: Finish method
    }

}
