import java.util.List;

public class Repertoire extends FileImpl implements Composite{

    private List<Composant> children;

    public Repertoire(String name, Owner o) {
        super(name, o);
    }

    @Override
    public String getContent() {
        StringBuilder s = new StringBuilder();
        for(Composant comp :children){
            s.append(comp.getName());
        }
        return s.toString();
    }

    @Override
    public int getSize() {
        int size= 0;
        for(Composant c : children){
            size+= c.getSize();
        }
        return size;
    }

    @Override
    public void appendContent(String content) {
        
    }

    @Override
    public void setOwner(Owner owner) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isComposite() {
       
        return true;
    }

    @Override
    public List<Composant> getChildren() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addChild(Object t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean removeChild(Object t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeChildren(List t) {
        // TODO Auto-generated method stub
        return false;
    }

    
}
