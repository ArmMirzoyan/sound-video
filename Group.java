public class Group {
    private String id;
    private String name;

    public Group(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group Name: " + this.name + ", Group Id: " + this.id;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        return Integer.compare(Integer.parseInt(getId()),  Integer. parseInt(this.getId())) == 0;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
