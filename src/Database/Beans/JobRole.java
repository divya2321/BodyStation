package Database.Beans;

public class JobRole {

    /**
     * @return the idjobrole
     */
    public int getIdjobrole() {
        return idjobrole;
    }

    /**
     * @param idjobrole the idjobrole to set
     */
    public JobRole setIdjobrole(int idjobrole) {
        this.idjobrole = idjobrole;
        return this;
    }

    /**
     * @return the jobrole
     */
    public String getJobrole() {
        return jobrole;
    }

    /**
     * @param jobrole the jobrole to set
     */
    public JobRole setJobrole(String jobrole) {
        this.jobrole = jobrole;
        return this;
    }
    private int idjobrole;
    private String jobrole;
}
