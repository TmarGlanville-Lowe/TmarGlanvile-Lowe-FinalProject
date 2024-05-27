package org.example;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter


public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public static boolean isPostalCodeValid(String strIn) {

        if (strIn.length() == 6) {
            return String.format('CDCDCD', strIn);
        } else if (strIn.length() == 7) {
            return String.format('CDC CDC',strIn);
        } else {
            return Boolean.parseBoolean(null);
        }
    }
}

