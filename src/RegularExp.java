public class RegularExp {

    //Email
    static final String email = "^[a-zA-Z0-9_-]+@[a-z.]+\\.[a-z]{2,}$";

    //Password
    static final String password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[_@%!#\\$\\^&\\.\\*()\\=\\-]).{8,16}$";
    // Atleast 1 capital, 1 number, 1 special character, 1 small character

    //Contact number
    static final String contact = "^(\\+91)?\\d{10}$";

    //Date(dd-mm-yyyy)
    static final String date = "^\\d{2}-\\d{2}-\\d{4}$";

}
