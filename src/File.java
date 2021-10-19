public class File extends FileImpl implements StringBuilder {

    private StringBuilder content;

    public File(String name, Owner o) {
        super(name, o);
    }

    @Override
    public String toString(){
        return getContent();
    }

    @Override
    public String getContent() {
        return getName();
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public void appendContent(String content) {
        if(this.content == null) this.content.append(content);     
    }

    @Override
    public void setOwner(Owner owner) {
     
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void append(String content) {
        this.content.append(content);
        
    }
    
}
