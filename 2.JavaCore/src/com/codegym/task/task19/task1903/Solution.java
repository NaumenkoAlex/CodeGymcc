package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private final IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            String name = String.format("%s, %s", data.getContactLastName(), data.getContactFirstName());
            return name;
        }

        @Override
        public String getPhoneNumber() {
            StringBuilder phone = new StringBuilder();
            //phone.append(data.getCountryCode());
            String temp = ((Integer)(data.getPhoneNumber())).toString();
            if (temp.length()<10)
                for (int i = temp.length(); i < 10; i++) {
                    phone.append("0");
                }
            phone.append(temp);
            try {
                MaskFormatter format = new MaskFormatter("(###)###-##-##");
                format.setValueContainsLiteralCharacters(false);
                temp = format.valueToString(phone.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return "+" + data.getCountryPhoneCode() + temp;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }
}