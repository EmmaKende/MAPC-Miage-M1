public class File extends FileImpl {

    private StringBuilder content;

    public File(String name, Owner o) {
        super(name, o);
    }

    @Override
    public String getContent() {
        return this.content.toString() + getName();
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public void appendContent(String content) {
           this.content.toString();  
    }

    @Override
    public void setOwner(Owner owner) {
     
    }

    @Override
    public boolean isComposite() {
        return false;
    }

}
