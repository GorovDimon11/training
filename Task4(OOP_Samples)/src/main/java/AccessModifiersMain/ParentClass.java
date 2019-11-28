package AccessModifiersMain;

public class ParentClass {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void otherMethod() {
        int intValue;
        intValue = publicValue;
        intValue = protectedValue;
        intValue = defaultValue;
        intValue = privateValue;
    }

    public int getPublicValue() {
        return publicValue;
    }
    public void setPublicValue(int publicValue) {
        this.publicValue = publicValue;
    }
    public int getProtectedValue() {
        return protectedValue;
    }
    public void setProtectedValue(int protectedValue) {
        this.protectedValue = protectedValue;
    }
    public int getDefaultValue() {
        return defaultValue;
    }
    public void setDefaultValue(int defaultValue) {
        this.defaultValue = defaultValue;
    }
    public int getPrivateValue() {
        return privateValue;
    }
    public void setPrivateValue(int privateValue) {
        this.privateValue = privateValue;
    }
}

class OtherClassInFile {
    public void otherMethod() {
        int intValue;
        ParentClass parentClass = new ParentClass();
        intValue = parentClass.publicValue;
        intValue = parentClass.protectedValue;
        intValue = parentClass.defaultValue;
        //intValue = parentClass.privateValue;
        intValue = parentClass.getPrivateValue();
    }
}
