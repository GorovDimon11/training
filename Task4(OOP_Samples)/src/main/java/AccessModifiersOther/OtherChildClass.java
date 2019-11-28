package AccessModifiersOther;

import AccessModifiersMain.ParentClass;

public class OtherChildClass extends ParentClass {
    public void otherMethod() {
        int intValue;
        intValue = publicValue;
        intValue = protectedValue;
        //intValue = defaultValue;
        intValue = getDefaultValue();
        //intValue = privateValue;
        intValue = getPrivateValue();
    }
}
