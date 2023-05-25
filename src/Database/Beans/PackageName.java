package Database.Beans;

public class PackageName {
    
    private int idPackageName;
    private String packageName;

    public String getPackageName() {
        return packageName;
    }

    public PackageName setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public int getIdPackageName() {
        return idPackageName;
    }

    public PackageName setIdPackageName(int idPackageName) {
        this.idPackageName = idPackageName;
        return this;
    }

    
}
