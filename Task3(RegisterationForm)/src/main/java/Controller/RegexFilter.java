package Controller;

public interface RegexFilter {
    String REGEX_LANGUAGE = "^[1-2]{0,2}";

    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";

    String REGEX_LOGIN = "^[A-Za-z0-9_-]{5,20}$";

    String REGEX_MOBILE_NUMBER = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10,12}$";

    String REGEX_HOME_NUMBER = "^\\d{3,4}\\d{5,10}$";

    String REGEX_EMAIL = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$";

    String REGEX_SKYPE = "^[A-Za-z0-9_-]{4,20}$";

    String REGEX_CITY_UKR =  "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє'-]{1,50}$";
    String REGEX_CITY_LAT =  "^[A-Z][a-z]{1,30}$";

    String REGEX_STREET_UKR =  "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє'-]{1,50}$";
    String REGEX_STREET_LAT =  "^[A-Z][a-z]{1,50}$";

    String REGEX_BUILDING_NUMBER = "^[]?\\d+$";
    String REGEX_APARTMENTS_NUMBER = "^[]?\\d+$";

}
