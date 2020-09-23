public class Player {
    private int id;
    private String name;
    private int jerseyNo;

    public Player(int id, String name, int jerseyNo) {
        this.id = id;
        this.name = name;
        this.jerseyNo = jerseyNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }
}
