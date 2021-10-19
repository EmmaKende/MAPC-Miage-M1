public class File extends FileImpl {

    public File(String name, Owner o) {
        super(name, o);
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void appendContent(String content) {
        
    }

    @Override
    public void setOwner(Owner owner) {
     
    }

    @Override
    public boolean isComposite() {
        return false;
    }
    
}
