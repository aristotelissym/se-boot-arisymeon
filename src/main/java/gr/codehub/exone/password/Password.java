package gr.codehub.exone.password;

public class Password {
    RegExp regExp = new RegExp();
    Validator validator = new Validator();

    public void Password() {

        //Ex301
        regExp.passwordReader();

        //Ex302
        validator.mainValidator();
    }
}
