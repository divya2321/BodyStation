package Database.Beans;


public class UserAccount {

    /**
     * @return the userAccountID
     */
    public int getUserAccountID() {
        return userAccountID;
    }

    /**
     * @param userAccountID the userAccountID to set
     */
    public UserAccount setUserAccountID(int userAccountID) {
        this.userAccountID = userAccountID;;
        return this;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public UserAccount setUserId(int userId) {
        this.userId = userId;;
        return this;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public UserAccount setUsername(String username) {
        this.username = username;;
        return this;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public UserAccount setPassword(String password) {
        this.password = password;;
        return this;
    }

    /**
     * @return the recoverHint
     */
    public String getRecoverHint() {
        return recoverHint;
    }

    /**
     * @param recoverHint the recoverHint to set
     */
    public UserAccount setRecoverHint(String recoverHint) {
        this.recoverHint = recoverHint;;
        return this;
    }

    /**
     * @return the recoverAnswer
     */
    public String getRecoverAnswer() {
        return recoverAnswer;
    }

    /**
     * @param recoverAnswer the recoverAnswer to set
     */
    public UserAccount setRecoverAnswer(String recoverAnswer) {
        this.recoverAnswer = recoverAnswer;
        return this;
    }
    
    private int userAccountID, userId;
    private String username, password, recoverHint, recoverAnswer;
    
}
